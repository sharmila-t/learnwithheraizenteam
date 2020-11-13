package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class ConvertNegativeIntoPositive {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num<0) {
			 num = Math.abs(num);
		}
		System.out.println("The result is:" + num);

	}

}


