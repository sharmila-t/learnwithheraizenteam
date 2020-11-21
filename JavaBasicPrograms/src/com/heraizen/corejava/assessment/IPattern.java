package com.heraizen.corejava.assessment;

public class IPattern {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= 9; j++) {
				if ((i == 1) || (i == 7) || (i != 1 && j == 6)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println("\n");
		}
	}

}
