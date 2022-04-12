package com.simplilearn.exception.handling.bank;

//RuntimeException :: unchecked exception
public class AccountNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;

	AccountNotFound(String message){
		super(message);
	}
}
