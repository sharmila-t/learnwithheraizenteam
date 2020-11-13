package com.heraizen.corejava.assessment;

public class AlphabetPattern {

	public static void main(String[] args) {

		int i, j, alphabet = 65;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				System.out.print((char)alphabet + " ");
				alphabet++;

			}
			System.out.println("\n");
		}
	}

}
