package com.simplilearn.typecasting;

public class StringToNumericConvertor {

	public static void main(String[] args) {
		
		// String to numeric convert only convertible value
		
		String price = "7345";  // convertible value
		String amount = "342abc"; // non convertible value (NumberFormatException)
		
		int intPrice = Integer.parseInt(amount);  // string -> int
		
		long longPrice = Long.parseLong(price);  // string -> long
		
		double doublePrice = Double.parseDouble(price); // string -> double
		
		float floatPrice = Float.parseFloat(price); // string -> float
		
		
		System.out.println("Integer Price : " + intPrice);
		System.out.println("Double Price : " + doublePrice);
		System.out.println("Long Price : " + longPrice);
		System.out.println("Float Price : " + floatPrice);

	}

}
