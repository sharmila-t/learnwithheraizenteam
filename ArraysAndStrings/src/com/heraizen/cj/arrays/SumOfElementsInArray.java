package com.heraizen.cj.arrays;

import java.util.Scanner;

/**
 * 
 * @author Sharmila T
 *
 */
/*
 * Write a program to accept N value and create the array size N. Find the sum
 * of elements in the array.
 *
 */
public class SumOfElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		int arr[] = new int[sc.nextInt()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Element");
			arr[i] = sc.nextInt();
			sum += arr[i];/* calculating sum value */
		}
		System.out.println("Sum of the Element in the array is =" + sum);
		sc.close();
	}

}
