package com.heraizen.cj.arrays;

import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row");
		int rows = sc.nextInt();
		System.out.println("Enter the no of column");
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the " + (i + 1) + " element");

			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}

		}
		sc.close();
		System.out.println("Entered matrix");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}

		}
		System.out.println();
		findMaxAndMin(a);
		diagnoalSum(a);
//		transpose matrix 
		int transposeMatrix[][] = new int[cols][rows];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				transposeMatrix[i][j] = a[j][i];

			}

		}
		System.out.println("Transpose of given matrix is:");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

//diagnoal sum 
	private static void diagnoalSum(int[][] a) {
		int diagnoalSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					diagnoalSum += a[i][j];
				}
			}

		}
		System.out.println("Diagnol sum = " + diagnoalSum);
	}

//find min ,max nd sum 
	private static void findMaxAndMin(int[][] a) {
		int min = a[0][0];
		int max = a[0][0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (min > a[i][j]) {
					min = a[i][j];

				}
				if (max < a[i][j]) {
					max = a[i][j];
				}
				sum += a[i][j];
			}

		}
		System.out.println("min element is " + min + "\n" + "max element is " + max + "\nsum = " + sum);

	}

}
