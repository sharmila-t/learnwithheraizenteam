package com.heraizen.corejava.assessment;

public class Matrix {

	public static void main(String[] args) {
		int matrix[][] = { { 5, 6, 7 }, { 4, 5, 6 }, { 5, 6, 7 } };
		int maxNum = matrix[0][0];
		int minNum = matrix[0][0];
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (maxNum < matrix[i][j]) {
					maxNum = matrix[i][j];
				} else if (minNum > matrix[i][j]) {
					minNum = matrix[i][j];
				}
				sum = sum + matrix[i][j];

			}

		}
		System.out.println(
				"Maximum Elemet = " + maxNum + "\nSmallest Element = " + minNum + "\nSum = " + sum);

	}

}
