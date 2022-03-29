package com.simplilearn.methods;

public class MethodDemo {

	// JVM start main methods :: caller method. 
	public static void main(String[] args) {
		
		// method calling / invocation
		MethodDemo demo = new MethodDemo();
		
		demo.showMessage();
		// demo.showMessage();
		// demo.showMessage();
		
		demo.displayAuthor("John Smith");
		//demo.displayAuthor("Aria James");
		//demo.displayAuthor("Will Smith");
		
		int resultAge = demo.ageCalculator(1990);
		System.out.println(resultAge);
		demo.ageCalculator(1890);
		demo.ageCalculator(1994);
		
		System.out.println("-------------");
		
		demo.retirementCalculator("John Smith", 1880);
		demo.retirementCalculator("Will Smith", 1980);
		demo.retirementCalculator("Aria Smith", 1994);
	}
	
	// user defined methods
		// 1. non parameterized method
		// 2. parameterized method

	// 1. non parameterized method
	// method deceleration
	public void showMessage() {
		System.out.println("Welcome to Java methods.");
	}
	
	// 2. one parameterized method
	public void displayAuthor(String author) {
		System.out.println("The Author : "+author);
	}
	
	//  age calculator
	public int ageCalculator(int yearOfBirth) {
		int currentYear = 2022;
		int age = currentYear - yearOfBirth;
		System.out.println("The user age is : "+ age);
		return age;
	}
	
	// retirement calculator 
	public void retirementCalculator(String username, int yearOfBirth) {
		int expectedAge = 60;
		int actualAge = ageCalculator(yearOfBirth);
		int remainingYears = expectedAge - actualAge;
		
		if(actualAge >= expectedAge) {
			System.out.println("Hi, '"+username +"' you are already retired.");
		} else {
			System.out.println("Hi, '"+username+"' you have "+remainingYears+ " years for retirement.");
		}
	}
}
