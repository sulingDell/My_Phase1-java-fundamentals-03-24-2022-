package com.simplilearn.exception.handling.bank;

public class BankOperation {

	public static String bankName = "Iron Bank";
	
	// show balance
	public double showBalance(Account account) {
		if(account != null) {
			return account.balance;
		}
		throw new AccountNotFound("Account not found");
	}
	
	// deposit amount
	public double despositAmount(Account account, double amount ) throws InvalidAcccount {
		if(amount > 0) {
			account.balance += amount; // account.balance =  account.balance + amount;
			return account.balance;
		} else {
			System.out.println("Invalid deposit Amount");
			throw new InvalidAcccount("Invalid deposit Amount");
		}
	}
	
	
	// withdraw amount
	public double withdrawAmount(Account account, double amount ) throws InvalidAcccount {
		if(amount > 0) {
			account.balance -= amount; // account.balance =  account.balance - amount;
			return account.balance;
		}else {
			System.out.println("Invalid withdraw Amount");
			throw new InvalidAcccount("Invalid withdraw Amount");
		}
	}
}
