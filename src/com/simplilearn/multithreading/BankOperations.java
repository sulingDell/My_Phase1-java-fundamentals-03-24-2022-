package com.simplilearn.multithreading;

class Customer {
	
	double balance = 1000.00;
	
	public void showBalance() {
		System.out.println("The Account balance is : "+balance);
	}
	
	public void desposit(double amount) {
		balance += amount;
		System.out.println("Deposit is completed & new balance is "+ balance);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw is completed & new balance is "+ balance);
	}
}

class CustomerThrd extends Thread {
	
	Customer customer = new Customer();
	
	@Override
	public void run() {
		// customer.showBalance();
		customer.withdraw(1000);
		// customer.desposit(2000);
		System.out.println("-- CustomerThrd Thread is running ---");
	}
}

public class BankOperations {
	
	public static void main(String[] args) {
		
		CustomerThrd t1 = new CustomerThrd();
		t1.start();
	}
}
