package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ListSerializationDemo {

	public static void main(String[] args) {

		// create a list of employee object
		List<Employee> list = new LinkedList<Employee>();

		// add employees into list
		list.add(new Employee(1001, "John Smith" , 8954656.76, "Engineering"));
		list.add(new Employee(1002, "Marry Smith" , 2234656.76, "Engineering"));
		list.add(new Employee(1003, "Mike Smith" , 2454656.76, "Engineering"));
		list.add(new Employee(1004, "Aria Smith" , 5654656.76, "Engineering"));
		
		try {
			// create a file stream
			FileOutputStream file = new FileOutputStream("list-db.txt");
			
			// create an object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object and write
			out.writeObject(list);
			
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}

}
