package com.simplilearn.innerclass;

public class OuterTest2 {

	// data variable
	private static double amount = 89547.54;
	private static String message = "Today is a good day!";
	
	// inner class :: static inner class
	static class InnerTest {
		
		// data variables
		private String data = "Hello & Welcome";
		private String username ="John Smith";
		
		// public methods
		public void showData() {
			System.out.println("Inner Class :: data : "+ data);
			System.out.println("Inner Class :: username : "+ username);
			System.out.println("Outer Class :: amount : "+ amount);
			System.out.println("Outer Class :: message : "+ message);
		}
	}
	
	public static void main(String[] args) {
			
		//create  inner class object from outer class object
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
	}
}
