package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.Home;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		// create object
		House house = new House();
		
		System.out.println("The House : "+ house.houseName);
		System.out.println("The Rooms count : "+ house.noOfRooms);
		System.out.println("The House is Open ? : "+ house.isOpen);
		
		house.showAll();	
		
		System.out.println("--------------");
		Home home = new Home();  // The default constructor Home() is not visible
		
		// home.homeName; // The field Home.homeName is not visible
		// home.noOfRooms; // The field Home.noOfRooms is not visible
		// home.isOpen; // The field Home.isOpen is not visible
	}

}

class House {
	
	// default variable
	int noOfRooms = 400;
	String houseName = "White House";
	boolean isOpen = false;
	
	// default method
	void showAll() {
		System.out.println("The House "+ houseName +" has no of rooms "
				+noOfRooms +" Is it open ? "+isOpen);
	}
	
	//default constructor
	House() {}
}