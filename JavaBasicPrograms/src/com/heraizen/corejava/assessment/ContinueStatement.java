package com.heraizen.corejava.assessment;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if(i==j) {
					continue;
				}
				System.out.println(i + " " + j);
			}

		}

	}

}
//1 2
//1 3
//2 1
//2 3
//3 1
//3 2