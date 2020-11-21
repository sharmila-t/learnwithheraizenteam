package com.heraizen.cj.exception.empoloyee.exp;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee num");
		int empNo = sc.nextInt();
		System.out.println("Enter the emloyee name");
		sc.nextLine();
		String ename = sc.nextLine();
		System.out.println("Enter employee expe");
		float exp = sc.nextFloat();

		try {
			if (exp > 2.5 && exp < 3.6) {
				Employee employee = new Employee(empNo, ename, exp);
				System.out.println("Employee Details"+employee.toString());
			}else {
				throw new IllegalArgumentException();
			}

		}
		finally {
			sc.close();
		}
	}

}
