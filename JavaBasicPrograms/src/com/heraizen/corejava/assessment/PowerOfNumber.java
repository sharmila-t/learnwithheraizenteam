package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		int base, power;
		long res = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		base = sc.nextInt();
		System.out.println("Enter the power(exponent) value");

		power = sc.nextInt();
		while (power != 0) {
			res = res * base;
			power--;

		}
		System.out.println("The result is " + res);
	}

}
