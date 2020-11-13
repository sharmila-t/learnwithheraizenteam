package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class NaturalNumDesc {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		num1 = sc.nextInt();
		System.out.print("The first "+num1+" natural numbers in descending order are: ");
		for (int i = num1; i >= 1; i--) {
			System.out.print( i + " ");

		}

	}

}
