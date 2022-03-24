package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.SuperHero;

public class ProtectedAccessmodifierDemo extends SuperHero {

	public static void main(String[] args) {
		
		// create object
		Hero hero = new Hero();
		
		System.out.println("The Hero : "+hero.name);
		System.out.println("The Power : "+hero.power);
		System.out.println("The Rank : "+hero.rank);

		System.out.println("---------------");
		System.out.println(hero.showPower());
		hero.printDetails();
		
		
		// create an object for SuperHero
		SuperHero superHero = new SuperHero();
		
		// System.out.println("The Hero : "+superHero.name);  // The field SuperHero.name is not visible
		// System.out.println("The Power : "+superHero.power); // The field SuperHero.power is not visible
		// System.out.println("The Rank : "+superHero.rank);  // The field SuperHero.rank is not visible
		System.out.println("---------------");
		
		// create an object of child to access parent class protected properties and methods.
		ProtectedAccessmodifierDemo pam = new ProtectedAccessmodifierDemo();
		
		System.out.println("The Hero : "+pam.name);
		System.out.println("The Power : "+pam.power);
		System.out.println("The Rank : "+pam.rank);
	}

}

class Hero {
	
	// protected varaibles
	protected int rank = 1;
	protected String power ="Healing Power";
	protected String name ="Wolverine";
	
	// protected methods
	protected String showPower() {
		return power;
	}
	
	// public methods
	public void printDetails() {
		System.out.println("The hero is : "+name +" and has rank : "+rank);
	}
	
}
