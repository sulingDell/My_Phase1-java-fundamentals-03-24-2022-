package com.simplilearn.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> setOfUniqueBrands = new LinkedHashSet<String>();

		// insert data elements
		setOfUniqueBrands.add("NIKE");
		setOfUniqueBrands.add("ADIDAS");
		setOfUniqueBrands.add("FILA");
		setOfUniqueBrands.add("ASICS");
		setOfUniqueBrands.add("NIKE");
		setOfUniqueBrands.add("PUMA");
		setOfUniqueBrands.add("NIKE");
		
		System.out.println(setOfUniqueBrands);
		
		System.out.println("-------------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniqueBrands.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------");
		// set iteration with for each
		for(String brand: setOfUniqueBrands) {
			System.out.println("The Brand :: "+brand);
		}
		
		
	}

}
