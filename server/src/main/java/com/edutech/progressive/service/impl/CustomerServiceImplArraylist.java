package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;
<<<<<<< HEAD
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImplArraylist implements CustomerService{

    List<Customers> customerList = new ArrayList<>();
 
    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerList;
    }
 
    @Override
    public int addCustomer(Customers customers) throws SQLException {
        customerList.add(customers);
        return customerList.size();
    }
 
    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> sortedList = new ArrayList<>(customerList);
        Collections.sort(sortedList);
        return sortedList;
    }
 
    public void emptyArrayList() {
        customerList.clear();
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }
 
}
=======

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
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
