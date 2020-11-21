package com.heraizen.cj.strings;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First name");
		String fname = scan.next();
		System.out.println("Enter middle name");
		String middleName = scan.next();
		System.out.println("Enter the last name");
		String lname = scan.next();
		System.out.println(fname + "-"+middleName+"-"+lname);

	}

}
