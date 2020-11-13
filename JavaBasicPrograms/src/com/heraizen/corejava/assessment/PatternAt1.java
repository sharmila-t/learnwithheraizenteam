package com.heraizen.corejava.assessment;

public class PatternAt1 {
	public static void main(String[] args) {
		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 4; j++) {
				if ((i == 2 && j == 2) || (i == 2 && j == 3) || (i == 4 && j == 2) || (i == 4 && j == 3)
						|| (i == 5 && j == 2) || (i == 5 && j == 3)) {
					System.out.print(" " + " ");

				} else {
					System.out.print("@" + " ");

				}

			}
			System.out.println("\n");
		}

	}

}

//@ @ @ @
//@     @
//@ @ @ @
//@     @
//@     @
