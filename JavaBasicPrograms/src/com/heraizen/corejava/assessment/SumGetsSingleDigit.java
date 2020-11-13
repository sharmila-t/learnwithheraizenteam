package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SumGetsSingleDigit {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		while (num > 0||sum>9) {
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;

		}
		System.out.println("Single digit sum is: " +sum);

	}

}
