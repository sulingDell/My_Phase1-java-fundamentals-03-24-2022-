package com.simplilearn.collection.regex;

import java.util.regex.Pattern;

public class RegExDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".m", "Ym"));  //  true-> first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches(".m", "YmYm"));   // false -> length more than 2 char not allowed
		System.out.println(Pattern.matches(".m", "Yk"));  // false -> first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches("..m", "MYm")); // true -> first tow char anything third should be m.
		System.out.println(Pattern.matches("m..", "mMY"));// true -> first as m then two char anything
		System.out.println(Pattern.matches(".m.", "NmN"));  // true -> middle char as m then two char anything 
		System.out.println(Pattern.matches("..m..", "ABmXY"));  // true -> middle char as m then two char anything 
		
		System.out.println(Pattern.matches("[xyz]", "x")); // true -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "y")); // true -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "xy")); // false -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "a")); // false -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "abc")); // false -> any one char from xyz
		
		System.out.println(Pattern.matches("[xyz]?", "x")); // true -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]?", "xy")); // false -> any one char from xyz
		
		System.out.println(Pattern.matches("[xyz]+", "xy")); // true -> (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "x")); // true -> (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "b")); // false -> (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "xyz")); // true -> (one or more than one match value).
		
		System.out.println(Pattern.matches("[a-z]+", "xyz")); // true -> (any data from a -z small)
		System.out.println(Pattern.matches("[a-z]+", "pqr")); // true -> (any data from a -z small)
		System.out.println(Pattern.matches("[A-Z]+", "pqr")); // false ->  (any data from A -Z caps)
		System.out.println(Pattern.matches("[A-Z]+", "ABCD")); // true ->  (any data from A -Z caps)
		
		System.out.println(Pattern.matches("[a-zA-Z]+", "abcxyzABCPQR"));  //true  combine a-zA-Z
		System.out.println(Pattern.matches("[0-9]+", "9"));   // true
		System.out.println(Pattern.matches("[0-9]+", "92"));   // true	
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "johnSmith1213"));  // true
		System.out.println("----------------");
		
		System.out.println(Pattern.matches("\\d", "mkns")); // false => digit only
		System.out.println(Pattern.matches("\\d", "8")); // true => digit only
		System.out.println(Pattern.matches("\\D", "P")); // true => not digit only
	}

}
