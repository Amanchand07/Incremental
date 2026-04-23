package com.edutech.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
 private static final Properties PROPS = new Properties();
    private static volatile boolean initialized = false;

    private DatabaseConnectionManager() {
        
    }

    private static void loadProperties() {
        if (initialized) return;

        synchronized (PROPS) {
            if (initialized) return;

            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            String[] candidates = {
                "application.properties",
                "config/application.properties",
                "db.properties"
            };

            boolean loaded = false;
            for (String path : candidates) {
                try (InputStream in = cl.getResourceAsStream(path)) {
                    if (in != null) {
                        PROPS.load(in);
                        loaded = true;
                        break;
                    }
                } catch (IOException ignored) {
                    
                }
            }

            
            initialized = true;
        }
    }

    private static String firstNonBlank(String... values) {
        if (values == null) return null;
        for (String v : values) {
            if (v != null && !v.trim().isEmpty()) {
                return v.trim();
            }
        }
        return null;
    }

    public static Connection getConnection() throws SQLException {
        loadProperties();

        String url = firstNonBlank(
            
            PROPS.getProperty("db.url"),
            PROPS.getProperty("jdbc.url"),
            PROPS.getProperty("spring.datasource.url"),
            
            System.getProperty("db.url"),
            System.getProperty("jdbc.url"),
            System.getProperty("spring.datasource.url"),
            
            System.getenv("DB_URL"),
            System.getenv("JDBC_URL"),
            System.getenv("SPRING_DATASOURCE_URL")
        );

        String username = firstNonBlank(
            PROPS.getProperty("db.username"),
            PROPS.getProperty("jdbc.username"),
            PROPS.getProperty("spring.datasource.username"),
            System.getProperty("db.username"),
            System.getProperty("jdbc.username"),
            System.getProperty("spring.datasource.username"),
            System.getenv("DB_USERNAME"),
            System.getenv("JDBC_USERNAME"),
            System.getenv("SPRING_DATASOURCE_USERNAME")
        );

        String password = firstNonBlank(
            PROPS.getProperty("db.password"),
            PROPS.getProperty("jdbc.password"),
            PROPS.getProperty("spring.datasource.password"),
            System.getProperty("db.password"),
            System.getProperty("jdbc.password"),
            System.getProperty("spring.datasource.password"),
            System.getenv("DB_PASSWORD"),
            System.getenv("JDBC_PASSWORD"),
            System.getenv("SPRING_DATASOURCE_PASSWORD")
        );

        if (url == null || url.isEmpty()) {
            
            throw new SQLException("The url cannot be null");
        }

        
        if (username == null && password == null) {
            return DriverManager.getConnection(url);
        } else {
            return DriverManager.getConnection(url, username, password);
        }
    }
}
//     private static Properties properties=new Properties();
// private static void loadProperties(){
//     try(InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
//         if(input ==null){
//             throw new RuntimeException("application.properties file not found");
//         }
//         properties.load(input);
//     }
//     catch (IOException e){
//         throw new RuntimeException("Error loading database properties",e);
//     }
// }
// public static Connection getConnection()throws SQLException{
//     if(properties.isEmpty()){
//         loadProperties();
//     }
//     String url=properties.getProperty("db.url");
//     String username=properties.getProperty("db.username");
//     String password=properties.getProperty("db.password");
//     String driver=properties.getProperty("db.driver");
//     try{
//         Class.forName(driver);
//     }catch(ClassNotFoundException e){
//         throw new RuntimeException("JDBC Driver not found",e);
//     }
//     return DriverManager.getConnection(url,username,password);
// }
// }

