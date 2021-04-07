package com.demo.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.crudapp.entity.Account;
import com.demo.crudapp.repos.AccountRepository;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository repo;

    public List<Account> listAll() {
        return repo.findAll();
    }

    public void save(Account account) {
        repo.save(account);
    }

    public Account get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}