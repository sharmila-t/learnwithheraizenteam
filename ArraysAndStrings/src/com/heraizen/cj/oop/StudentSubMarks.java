package com.heraizen.cj.oop;

import java.util.Scanner;

public class StudentSubMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sub = new int[5];
		System.out.println("Enter the name of the student");
		String name = sc.nextLine();
		for (int i = 0; i < sub.length; i++) {
			System.out.println("Enter the sub marks " + (i + 1));
			sub[i] = sc.nextInt();

		}
		StudentDetailswithSum student = new StudentDetailswithSum(name, sub);
		student.display();
		sc.close();

	}

}
