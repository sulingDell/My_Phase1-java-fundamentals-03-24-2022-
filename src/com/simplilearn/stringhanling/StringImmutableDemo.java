package com.simplilearn.stringhanling;

public class StringImmutableDemo {

	public static void main(String[] args) {

		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or non changeable values.
		
		String username = "John";
		
		// update the string  -> concat()
		String response = username.concat(" Smith");
		
		System.out.println(username);  // old string -> John
		System.out.println(response);  // new string -> John Smith
		

	}

}
