package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		int billingAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		billingAmount = sc.nextInt();
		int dis = 10;
		int temp = 100 - dis;
		if (billingAmount > 6000) {
			billingAmount = (billingAmount * temp) / 100;
		}
		System.out.println("Your net billing amount:" + billingAmount);
	}
}
