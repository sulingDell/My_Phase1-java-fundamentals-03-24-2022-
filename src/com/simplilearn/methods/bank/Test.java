package com.simplilearn.methods.bank;

public class Test {

	public static void main(String[] args) {
		
		// create a account object
		Account account = new Account(131834567, 10000 , "Iron Man", "iron.man@gmail.com");
		
		// create a bank operation object
		BankOperation operation = new BankOperation();
		
		System.out.println("Welcome to the bank :: '"+BankOperation.bankName +"' ");
		
		System.out.println("The user balance : "+operation.showBalance(account));
		
		System.out.println("The user balance after deposit: "+operation.despositAmount(account, 1000));
		System.out.println("The user balance after deposit: "+operation.despositAmount(account, 5000));
		
		System.out.println("The user balance after withdraw: "+operation.withdrawAmount(account, 1000));
		System.out.println("The user balance after withdraw: "+operation.withdrawAmount(account, 5000));
	}
}
