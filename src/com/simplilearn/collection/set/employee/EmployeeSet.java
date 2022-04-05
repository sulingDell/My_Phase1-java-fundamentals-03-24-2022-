package com.simplilearn.collection.set.employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {

		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", 34534.456, "Engineering");
		Employee employee2 = new Employee(1002, "Will Smith", 676534.456, "Engineering");
		Employee employee3 = new Employee(1003, "Mike Smith", 889334.456, "Engineering");
		Employee employee4 = new Employee(1004, "Aria Smith", 223344.456, "HR");
		Employee employee5 = new Employee(1005, "Marry Smith", 88934534.456, "HR");

		// create a set of employees
		Set<Employee> empSet = new LinkedHashSet<Employee>();

		// add employee object into set
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		empSet.add(employee1); // not inserted
		empSet.add(employee4); // not inserted
		empSet.add(employee5);

		System.out.println(empSet);
		System.out.println("-----------");
		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------");
		for (Employee emp : empSet) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.dept);
			System.out.println("------");
		}

	}

}
