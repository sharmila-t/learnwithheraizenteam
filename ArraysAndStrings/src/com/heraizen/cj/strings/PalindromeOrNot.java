package com.heraizen.cj.strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;

		System.out.println("Enter the name");
		name = sc.nextLine();
		if (new StringBuilder(name.toLowerCase()).reverse().toString().equals(name.toLowerCase())) {
			System.out.println(name + " is Palindrome");

		} else {
			System.out.println(name + " is not Palindrome");
		}
		System.out.println(name + " In uppper case  " + name.toUpperCase());
		System.out.println(name + " In lower case  " + name.toLowerCase());

		sc.close();
	}

}
