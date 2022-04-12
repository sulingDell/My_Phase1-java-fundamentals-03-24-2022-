package com.simplilearn.exception.handling.bank;

public class Test {

	public static void main(String[] args) {
		
		// create a account object
		Account account = new Account(131834567, 10000 , "Iron Man", "iron.man@gmail.com");
		
		// create a bank operation object
		BankOperation operation = new BankOperation();
		
		System.out.println("Welcome to the bank :: '"+BankOperation.bankName +"' ");
		
		try {
			System.out.println("The user balance : "+operation.showBalance(account));
			System.out.println("The user balance : "+operation.showBalance(null));
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		System.out.println("----------------------");
		
		try {
			double result1 = operation.despositAmount(account, 1000);
			System.out.println("The user balance : "+ result1);
		} catch (InvalidAcccount e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}		
		
	}
}
