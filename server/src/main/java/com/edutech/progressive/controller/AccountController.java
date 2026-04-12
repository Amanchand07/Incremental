package com.edutech.progressive.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edutech.progressive.entity.Accounts;

import java.util.List;


<<<<<<< HEAD
@RestController
=======

>>>>>>> 4ad7f7787f9274cdee49cd80d201c9696bc4d6ed
public class AccountController {


    public ResponseEntity<List<Accounts>> getAllAccounts() {
        return null;
    }

    public ResponseEntity<Accounts> getAccountById(int accountId) {
        return null;
    }

    public ResponseEntity<List<Accounts>> getAccountsByUser(String param) {
        return null;
    }

    public ResponseEntity<Integer> addAccount(Accounts accounts) {
        return null;
    }

    public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) {
        return null;
    }

    public ResponseEntity<Void> deleteAccount(int accountId) {
        return null;
    }
}