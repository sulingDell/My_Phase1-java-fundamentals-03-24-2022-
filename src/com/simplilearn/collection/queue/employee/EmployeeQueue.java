package com.simplilearn.collection.queue.employee;

import java.util.ArrayDeque;
import java.util.Queue;

public class EmployeeQueue {

	public static void main(String[] args) {

		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", 34534.456, "Engineering");
		Employee employee2 = new Employee(1002, "Will Smith", 676534.456, "Engineering");
		Employee employee3 = new Employee(1003, "Mike Smith", 889334.456, "Engineering");
		Employee employee4 = new Employee(1004, "Aria Smith", 223344.456, "HR");
		Employee employee5 = new Employee(1005, "Marry Smith", 88934534.456, "HR");

		// create a employee queue
		Queue<Employee> employeeQueue = new ArrayDeque<Employee>();

		// add employee in queueu
		employeeQueue.add(employee1);
		employeeQueue.add(employee2);
		employeeQueue.add(employee3);
		employeeQueue.add(employee4);
		employeeQueue.add(employee5);

		System.out.println(employeeQueue);

		// peek -> checking top or high priority element
		System.out.println("Head : > " + employeeQueue.peek());
		System.out.println("Head : > " + employeeQueue.element());
		
		// iterate over employee
		for(Employee  emp : employeeQueue) {
			System.out.println("-------");
			// System.out.println(emp);
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.dept);
		}

	}

}

