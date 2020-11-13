package com.heraizen.corejava.assessment;

public class IdentityMatrixPattern {

	public static void main(String[] args) {
		int i, j, n;
		n = 19;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				if (i == j) {
					System.out.print(n + " ");
				} else {
					System.out.print("0" + " ");
				}

			}
			System.out.println("\n");
		}

	}

}
//19 0 0 
//
//0 19 0 
//
//0 0 19 