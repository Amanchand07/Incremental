package com.edutech.progressive.service.impl;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
import java.util.List;

import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

<<<<<<< HEAD
public class CustomerServiceImpl implements CustomerService{
private final CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerDAO.getAllCustomers();
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return customerDAO.addCustomer(customers);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> list = customerDAO.getAllCustomers();
        Collections.sort(list); // relies on Customers.compareTo (case-insensitive)
        return list;
    }

    // Updates an existing customer's details
    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        customerDAO.updateCustomer(customers);
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        customerDAO.deleteCustomer(customerId);
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return customerDAO.getCustomerById(customerId);
    }
}
=======
public class CustomerServiceImpl implements CustomerService {
private CustomerDAO customerDAO;

public CustomerServiceImpl(CustomerDAO customerDAO) {
    this.customerDAO = customerDAO;
}
public List<Customers>getAllCustomers()throws SQLException{
    return null;
}

public int addCustomer(Customers customers) throws SQLException {
   return -1;
}

public List<Customers> getAllCustomersSortedByName() throws SQLException {
    return null;
}
public void deleteCustomer(int customerId)throws SQLException{

}
public Customers getCustomersById(int customerId)throws SQLException{
    return null;
}
}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
