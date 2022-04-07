package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ListDeserializationDemo {
	
	public static void main(String[] args) {
		try {
			// Read a file
			FileInputStream file = new FileInputStream("list-db.txt");
			// create a input stream object
			ObjectInputStream input = new ObjectInputStream(file);
			// method to de serialized object
			List<Employee> employees = (List<Employee>) input.readObject();
			
			System.out.println("--- Deserialization completed ! ---");
			
			for(Employee employee : employees) {
				System.out.println("-------------");
				System.out.println("Emp Id : "+ employee.id);
				System.out.println("Emp Name : "+ employee.name);
				System.out.println("Emp Salary : "+ employee.salary);
				System.out.println("Emp Dept : "+ employee.dept);
			}
			
			input.close();
			file.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
}
