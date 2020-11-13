package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class SumofCubeSeries {

	public static void main(String[] args) {

		float sum = 0;
		int num,cube;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			cube=i*i*i;
			sum = sum + (float) 1 / cube;

		}
		System.out.println("Sum =" + sum);
	}

}




