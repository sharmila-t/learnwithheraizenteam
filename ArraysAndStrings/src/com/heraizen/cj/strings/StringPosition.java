package com.heraizen.cj.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names");
		String textString = sc.nextLine();
		System.out.println("Enter the name to search");
		String searchkey = sc.nextLine();
		String[] arrlist = textString.split(",");
		for (int i = 0; i < arrlist.length; i++) {
			if (arrlist[i].equals(searchkey)) {
				System.out.println(searchkey + " found at " + i + "position");
			}

		}
	}
}
