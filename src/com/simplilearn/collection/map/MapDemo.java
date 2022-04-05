package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// Map is java collection stores data as key(unique) and value pair
		// Map declaration
		Map<String, String> map1 = new HashMap<>();  // store key value pair + no insertion order
		Map<String, String> map2 = new LinkedHashMap<>(); // store key value pair +  insertion order
		Map<String, String> map3 = new TreeMap<>(); // store key value pair + order by key -> asc keys
		
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		// add key and value pair in map
		phoneBook.put("John", 9876543212L);
		phoneBook.put("Mike", 8888543212L);
		phoneBook.put("William",7676543212L);
		phoneBook.put("Marry", 9226543212L);
		phoneBook.put("Aria", 9456543212L);
		phoneBook.put("David", 9313543212L);
		
		
		phoneBook.put("William", 1010101010L);
		
		//print map
		System.out.println(phoneBook);
		
		System.out.println("William's Numbers : "+phoneBook.get("William"));
		System.out.println("Aria's Numbers : "+phoneBook.get("Aria"));
		
		// iterate over each value in map
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println("--------");
			System.out.println(" Key :: "+ entry.getKey());
			System.out.println(" Value :: "+ entry.getValue());
		}
		
	}

}
