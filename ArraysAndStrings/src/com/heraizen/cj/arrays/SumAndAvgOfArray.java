package com.heraizen.cj.arrays;

import java.util.Arrays;

public class SumAndAvgOfArray {
	/*
	 * Write a program that allows you to create an integer array of 18 elements
	 * with the following values: int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,}. The
	 * program computes the sum of element 0 to 14 and stores it at element 15,
	 * computes the average and stores it at element 16 and identifies the smallest
	 * value from the array and stores it at element 17.
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 2, 0, 0, 0};
		int sum = 0, min=a[0];
		System.out.println("Before" + Arrays.toString(a));
		for (int i = 0; i < 14; i++) {
			sum += a[i];
			if (a[i] < min) {
				min = a[i];
			}

		}
		a[14] = sum;
		a[15] = sum / 14;
		a[16] = min;
		System.out.println("after" + Arrays.toString(a));

	}

}
