package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

<<<<<<< HEAD
import com.edutech.progressive.dao.TransactionDAO;
import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {
    
    private final TransactionDAO transactionDAO;

    public TransactionServiceImpl(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return transactionDAO.getAllTransactions();
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        return transactionDAO.getTransactionById(transactionId);
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        return transactionDAO.addTransaction(transaction);
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
        transactionDAO.updateTransaction(transaction);
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
        transactionDAO.deleteTransaction(transactionId);
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        return transactionDAO.getTransactionsByCustomerId(customerId);
    }
}
=======
import com.edutech.progressive.entity.Transactions;

public class TransactionServiceImpl {
    public List<Transactions> getAllTransactions() throws SQLException{
        return null;
    }
    public Transactions getTransactionById(int transactionId)throws SQLException{
        return null;
    }
    public int addTransaction(Transactions transaction)throws SQLException{
        return -1;
    }
    public void updateTransaction(Transactions transaction )throws SQLException{

    }
    public void deleteTransaction(int transactionId)throws SQLException{

    }
    public List<Transactions> getTransactionsByCustomerId(int customerId)throws SQLException{
        return null;
    }
}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
