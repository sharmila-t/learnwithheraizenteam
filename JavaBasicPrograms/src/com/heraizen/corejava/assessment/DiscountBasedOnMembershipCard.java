package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class DiscountBasedOnMembershipCard {

	public static void main(String[] args) {
		int billedAmount;
		int maxDis;
		int minDis;
		maxDis = 100 - 10;
		minDis = 100 - 3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		billedAmount = sc.nextInt();
		System.out.println("Do you have a membership card?");
		char confirmation = sc.next().charAt(0);
		if (confirmation == 'Y') {
			int payableAmt = (billedAmount * maxDis) / 100;
			int discountAmt = billedAmount - payableAmt;

			System.out.println("Thank you! Your total bill amount is Rs " + billedAmount + " , discount is Rs "
					+ discountAmt + " and net amount payable is Rs " + payableAmt + ".");

		} else {
			int payableAmt = (billedAmount * minDis) / 100;
			int discountAmt = billedAmount - payableAmt;
			System.out.println("Thank you! Your total bill amount is Rs " + billedAmount + " , discount is Rs "
					+ discountAmt + " and net amount payable is Rs " + payableAmt + ".");

		}

	}

}

