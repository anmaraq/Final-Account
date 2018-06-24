package com.qa.service.repository;

public interface AccountRepository {
	
	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(Long id);

}
