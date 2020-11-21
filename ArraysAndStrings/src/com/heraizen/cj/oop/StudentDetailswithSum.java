package com.heraizen.cj.oop;


public class StudentDetailswithSum {

	String name;
	int[] sub;
	int id;
	int totalMarks;
	

	public StudentDetailswithSum(String name, int[] sub) {
		this.name = name;
		this.sub = sub;
		this.totalMarks = 0;

	}

	public void calSum(int sub[]) {
		for (int i = 0; i < sub.length; i++) {
			totalMarks += sub[i];
		}
	}

	public void display() {
		System.out.println("Student Name " + name);
		for (int i = 0; i < sub.length; i++) {
			System.out.println("Marks are " + sub[i]);

		}
		calSum(sub);
		System.out.println("Sum ="+totalMarks);
	}

	
}
