package com.edutech.progressive.entity;

<<<<<<< HEAD
public class Accounts implements Comparable<Accounts> {
private int accountId;
=======
public class Accounts implements Comparable<Accounts>{
    private int accountId;
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
    private int customerId;
    private double balance;
    public Accounts() {
    }
    public Accounts(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
<<<<<<< HEAD
    public int compareTo(Accounts o) {
        return Double.compare(this.balance, o.getBalance());
        }
    
}
=======
    public int compareTo(Accounts otherAccounts) {
        return Double.compare(this.balance, otherAccounts.balance);
    }
    
}
>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
