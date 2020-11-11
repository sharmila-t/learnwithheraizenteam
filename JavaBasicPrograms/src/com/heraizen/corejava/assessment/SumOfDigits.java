package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int num, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		while (num > 0) {
			temp = num % 10;
			sum = sum + temp;
			num = num / 10;

		}
		System.out.println("The sum of digits of the entered number is " + sum);
	}

}
