package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class IncrementEachDigit {

	public static void main(String[] args) {

		int num, digit, sum = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 digit ");
		num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			sum = sum + (digit + 1) % 10 * i;
			i = i * 10;
			num = num / 10;

		}
		System.out.println("output : " + sum);
	}

}

