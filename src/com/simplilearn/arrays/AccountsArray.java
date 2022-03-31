package com.simplilearn.arrays;

import java.util.Arrays;

public class AccountsArray {

	public static void main(String[] args) {

		// create multiple account objects
		Account account1 = new Account(1001, 56546.56, "johnsmith", "john.smith@gmail.com");
		Account account2 = new Account(1002, 11546.56, "willsmith", "will.smith@gmail.com");
		Account account3 = new Account(1003, 33346.56, "mikesmith", "mike.smith@gmail.com");
		Account account4 = new Account(1004, 44746.56, "ariasmith", "aria.smith@gmail.com");

		// create account array
		Account[] accounts = new Account[5];

		accounts[0] = account1;
		accounts[1] = account2;
		accounts[2] = account3;
		accounts[3] = account4;

		// print all accounts data
		System.out.println(Arrays.toString(accounts));

		System.out.println("----------------");
		for (int index = 0; index < accounts.length; index++) {
			if (accounts[index] != null) {
				// System.out.println(accounts[index]);
				System.out.println(accounts[index].accNo);
				System.out.println(accounts[index].username);
				System.out.println(accounts[index].balance);
				System.out.println(accounts[index].email);
				System.out.println("-------------");
			}
		}

	}

}
