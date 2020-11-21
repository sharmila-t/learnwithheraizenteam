package com.heraizen.cj.recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		int hcf=gcd(num1,num2);
		System.out.println("The GCD of two number is" + hcf);

	}

	public static int gcd(int num1, int num2) {
		if (num2 != 0) {
			return gcd(num2, num1 % num2);
		}else {
			return num1;
		}

		
	}

}
