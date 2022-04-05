package com.simplilearn.collection.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		// data
		String data = "Qm";		
		// pattern : evaluate only one char & second char in string should be m
		Pattern pattern = Pattern.compile(".m");		
		// matcher 
		Matcher matcher = pattern.matcher(data);
		
		boolean result = matcher.matches();
		System.out.println("String data pattern is match :: "+result);
		
		
		System.out.println("---------------");
		boolean result2 = Pattern.compile(".n").matcher("Mx").matches();
		System.out.println("String data pattern is match :: "+result2);
		
		System.out.println("---------------");
		boolean result3 =  Pattern.matches(".m", "Ym");
		System.out.println("String data pattern is match :: "+result3);;
	}

}
