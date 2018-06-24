package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{
	
	private static final Logger LOGGER = Logger.getLogger(AccountService.class);

	@Inject
	private AccountRepository repo;

	public String addAccount(String account) {
		LOGGER.info("In AccountServiceImpl addAccount ");
		return repo.createAccount(account);
	}

	public String deleteAccount(Long id) {
		LOGGER.info("In AccountServiceImpl deleteAccount ");
		return repo.deleteAccount(id);

	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

	public String getAllAccounts() {
		LOGGER.info("In AccountsServiceImpl getAllAccounts ");
		return repo.getAllAccounts();
	}


}