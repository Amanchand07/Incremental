package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.service.AccountService;

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