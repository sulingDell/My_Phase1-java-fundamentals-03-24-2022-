package com.simplilearn.collection.map.employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {

		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", 34534.456, "Engineering");
		Employee employee2 = new Employee(1002, "Will Smith", 676534.456, "Engineering");
		Employee employee3 = new Employee(1003, "Mike Smith", 889334.456, "Engineering");
		Employee employee4 = new Employee(1004, "Aria Smith", 223344.456, "HR");
		Employee employee5 = new Employee(1005, "Marry Smith", 88934534.456, "HR");

		// create an employee map
		Map<Integer, Employee> employeeMap = new LinkedHashMap<Integer, Employee>();

		// add employee objects
		employeeMap.put(1001, employee1);
		employeeMap.put(1002, employee2);
		employeeMap.put(1003, employee3);
		employeeMap.put(1004, employee4);
		employeeMap.put(1005, employee5);

		// print map
		System.out.println(employeeMap);

		System.out.println("Employee 1001 :> " + employeeMap.get(1001));
		System.out.println("Employee 1005 :> " + employeeMap.get(1005));

		// iterate over each value in map
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("--------");
			System.out.println(" Key :: " + entry.getKey());
			System.out.println(" Value :: " + entry.getValue());
		}

	}

}
