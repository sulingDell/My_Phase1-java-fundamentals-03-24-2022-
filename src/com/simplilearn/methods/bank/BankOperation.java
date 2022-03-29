package com.simplilearn.methods.bank;

public class BankOperation {

	public static String bankName = "Iron Bank";
	
	// show balance
	public double showBalance(Account account) {
		if(account != null) {
			return account.balance;
		}
		return 0;
	}
	
	// deposit amount
	public double despositAmount(Account account, double amount ) {
		if(amount > 0) {
			account.balance += amount; // account.balance =  account.balance + amount;
			return account.balance;
		}else {
			System.out.println("Invalid deposit Amount");
			return 0;
		}
	}
	
	
	// withdraw amount
	public double withdrawAmount(Account account, double amount ) {
		if(amount > 0) {
			account.balance -= amount; // account.balance =  account.balance - amount;
			return account.balance;
		}else {
			System.out.println("Invalid withdraw Amount");
			return 0;
		}
	}
}
