package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class AnnualIncome {

	public static void main(String[] args) {
		int empNo;
		int monSal;
		String empName;
		int yearSal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empno:");
		empNo = sc.nextInt();
		System.out.println("Enter the employee name:");
		empName = sc.next();
		System.out.println("Enter the monthly salary:");
		monSal = sc.nextInt();
		yearSal = monSal * 12;
		System.out.println("Hi" + " "+ empName + "! Your employee id is " + empNo + " , monthly salary is Rs " +" "+ monSal
				+ " and yearly salary is Rs" + yearSal + ".");

	}

}

