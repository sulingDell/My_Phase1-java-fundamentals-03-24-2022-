package com.simplilearn.arrays;

import java.util.Arrays;

public class EmailsArrays {

	public static void main(String[] args) {
		// create a empty array
		String[] emails = new String[5];

		// insert emails data into an array
		emails[0] = "john.smith@gmail.com";
		emails[1] = "will.smith@gmail.com";
		emails[2] = "aria.smith@gmail.com";
		emails[3] = "mike.smith@gmail.com";

		System.out.println(Arrays.toString(emails));

		// access datafrom array
		System.out.println("Email at index 1 : " + emails[1]);
		System.out.println("Email at index 3 : " + emails[3]);
		
		System.out.println("-----------");
		for (int index = 0; index < emails.length; index++) {
			System.out.println("Index " + index + " email : " + emails[index]);
		}

		// create array with default values
		String names[] =  {"John", "Will", "Arai","Mike","David", "Kim"};
		
		System.out.println(Arrays.toString(names));
	}

}
