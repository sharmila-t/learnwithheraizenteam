package com.heraizen.cj.exception.empoloyee.hra;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		 final double MANAGER_HRA = 10;
		final double OFFICER_HRA = 12;
		final double CLERK_HRA = 5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		int empId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Employee Name: ");
		String empName = scan.next();
		System.out.println("Enter the Employee's Designation: ");
		String designation = scan.next();
		System.out.println("Enter the basic: ");
		double basic = scan.nextDouble();
		try {
			if (basic < 500) {
				throw new LowSalException("Basic is less than 500");
			} else {
				System.out.println();

				if (designation.equalsIgnoreCase("manager")) {
					EmployeeHra employeeHra = new EmployeeHra(empId, empName, designation, basic, MANAGER_HRA);
					employeeHra.printDET();
					employeeHra.calculateHRA();
				} else if (designation.equalsIgnoreCase("officer")) {
					EmployeeHra employeeHra = new EmployeeHra(empId, empName, designation, basic, OFFICER_HRA);
					employeeHra.printDET();
					employeeHra.calculateHRA();
				} else if (designation.equalsIgnoreCase("clerk")) {
					EmployeeHra employeeHra = new EmployeeHra(empId, empName, designation, basic, CLERK_HRA);
					employeeHra.printDET();
					employeeHra.calculateHRA();
				}

			}
		} catch (LowSalException exe) {
			System.out.println(exe.getMessage());
		} finally {
			scan.close();
		}

	}

}

//another method 
//switch (designation) {
//case "Manager":
//	EmployeeHra employeeHra = new EmployeeHra(empId, designation, basic, MANAGER_HRA);
//	employeeHra.printDET();
//	employeeHra.calculateHRA();
//	break;
//case "Officer":
//	EmployeeHra employeeHra1 = new EmployeeHra(empId, designation, basic, OFFICER_HRA);
//	employeeHra1.printDET();
//	employeeHra1.calculateHRA();
//	break;
//case "Clerk":
//	EmployeeHra employeeHra2 = new EmployeeHra(empId, designation, basic, CLERK_HRA);
//	employeeHra2.printDET();
//	employeeHra2.calculateHRA();
//	break;
//
//}
