package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of " + num + " is " + fact);
	}

}
