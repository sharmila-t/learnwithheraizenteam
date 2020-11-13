package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class NumberOfPrimeDigits {

	public static void main(String[] args) {
		int num, digit, count = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = sc.nextInt();
		temp = num;
		while (temp != 0) {
			digit = temp % 10;
			temp = temp / 10;
			if(digit==2 || digit==3 || digit==5 || digit==7) {
				count++;
			}
		}
		System.out.println(num+" Number of prime digits in the entered number is "+count);


	}

}
