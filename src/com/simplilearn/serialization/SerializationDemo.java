package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		// step 1: create an object
		Employee employee = new Employee(1001, "John Smith", 54656.56, "Engineering");
		
		try {
			// step 2: create a file stream
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			// create an object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object and write
			out.writeObject(employee);
			
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
}
