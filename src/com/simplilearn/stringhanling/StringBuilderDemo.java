package com.simplilearn.stringhanling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		// StringBuilder is allow to create a mutable string (not tread safe).
		// Not Tread safe : - Multiple thread will operate on String builder at a time.
		
		// Create a mutable string 
		StringBuilder message = new StringBuilder("Today is a wonderful day !");
		
		System.out.println(message);
		
		// string modification
		// append text
		message.append(" Happy learning !");
		System.out.println(message);
		
		// replace text
		message.replace(0, 1, "t");
		System.out.println(message);
		
		// delete text
		message.delete(0, 11);
		System.out.println(message);
		
		// insert text
		message.insert(0, "Welcome , ");
		System.out.println(message);
	}
	

}
