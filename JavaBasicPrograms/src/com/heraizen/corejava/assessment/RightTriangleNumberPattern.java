package com.heraizen.corejava.assessment;

public class RightTriangleNumberPattern {

	public static void main(String[] args) {

		int i, j, n = 1;
		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println("\n");
		}
	}

}

//
//1 2 3 4
//5 6 7
//8 9
//10