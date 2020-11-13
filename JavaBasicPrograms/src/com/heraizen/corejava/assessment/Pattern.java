package com.heraizen.corejava.assessment;

public class Pattern {

	public static void main(String[] args) {
		int i, j, n = 1;
		for (i = 1; i <= 4; i++) {
			if (i == 1 || i == 2 || i == 4) {
				for (j = 1; j <= i; j++) {
					System.out.print(n + " ");
					n++;
				}
			}

			if (i == 3) {

				for (j = 1; j <= i + 1; j++) {
					System.out.print(n + " ");
					n++;
				}
			}
			System.out.println("\n");

		}

	}

}
//1
//2 3
//4 5 6 7
//8 9 10 11
