package com.simplilearn.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		
		// create an object
		Goverment goverment = new Goverment();
		
		// access data variables
		System.out.println("The public transportation is : "+goverment.transportation);
		System.out.println("The public park is : "+goverment.park);
		System.out.println("The public assets is : "+goverment.taxAssets);
		System.out.println("------------------");
		
		// access methdos
		System.out.println(goverment.showPark());
		System.out.println(goverment.showPublicAssets());
		goverment.displayTransport();
	}

}

class Goverment {
	
	// data variable
	public String transportation = "Train";
	public String park = "ABC Public Park";
	public double taxAssets = 345645.656;
	
	// public methods
	public double showPublicAssets() {
		return taxAssets;
	}
	
	public String showPark() {
		return park;
	}
	
	public void displayTransport() {
		System.out.println("The transportation is : "+transportation);
	}
	
	// public constructor
	public Goverment() { }
}
