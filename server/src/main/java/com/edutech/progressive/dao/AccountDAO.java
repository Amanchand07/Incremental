package com.edutech.progressive.dao;


<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
import java.util.List;

import com.edutech.progressive.entity.Accounts;

public interface AccountDAO {
<<<<<<< HEAD
    int addAccount(Accounts accounts) throws SQLException;
    Accounts getAccountById(int accountId) throws SQLException;
    void updateAccount(Accounts accounts) throws SQLException;
    void deleteAccount(int accountId) throws SQLException;
    List<Accounts> getAllAccounts() throws SQLException;
    List<Accounts> getAllAccountsByCustomer(int customerId) throws SQLException;
}

=======
    int addAccount(Accounts accounts);
    Accounts getAccountById(int accountId);
    void updateAccount(Accounts accounts);
    void deleteAccount(int accountId);
    List<Accounts> getAllAccounts();
    List<Accounts> getAllAccountsByCustomer(int customer_id);
}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
