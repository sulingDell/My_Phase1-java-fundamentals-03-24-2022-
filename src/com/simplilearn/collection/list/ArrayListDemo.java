package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> listOfCompanies = new ArrayList<String>();

		// add data in list
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("MICROSOFT");
		listOfCompanies.add("GOOGLE");
		listOfCompanies.add("SIMPLILEARN");

		System.out.println(listOfCompanies);
		System.out.println("Index : 3  :> " + listOfCompanies.get(3));

		System.out.println("----------------");

		// iteration over list by iterator
		Iterator<String> itr = listOfCompanies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < listOfCompanies.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfCompanies.get(index));
		}

		System.out.println("----------------");
		// enhance for loop
		for (String username : listOfCompanies) {
			System.out.println("The company : " + username);
		}
	}
}
