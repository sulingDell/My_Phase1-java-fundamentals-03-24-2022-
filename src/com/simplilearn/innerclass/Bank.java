package com.simplilearn.innerclass;

public class Bank {

	private String name = "Iron Bank";
	private double assets = 5465467567.567;

	class Banking {
		
		private double balance =34454.56;
		
		public double showBalance() {
			return balance;
		}
		
		public double deposit(double amount) {
			return balance += amount;
		}
		
		public double withdraw(double amount) {
			return balance -= amount;
		}
	}
	
	class Insurance {

	}

	class Lockers {

	}

	

	public static void main(String[] args) {

		// create bank object
		Bank bank = new Bank();
		
		// create banking object
		Banking banking = bank.new Banking();
		
		System.out.println("The user balance "+ banking.showBalance());
		System.out.println("The user balance after deposit  "+ banking.deposit(1000));
		System.out.println("The user balance after withdraw  "+ banking.withdraw(1000));
	}

}
