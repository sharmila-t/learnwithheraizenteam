package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {

		int num1, num2, difference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number num2:");
		num2 = sc.nextInt();
		difference = num1 - num2;
		if (difference > 0) {
			System.out.println("The result (difference) is:" + difference);
		} else {
			System.out.println("The result (difference) is:" + Math.abs(difference));
		}
	}

}
