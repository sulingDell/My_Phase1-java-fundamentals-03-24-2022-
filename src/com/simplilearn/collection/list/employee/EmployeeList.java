package com.simplilearn.collection.list.employee;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeList {

	public static void main(String[] args) {
		// create multiple employee objects
		Employee  employee1 = new Employee(1001, "John Smith", 34534.456, "Engineering");
		Employee  employee2 = new Employee(1002, "Will Smith", 676534.456, "Engineering");
		Employee  employee3 = new Employee(1003, "Mike Smith", 889334.456, "Engineering");
		Employee  employee4 = new Employee(1004, "Aria Smith", 223344.456, "HR");
		Employee  employee5 = new Employee(1005, "Marry Smith", 88934534.456, "HR");
		
		// create a list of employee
		LinkedList<Employee> empList = new LinkedList<Employee>();
		
		// add data inot emList
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		
		// add at a specific index
		empList.add(2, employee4);

		// replace at a specific index
		empList.set(0, employee5);
		
		System.out.println(empList);
		
		
		System.out.println("----------------");

		// iteration over list by iterator
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < empList.size(); index++) {
			System.out.println("The index : " + index + " and value : " + empList.get(index));
		}


		System.out.println("----------------");
		// enhance for loop
		for (Employee emp : empList) {
			// System.out.println("The employee : " + emp);
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.dept);
			System.out.println("----------------");
		}
		
	}
}
