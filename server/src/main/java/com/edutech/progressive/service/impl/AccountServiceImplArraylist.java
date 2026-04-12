package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Accounts;
<<<<<<< HEAD
import com.edutech.progressive.service.AccountService;

public class AccountServiceImplArraylist implements AccountService {
 List<Accounts> accountsList = new ArrayList<>();
 
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountsList;
    }
 
    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        accountsList.add(accounts);
        return accountsList.size();
    }
 
    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List<Accounts> sortedList = new ArrayList<>(accountsList);
        Collections.sort(sortedList);
        return sortedList;
    }
 
    public void emptyArrayList() {
        accountsList.clear();
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }
 
}
=======



public class AccountServiceImplArraylist {
    private static List<Accounts> accountsList=new ArrayList<>();
    public List<Accounts> getAllAccounts()throws SQLException{
        return accountsList;
    }
    public int addAccount(Accounts accounts)throws SQLException{
        accountsList.add(accounts);
        return accountsList.size();
    }
    public List<Accounts>getAllAccountsSortedByBalance()throws SQLException{
        Collections.sort(accountsList);
        return accountsList;
    }
    public void emptyArrayList(){
        accountsList=new ArrayList<>();

    }
    public Accounts getAccountById(int accountId)throws SQLException{
        if(accountsList.contains(accountId)){
        Accounts accounts= accountsList.get(accountId);
        return accounts;
        }
        return null;
    }

}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
