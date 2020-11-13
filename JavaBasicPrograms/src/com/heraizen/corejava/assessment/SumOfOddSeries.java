package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SumOfOddSeries {

	public static void main(String[] args) {
		int sum = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		for (int i = 1; i <= num; i = i + 2) {
			sum = sum + i;

		}
		System.out.println("sum=" + sum);

	}

}
