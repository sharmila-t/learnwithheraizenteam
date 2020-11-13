package com.heraizen.corejava.assessment;

public class pattern30 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");

			}
			System.out.println("\n");
		}
	}

}

//output 
//1 
//
//1 2 1 
//
//1 2 3 2 1 
//
//1 2 3 4 3 2 1 
//
//1 2 3 4 5 4 3 2 1