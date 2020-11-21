package com.heraizen.cj.exception.empoloyee.hra;

public class EmployeeHra implements Employee {
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;

	public EmployeeHra(int empId, String empName, String designation, double basic, double hra) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
	}

	public EmployeeHra(int empId, String designation, double basic, double hra) {
		this.empId = empId;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
	}

	@Override
	public void printDET() {
		System.out.println("Employee Details");
		System.out.println("Employee Num" + this.empId);
		System.out.println("Employee empName" + this.empName);
		System.out.println("Employee basic" + this.basic);
		System.out.println("Employee hra" + this.hra);

	}

	@Override
	public void calculateHRA() {
		double hrabasedonSal = this.hra / 100 * this.basic;
		System.out.println("hra based on sal" + hrabasedonSal);

	}

}
