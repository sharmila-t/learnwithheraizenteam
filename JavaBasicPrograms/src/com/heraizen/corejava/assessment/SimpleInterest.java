package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) {
		int amt, years, simpleInterest;
		double interest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		amt = sc.nextInt();
		System.out.println("Enter the rate of interest");
		interest = sc.nextDouble();
		System.out.println("Enter the time (years)");
		years = sc.nextInt();
		simpleInterest = (int) ((amt * years * interest) / 100);
		System.out.println("Simple interest is " + simpleInterest);

	}

}
