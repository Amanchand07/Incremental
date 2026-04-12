package com.edutech.progressive.service.impl;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.Comparator;
=======
import java.util.ArrayList;
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
import java.util.List;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.service.AccountService;

<<<<<<< HEAD
public class AccountServiceImpl  implements AccountService{
private final AccountDAO accountDAO;

    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountDAO.getAllAccounts();
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return accountDAO.getAccountById(accountId);
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return accountDAO.addAccount(accounts);
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        accountDAO.updateAccount(accounts);
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        accountDAO.deleteAccount(accountId);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List<Accounts> list = accountDAO.getAllAccounts();
        list.sort(Comparator.comparingDouble(Accounts::getBalance));
        return list;
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return accountDAO.getAllAccountsByCustomer(userId);
    }
}
=======
public class AccountServiceImpl implements AccountService{
private AccountDAO accountDAO;

public AccountServiceImpl(AccountDAO accountDAO) {
    this.accountDAO = accountDAO;
}

public List<Accounts> getAllAccounts() throws SQLException {
    return null;
}


public int addAccount(Accounts accounts) throws SQLException {
   return -1;
}


public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
   return null;
}
public List<Accounts> getAccountsByUser(int userId)throws SQLException{
    // List<Accounts> list;
    // list=new ArrayList<>();
    // return list;
    return null;
}
public Accounts getAccountsById(int accountId)throws SQLException{
    return null;
}
public void updateAccount(Accounts accounts) throws SQLException{

}
public void deleteAccount(int accountId)throws SQLException{

}
}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
