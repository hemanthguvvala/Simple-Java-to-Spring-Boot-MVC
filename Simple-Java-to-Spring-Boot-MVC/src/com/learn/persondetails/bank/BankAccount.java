package com.learn.persondetails.bank;

public interface BankAccount {
	String typeOfAccount();

	boolean hasAnyLoanIssues();

	String name();

	int accountNumber();
}
