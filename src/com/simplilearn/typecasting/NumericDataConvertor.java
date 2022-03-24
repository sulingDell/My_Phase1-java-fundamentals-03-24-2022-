package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// step 1 : collect integer value from user
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println(" :: Enter a integer number vaule :: ");
		System.out.println("-----------------------------------------");
		int userInput = input.nextInt();
		
		
		// System.out.println(userInput);
		// step2 : convert values into other types
		
		// Implicit Type cast
		long bgiValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		byte byteValue = (byte) userInput;
		short  shortValue = (short) userInput;
		
		System.out.println("Numeric values after conversion");
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		System.out.println("Double Value : "+doubleValue);
		System.out.println("Float Value : "+floatValue);
		System.out.println("Long Value : "+bgiValue);

	}

}
