package com.simplilearn.multithreading;

class Account {

	double balance = 1000.00;

	public synchronized void showBalance() {
		System.out.println("The Account balance is : " + balance);
	}

	public synchronized void desposit(double amount) {
		balance += amount;
		System.out.println("Deposit is completed & new balance is " + balance);
	}

	public synchronized void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw is completed & new balance is " + balance);
	}
}

public class BankOperations2 {

	public static void main(String[] args) {

		// create account object
		Account account = new Account();

		// create a thread
		Thread t1 = new Thread(() -> {
			account.showBalance();
		});
		
		Thread t2 = new Thread(() -> {
			account.desposit(10000);
		});
		
		Thread t3 = new Thread(() -> {
			account.withdraw(1000);
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		// System.out.println("The Balance : "+ account.balance);
	}
}
