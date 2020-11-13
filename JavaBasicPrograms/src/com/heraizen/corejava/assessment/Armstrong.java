package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num, sum = 0, digit, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		temp = num;
		while (num > 0) {
			digit = num % 10;
			num = num / 10;
			sum = sum + (digit * digit * digit);
		}
		if(temp==sum) {
		System.out.println(temp+" is an Armstrong number");	
		}else {
			System.out.println(temp+" is  not an Armstrong number");	
		}
	}

}
