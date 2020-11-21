package com.heraizen.cj.strings;

import java.util.Scanner;

public class NoOfVowelsAndConstants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String str = sc.nextLine();
		int vcount = 0, constcount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vcount++;
			} else if ((c >= 'a' && c <= 'z')) {
				constcount++;
			}

		}
		System.out.println("Vowel count" + vcount);
		System.out.println("Vowel count" + constcount);
		sc.close();
	}

}
