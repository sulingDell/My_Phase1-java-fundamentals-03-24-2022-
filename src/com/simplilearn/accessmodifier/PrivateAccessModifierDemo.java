package com.simplilearn.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		
		// create object
		BankAccount account = new BankAccount();

		// account.balance;  // The field BankAccount.balance is not visible // compile time error
		// account.username;  // The field BankAccount.username is not visible // compile time error
		//  account.password;  // The field BankAccount.password is not visible // compile time error
		
		// account.showBalance();  // compile time error.  // The method showBalance() from the type BankAccount is not visible
		// account.showUsername();  // compile time error.  // The method showUsername() from the type BankAccount is not visible
		// account.showPassword();  // compile time error.  // The method showPassword() from the type BankAccount is not visible
		
		account.printData();
	}

}


class BankAccount {
	
	// private variables
	private double balance = 67678.678;
	private String username ="johnsmith";
	private String password ="john@123";
	
	// private methods
	private double showBalance() {
		return balance;
	}
	
	private String showUsername() {
		return username;
	}
	
	private String showPassword() {
		return password;
	}
	
	// public method
	public void printData() {
		// showUsername();
		System.out.println("The user : " + username + " has balance :" + balance);
	}
	
	// private constructor   :: The class cannot be instantiated (cannot create object )
	// private BankAccount(){ }
}