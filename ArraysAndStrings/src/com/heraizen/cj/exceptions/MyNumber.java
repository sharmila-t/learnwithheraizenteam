package com.heraizen.cj.exceptions;

import java.util.Scanner;

public class MyNumber {
	static int num1;
	static int num2;
	static double result;

	public MyNumber(int x, int y) {
		this.num1 = x;
		this.num2 = y;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		num1 = sc.nextInt();
		System.out.println("Enter the num2");
		num2 = sc.nextInt();
		System.out.println("Enter the choice to perform math operations 1.Add 2.sub 3.mul 4.div");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("The difference  of " + num1 + " and " + num2 + " is " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("The multipication  of " + num1 + " and " + num2 + " is " + result);
			break;
		case 4:
			try {
				result = num1 / num2;
				System.out.println("The division  of " + num1 + " and " + num2 + " is " + result);
			} catch (ArithmeticException e) {
				System.out.println(e);

			}

			break;
			default:
				System.out.println("Entered Wrong option");

		}

	}

}
