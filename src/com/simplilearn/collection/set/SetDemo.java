package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// set declaration
		Set<String> set1 = new HashSet<String>();  // HashSet allows unique elements + no insertion order preserve.
		Set<String> set2 = new LinkedHashSet<String>();  // LinkedHashSet allows unique elements + insertion order preserve.
		Set<String> set3 = new TreeSet<String>();  // TreeSet allows unique elements + order data by asc order.
		
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("WIPRO");
		setOfUniqueCompanies.add("SIMPLILEARN");
		setOfUniqueCompanies.add("GOOGLE");
		setOfUniqueCompanies.add("MICROSOFT");
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("AMAZON");
		
		System.out.println(setOfUniqueCompanies);
	
		System.out.println("-------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniqueCompanies.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------");
		// set iteration with for each
		for(String comp: setOfUniqueCompanies) {
			System.out.println("The comp :: "+comp);
		}
	}

}
