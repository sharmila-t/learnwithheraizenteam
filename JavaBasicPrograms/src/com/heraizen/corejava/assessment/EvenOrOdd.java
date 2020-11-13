package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("The entered number " + num + " is even");
		}else {
			System.out.println("The entered number " + num + " is odd");

		}

	}

}
