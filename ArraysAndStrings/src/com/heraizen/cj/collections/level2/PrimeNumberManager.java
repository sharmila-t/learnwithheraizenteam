package com.heraizen.cj.collections.level2;

import java.util.Scanner;

public class PrimeNumberManager {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		GeneratePrime.generatePrimes(num);
	}

}
