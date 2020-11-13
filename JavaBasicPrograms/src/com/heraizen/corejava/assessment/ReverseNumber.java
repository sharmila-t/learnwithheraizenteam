package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, digit, reversed = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		while(num!=0) {
			digit=num%10;
			reversed = reversed*10+digit;
			num=num/10;
			
		}
		System.out.println("Reverse of the entered number is  "+reversed);
	}

}

 