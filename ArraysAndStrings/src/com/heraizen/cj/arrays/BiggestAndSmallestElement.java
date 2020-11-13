package com.heraizen.cj.arrays;

import java.util.Scanner;

/***
 * 
 * @author Sharmila T
 *
 */
/*
 * Finding the smallest and biggest element from userinput array
 * 
 */
public class BiggestAndSmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements :");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = sc.nextInt();

		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max /* arr[i] value comparing with arr[0] if its greater its assigned to max */) {
				max = arr[i];
			}
			if (arr[i] < min /* arr[i] value comparing with arr[0] if its lesser its assigned to min */) {
				min = arr[i];

			}
		}
		sc.close();
		System.out.println("Biggest element is = " + max);
		System.out.println("the smallest element is = " + min);

	}

}
