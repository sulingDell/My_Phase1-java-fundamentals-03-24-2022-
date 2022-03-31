package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> listOfCities  = new LinkedList<String>();

		// add cities
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("New York");
		listOfCities.add("California");
		listOfCities.add("Hawai");
		listOfCities.add("Mumbai");
		
		// print list
		System.out.println(listOfCities);
		
		System.out.println("Index : 3  :> " + listOfCities.get(3));
		
		System.out.println("----------------");

		// iteration over list by iterator
		Iterator<String> itr = listOfCities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < listOfCities.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfCities.get(index));
		}

		System.out.println("----------------");
		// enhance for loop
		for (String username : listOfCities) {
			System.out.println("The city : " + username);
		}
	}
}
