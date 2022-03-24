package com.simplilearn.typecasting;

public class ExplicitTypeCastDemo {

	public static void main(String[] args) {
		
		// Explicit typecast : does not happen automatically
		/**
		 * Narrowing : Converts data of incompatible type 
		 * Convert data from higher range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		double price = 131.45;
		
		long bigPrice = (long) price; // Narrowing => double(8 byte) -> long (8 byte)
		
		int intPrice = (int) bigPrice; // Narrowing => long(8 byte) -> int (4 byte)		
		
		short shortPrice = (short) bigPrice;  // Narrowing => long(8 byte) -> short (2 byte)
		
		byte bytePrice = (byte) intPrice; // Narrowing => int(4 byte) -> byte (1 byte)
		
		System.out.println("Double price : "+price);
		System.out.println("Long price : "+bigPrice);
		System.out.println("Integer price : "+intPrice);
		System.out.println("Short price : "+shortPrice);
		System.out.println("Byte price : "+bytePrice);
		
		
	}
}
