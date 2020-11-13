package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		num = sc.nextInt();
		System.out.println("Multiplication table for " + num + " is :");
		for (int i = 1; i <= 10; i++) {
			int num1 = num * i;
			System.out.println(num + " * " + i + " = " + num1);

		}

	}

}
