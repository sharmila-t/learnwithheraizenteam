package com.heraizen.cj.recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = sum(num);
		System.out.println("Sum = " + sum);
		sc.close();
	}

	private static int sum(int num) {
		if (num != 0) {
			return num + sum(num - 1);
		}
		return num;
	}

}
