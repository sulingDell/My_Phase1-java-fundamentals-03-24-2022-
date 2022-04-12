package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("--- Program started ! ---");
		
		try {
			int balance = 20000;
			int amount = 500;
			int result = balance / amount;		
			System.out.println("Result Avg Balance : "+result);
		} catch (Exception e) {
			System.out.println("Exception Occured and handled ! "+e.getClass());
			System.out.println("Exception Message "+e.getMessage());
		} finally {
			System.out.println("Always executing block : cleanup");
		}
		
		System.out.println("--- Program ended ! ---");
	}

}
