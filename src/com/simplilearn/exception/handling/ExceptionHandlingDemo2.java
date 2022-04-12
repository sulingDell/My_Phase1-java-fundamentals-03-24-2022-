package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
		transaction(30);
		transaction(0);		// exception raised
		transaction(6);	
		
		System.out.println("--------------");
		strLengthCalculator("Today is a good day!");
		strLengthCalculator(null);  // exception raised
		strLengthCalculator("");
		
		System.out.println("--------------");
		numericConvertor("3453456");
		numericConvertor("34534abcd");
		numericConvertor("");
		
		System.out.println("--------------");
		multiConvertor("3453456",456);
		multiConvertor("3453456abcd",456);
	}
	
	private static void transaction(int amount) {
		try {
			int balance = 3000;
			int result = balance / amount;
			System.out.println("Result amount :: "+result);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void strLengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Result str lenght :: "+length);
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void numericConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println("Interger Result :> "+result);
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void multiConvertor(String input, int number) {
		try {
			int result1 = Integer.parseInt(input);
			int result2 = 2000 / number;
			int result3 = input.length();
			System.out.println("Result1 :> "+result1);
			System.out.println("Result2 :> "+result2);
			System.out.println("Result3 :> "+result3);
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

}
