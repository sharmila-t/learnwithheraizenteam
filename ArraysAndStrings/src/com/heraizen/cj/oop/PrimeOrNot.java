package com.heraizen.cj.oop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		System.out.println("Enter the choice 1.factorial 2.Table 3.Prime or not");
		int choice = sc.nextInt();
		boolean prime = false;

		switch (choice) {
		case 1:
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("The factorial of " + num + " is " + fact);
			break;
		case 2:
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
			break;
		case 3:
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					prime = true;
					break;

				}
			}
			if (!prime) {
				System.out.println("The entered number " + num + " is a prime number");

			} else {
				System.out.println("The entered number " + num + " is not a prime number");

			}
			break;
		default:System.out.println("Choice is Wrong");
		}

	}

}
