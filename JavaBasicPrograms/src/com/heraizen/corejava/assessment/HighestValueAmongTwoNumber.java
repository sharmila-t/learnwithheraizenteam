package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class HighestValueAmongTwoNumber {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number num2:");
		num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("The bigger of the two numbers entered ("+num1+ " and "+ num2+  ") is:"+num1);

		}else {
			System.out.println("The bigger of the two numbers entered ("+num1+ "  and"+ num2+  ") is:"+num2);
	
		}

	}

}
