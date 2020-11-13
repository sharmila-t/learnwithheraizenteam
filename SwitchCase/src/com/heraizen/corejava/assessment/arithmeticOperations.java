package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class arithmeticOperations {
	public static void main(String args[]) {
		double num1, num2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = sc.nextDouble();
		System.out.println("Enter num2");
		num2 = sc.nextDouble();
		System.out.println("1. add 2. mul 3. div 4. mod 5.sub ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
			break;
		case 2:
			result = num1 * num2;
			System.out.println("The multipication  of " + num1 + " and " + num2 + " is " + result);
			break;
		case 3:
			result = num1 / num2;
			System.out.println("The division  of " + num1 + " and " + num2 + " is " + result);

			break;
		case 4:
			result = num1 % num2;
			System.out.println("The modulo  of " + num1 + " and " + num2 + " is " + result);

			break;
		case 5:
			result = num1 - num2;
			System.out.println("The difference  of " + num1 + " and " + num2 + " is " + result);

			break;
		}

	}

}
