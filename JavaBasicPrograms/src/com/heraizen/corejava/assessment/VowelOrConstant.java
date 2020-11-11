package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		boolean isVowel = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;

		}
		if (isVowel) {
			System.out.println(c + "  is a vowel");
		} else {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				System.out.println(c + " is a constant");
			} else {
				System.out.println("Its not a alphabetic");
			}
		}
	}

}
