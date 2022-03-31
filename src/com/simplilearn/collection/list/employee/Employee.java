package com.simplilearn.collection.list.employee;

public class Employee {
	
	// data properties
	public int id;
	public String name;
	public double salary;
	public String dept;
	
	// constructors
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
}
