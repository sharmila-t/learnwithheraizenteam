package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		num1 = sc.nextInt();
		System.out.print("First " + num1 + " natural numbers are :");
		for (int i = 1; i <= num1; i++) {
			System.out.print(i + " ");

		}

	}

}
