package com.simplilearn.typecasting;

public class SuperHero {

	// protected variables
	protected int rank = 1;
	protected String power = "Tech Power";
	protected String name = "Iron man";

	// protected methods
	protected String showPower() {
		return power;
	}

	// public methods
	public void printDetails() {
		System.out.println("The hero is : " + name + " and has rank : " + rank);
	}
	
	public SuperHero() {}
}
