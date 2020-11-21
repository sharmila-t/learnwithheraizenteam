package com.heraizen.cj.employee;

public class Employee {
	private int id;
	private String name;
	private double sal;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.sal=20000;
	}

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void disaply() {
		System.out.println("Employee Id= " + id);
		System.out.println("Employee Name= " + name);
		System.out.println("Employee sal= " + sal);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1001, "Rishitha", 35000);
		emp.disaply();
		Employee emp1 = new Employee(1003, "Manish");
		emp1.disaply();
	}
}
