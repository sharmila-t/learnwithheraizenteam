package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int sub1, sub2, sub3;
		double sum, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject:");
		sub1 = sc.nextInt();
		System.out.println("Enter the marks scored in 2nd subject:");
		sub2 = sc.nextInt();
		System.out.println("Enter the marks scored in 3rd subject:");
		sub3 = sc.nextInt();
		sum = sub1 + sub2 + sub3;
		avg = sum / 3;
		char grade;
		System.out.println("Total marks: " + sum);
		System.out.println("Average is:" + avg);
		if (avg < 35) {
			grade = 'C';
			System.out.println("Grade : " + grade);
		} else if (avg > 35 && avg < 60) {
			grade = 'B';
			System.out.println("Grade : " + grade);
		} else {
			grade = 'A';
			System.out.println("Grade : " + grade);
		}
// another way tried
//		switch (grade) {
//		case 'A':
//			System.out.println("Grade is: A");
//			break;
//		case 'B':
//			System.out.println("Grade is: B");
//			break;
//		case 'C':
//			System.out.println("Grade is: C");
//		}

	}

}

