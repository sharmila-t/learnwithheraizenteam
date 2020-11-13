package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0, second = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		num = sc.nextInt();
//		one logic 1
//		System.out.print("Fibonacci series up to the entered number is: " + first + " " + second + " ");
//		for (int i = 2; i < num; i++) {
//			int sum = first + second;
//			System.out.print(sum + " ");
//			first = second;
//			second = sum;
//
//		}
		System.out.print("Fibonacci series up to the entered number is: " );
		for (int i = 1; i <= num; i++) {
			System.out.print(first+" ");
			int sum = first + second;
			first = second;
			second = sum;
		}

	}

}
