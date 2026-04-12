package com.edutech.progressive.dao;


<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
import java.util.List;

import com.edutech.progressive.dto.CustomerAccountInfo;
import com.edutech.progressive.entity.Customers;

public interface CustomerDAO {
<<<<<<< HEAD
   int addCustomer(Customers customers) throws SQLException;
    Customers getCustomerById(int customerId) throws SQLException;
    void updateCustomer(Customers customers) throws SQLException;
    void deleteCustomer(int customerId) throws SQLException;
    List<Customers> getAllCustomers() throws SQLException;
    CustomerAccountInfo getCustomerAccountInfo(int customerId) throws SQLException;
=======
    int addCustomer(Customers customers);
    Customers getCustomerById(int customerId);
    void updateCustomer(Customers customers);
    void deleteCustomer(int customerId);
    List<Customers> getAllCustomers();
    CustomerAccountInfo getCustomerAccountInfo(int customerId);
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
}