package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class CountNumOfDigit {

	public static void main(String[] args) {

		int num, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		while (num != 0) {
			num = num / 10;
			++count;

		}
		System.out.println("The number of digits in the entered number is "+count);
	}

}
