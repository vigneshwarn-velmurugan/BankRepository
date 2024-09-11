package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDao;
import com.bank.entity.Bank;

@Service
public class BankService {
@Autowired
BankDao bd;
public String postThis(List<Bank> a) {
	return bd.postThis(a);
}
public String getbyifsc(String a) {
	return bd.getbyifsc(a);
}
}
