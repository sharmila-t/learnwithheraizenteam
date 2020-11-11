package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		float sum = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			sum = sum + (float) 1 / i;
		}
		System.out.println("sum = " + sum);

	}

}
