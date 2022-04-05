package com.simplilearn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// create a LinkedHashMap
		Map<String, Double> mapOfItems = new LinkedHashMap<String, Double>();

		// add values
		mapOfItems.put("Rice", 92.23);
		mapOfItems.put("Oil", 292.23);
		mapOfItems.put("Orange", 12.23);
		mapOfItems.put("Mango", 32.23);
		mapOfItems.put("Tea", 492.23);
		mapOfItems.put("Honey", 592.23);

		System.out.println(mapOfItems);

		System.out.println("Mango price :" + mapOfItems.get("Mango"));
		System.out.println("Tea price :" + mapOfItems.get("Tea"));

		// iterate over each value in map
		for (Map.Entry<String, Double> entry : mapOfItems.entrySet()) {
			System.out.println("--------");
			System.out.println(" Key :: " + entry.getKey());
			System.out.println(" Value :: " + entry.getValue());
		}
	}

}
