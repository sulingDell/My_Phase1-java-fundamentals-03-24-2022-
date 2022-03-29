package com.simplilearn.stringhanling;

public class StringDemo {

	public static void main(String[] args) {
		
		// Each time you create a string literal, the JVM checks the "string constant pool" first. 
		// If the string already exists in the pool, a reference to the pooled instance is returned.
		
		String str1 = "John";
		String str2 = "John";
		String str3 = "John";
		
		if(str1 == str2 && str2 == str3) {
			System.out.println("Strings are equal & It is the same string ...");
		} else {
			System.out.println("It is the diffrent string ...");
		}

		System.out.println("----------------------------------");
		
		// String by new keyword : Each Time new keyword based string will get new memory inside heap.
		// Each Time new keyword is going to generate new string reference.
		
		String st1 = new String("Noah");
		String st2 = new String("Noah");
		String st3 = new String("Noah");
	
		if(st1 == st2 && st2 == st3) { 
			System.out.println("Strings are equal & It is the same string ...");
		} else {
			System.out.println("It is the diffrent string ...");
		}
	}

}
