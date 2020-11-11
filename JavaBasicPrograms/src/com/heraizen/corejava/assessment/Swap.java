package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int num1, num2, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 value:");
		num1 = sc.nextInt();
		System.out.println("Enter the num2 value:");
		num2 = sc.nextInt();
		System.out.println("Before swap, the values of num1=" + num1 + "and" + "num2=" + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap, the values of num1=" + num1 + "and num2=" + num2);

	}

}

