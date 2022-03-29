package com.simplilearn.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to Arithmatic Calculator :: ");
		System.out.println("-----------------------------------");
		
		// step1 : collect input from user -> console
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number value 1 : ");
		int x = input.nextInt();
		
		System.out.println("Enter a number value 2 : ");
		int y = input.nextInt();
		
		// create operation object
		Operations operations = new Operations();
		
		float result1 = operations.add(x, y);
		System.out.println("The addition is : " + result1);
		
		
		short result2 = operations.sub(x, y);
		System.out.println("The subtraction is : " + result2);
		
		float result3 = operations.mul(x, y);
		System.out.println("The multiplication is : " + result3);
		
		
		double result4 = operations.div(x, y);
		System.out.println("The division is : " + result4);
		
		double result5 = operations.avg(x, y);
		System.out.println("The Average is : " + result5);
		
		input.close();
	}

}


class Operations {
	
	// addition
	public float add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public float add(int num1 , int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public float add(int num1 , float num2) {
		return num1 + num2 ;
	}
	
	// subtraction
	public short sub(int num1 , int num2) {
		return (short) (num1 - num2);
	}
	
	// multiplication
	public float mul(int num1 , int num2) {
		return num1 * num2;
	}
	
	// division
	public double div(int num1 , int num2) {
		return num1 / num2;
	}
	
	// average
	public double avg(int num1 , int num2) {
		return (num1 + num2) / 2;
	}
	
}