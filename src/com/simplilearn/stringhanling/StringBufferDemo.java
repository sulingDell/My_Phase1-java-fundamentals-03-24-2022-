package com.simplilearn.stringhanling;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// StringBuffer is allow to create a mutable string (tread safe).
		// Tread safe : - One thread will operate on String buffer at a time.
		
		// Create a mutable string 
		StringBuffer message = new StringBuffer("Today is a good day !");
		
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
