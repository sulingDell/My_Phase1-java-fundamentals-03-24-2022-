package com.simplilearn.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> setOfUniqueName = new TreeSet<String>();
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		TreeSet<Double> amounts = new TreeSet<Double>();
		
		
		// add values :: sorted set arranged values in asc order
		setOfUniqueName.add("John");
		setOfUniqueName.add("Adam");
		setOfUniqueName.add("Aria");
		setOfUniqueName.add("David");
		setOfUniqueName.add("Will");
		setOfUniqueName.add("Marry");

		System.out.println(setOfUniqueName);
		System.out.println(setOfUniqueName.descendingSet());

		System.out.println("---------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniqueName.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---------------");
		// set iteration with for each
		for (String name : setOfUniqueName) {
			System.out.println("The Name :: " + name);
		}
		
		System.out.println("-------------------");
		// reverse order iteration with iterator
		Iterator<String> itr2 = setOfUniqueName.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------");
		// reverse set iteration with for each
		for (String name : setOfUniqueName.descendingSet()) {
			System.out.println("The Name :: " + name);
		}

	}

}
