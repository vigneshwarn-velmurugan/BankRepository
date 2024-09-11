package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;
import com.bank.repository.BankRepository;

@Repository
public class BankDao {
@Autowired
BankRepository br;
public String postThis(List<Bank> a) {
	br.saveAll(a);
	return "POSTED ALL SUCCESSFULLY";
}
public String getbyifsc(String a) {
	return  br.getbyifsc(a);
}
}
