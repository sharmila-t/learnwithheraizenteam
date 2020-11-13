package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		boolean prime = false;
		num = sc.nextInt();
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

	}

}
