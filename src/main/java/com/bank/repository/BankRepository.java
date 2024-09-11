package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {
@Query(value="select branch from bank_table where ifsccode like ?",nativeQuery=true)
public String getbyifsc(String a);
}
