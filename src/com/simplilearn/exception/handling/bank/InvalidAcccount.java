package com.simplilearn.exception.handling.bank;

// Exception :: checked exception
public class InvalidAcccount extends Exception{

	private static final long serialVersionUID = 1L;

	InvalidAcccount(String message){
		super(message);
	}
}
