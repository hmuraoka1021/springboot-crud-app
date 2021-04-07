package com.demo.crudapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crudapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
