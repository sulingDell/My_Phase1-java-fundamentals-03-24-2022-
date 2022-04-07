package com.simplilearn.multithreading;

class Account1 {

	double balance = 1000.00;

	public synchronized void showBalance() {
		System.out.println("The Account balance is : " + balance);
	}

	public synchronized void desposit(double amount) {
		balance += amount;
		System.out.println("Deposit is completed & new balance is " + balance);
		notify();
		System.out.println("-------------");
	}

	public synchronized void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient fund to withdraw ...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw is completed & new balance is " + balance);
	}
}

public class BankOperationsWithWait {

	public static void main(String[] args) {

		// create account object
		Account1 account = new Account1();

		// create a thread
		Thread t1 = new Thread(() -> {
			account.withdraw(2000);
		});
		
		Thread t2 = new Thread(() -> {
			account.desposit(10000);
		});
		
		Thread t3 = new Thread(() -> {
			account.showBalance();
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		// System.out.println("The Balance : "+ account.balance);
	}
}
