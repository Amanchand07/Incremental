package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;

public class CustomerServiceImplArraylist {
    private static List<Customers> customersList=new ArrayList<>();
    public List<Customers> getAllCustomers()throws SQLException{
        return customersList;
    }
    public int addCustomer(Customers customers)throws SQLException{
        customersList.add(customers);
        return customersList.size();
    }
    public List<Customers>getAllCustomersSortedByName()throws SQLException{
        Collections.sort(customersList);
        return customersList;
    }
    public void emptyArrayList(){
        customersList=new ArrayList<>();

    }
    public Customers getCustomerById(int customerId)throws SQLException{
        if(customersList.contains(customerId)){
        Customers customers= customersList.get(customerId);
        return customers;
        }
        return null;
    }

}