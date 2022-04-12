package com.simplilearn.exception.handling;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		
		// throw :: throw keyword is used to throw an exception java programming.

		ageValidator(20);
		
		try {
			ageValidator(-20);  // exception raised 
		} catch (RuntimeException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		
		ageValidator(45);
		System.out.println("--------------------");
		
		dataValidator("Hi");
		dataValidator("");
		dataValidator(null);
	}
	
	// age validator  : RuntimeException :: Unchecked Exception
	private static void ageValidator(int age) {
		if(age> 18) {
			System.out.println(age+" age is a valid age, You can vote !");
		} else {
			// use throw keyword to throw an exception
			throw new RuntimeException(age+" age is a invalid age !");
		}
	}
	
	//data validator :: Checked Exception
	public static void dataValidator(String data) {
		if(data != null && data.length()> 0) {
			System.out.println("Is is a valid data.");
		} else {
			try {
				throw new Exception(data +" is not a valid data");
			} catch (Exception e) {
				System.out.println("Exception Occures : " + e.getClass());
				System.out.println("Exception Message : " + e.getMessage());
			}
		}
	}

}
