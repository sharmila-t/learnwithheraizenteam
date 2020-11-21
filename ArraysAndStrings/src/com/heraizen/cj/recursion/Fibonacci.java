package com.heraizen.cj.recursion;

import java.util.Scanner;

public class Fibonacci {
	 static int first = 0, second = 1, temp=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.print(first+" "+second);
		fibonacci(num-2);
		sc.close();

	}
	private static void fibonacci(int num) {
		if(num>0) {
			temp=first+second;
			first=second;
			second=temp;
			System.out.print(" "+temp);
			fibonacci(num-1);
		}
				
	}
}
