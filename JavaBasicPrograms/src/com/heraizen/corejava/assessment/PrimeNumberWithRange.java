package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class PrimeNumberWithRange {

	public static void main(String[] args) {
		int start, end, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower bound value:");
		start = sc.nextInt();
		System.out.println("Enter the upper bound value:");
		end = sc.nextInt();
		System.out.print("The prime numbers between " + start + " and " + end + " are: ");

		for (int i = start; i <= end; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {
				System.out.print(i + " ");
			}

		}

	}

}
