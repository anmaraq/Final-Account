package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Account {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Size(min = 2, max = 80)
	private String firstName;
	@Size(min = 2, max = 80)
	private String surname;
	@Size(min = 5, max = 5)
	private String accountNumber;
	@Size(min = 10, max = 10)
	private String dateofbirth;



	public Account() {

	}

	public Account(String firstName, String surname, String accountNumber, String dateofbirth) {
		this.firstName = firstName;
		this.surname = surname;
		this.accountNumber = accountNumber;
		this.dateofbirth = dateofbirth;
	}

	public String getFirst() {
		return firstName;
	}

	public void setFirst(String firstName) {
		this.firstName = firstName;
	}

	public String getSur() {
		return surname;
	}

	public void setSur(String surname) {
		this.surname = surname;
	}

	public String getYearPublished() {
		return accountNumber;
	}

	public void Number(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBirth() {
		return dateofbirth;
	}

	public void setBirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

}
