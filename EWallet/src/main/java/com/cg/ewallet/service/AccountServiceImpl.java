package com.cg.ewallet.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.ewallet.bean.Account;
import com.cg.ewallet.bean.Customer;
import com.cg.ewallet.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {

	AccountDaoImpl dao = new AccountDaoImpl();

	public void addAccount(Account account, Customer customer) {
		dao.addAccount(account, customer);
	}

	@Override
	public void fetchBalance(String user) {
		dao.fetchBalance(user);

	}

	@Override
	public void deposit(String user, double amount) {
		dao.deposit(user,amount);
	}

	@Override
	public void withdraw(String user, double amount) {
		dao.withdraw(user,amount);
		
	}

	@Override
	public void fundtransfer(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gettransaction(String user) {
		// TODO Auto-generated method stub
		
	}

	
}
