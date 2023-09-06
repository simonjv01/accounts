package com.example.accounts.controller;

import com.example.accounts.model.Accounts;
import com.example.accounts.model.Customer;
import com.example.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/myAccounts")
    List<Accounts> accountsList() {
            return (List<Accounts>) accountsRepository.findAll();
    }

}
