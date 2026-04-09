package com.edutech.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static Properties properties=new Properties();
private static void loadProperties(){
    try(InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
        if(input ==null){
            throw new RuntimeException("application.properties file not found");
        }
        properties.load(input);
    }
    catch (IOException e){
        throw new RuntimeException("Error loading database properties",e);
    }
}
public static Connection getConnection()throws SQLException{
    if(properties.isEmpty()){
        loadProperties();
    }
    String url=properties.getProperty("db.url");
    String username=properties.getProperty("db.username");
    String password=properties.getProperty("db.password");
    String driver=properties.getProperty("db.driver");
    try{
        Class.forName(driver);
    }catch(ClassNotFoundException e){
        throw new RuntimeException("JDBC Driver not found",e);
    }
    return DriverManager.getConnection(url,username,password);
}
}

