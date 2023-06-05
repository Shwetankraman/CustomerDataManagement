package com.shwetank.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shwetank.CustomerDataManagement.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer>{

}
