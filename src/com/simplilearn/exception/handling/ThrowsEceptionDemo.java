package com.simplilearn.exception.handling;

public class ThrowsEceptionDemo {

	public static void main(String[] args) {

		// throws : throws keyword is used to declare exception.
		
		try {
			dataValidator("Hello");
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		
		try {
			dataValidator("");
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	// data validator :: Checked Exception
	public static void dataValidator(String data) throws Exception {
		if (data != null && data.length() > 0) {
			System.out.println(data + " is a valid data.");
		} else {
			throw new Exception(data + " is not a valid data");
		}
	}
}
