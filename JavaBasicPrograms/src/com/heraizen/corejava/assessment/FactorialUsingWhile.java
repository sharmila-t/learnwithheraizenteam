package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String[] args) {

		int num, fact = 1, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("the factorial of the " + num + "is " + fact);
	}

}
