package com.heraizen.cj.collections.level2.studentInfo;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		StudentDetails studentDetails = new StudentDetails();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter your Choice\n1.Add new Student \t2.Search Student\t3.ViewStudent\t4.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name ");
				String name = sc.next();
				System.out.println("Enter E-mail");
				String email = sc.next();
				System.out.println("Enter the course");
				String course = sc.next();
				StudentDetails.addStudent(new Student(name, email, course));
				break;
			case 2:
				System.out.println("Enter id to search ");
				int idtoSearch = sc.nextInt();
				StudentDetails.viewStudent(idtoSearch);
				break;
			case 3:
				System.out.println("Student Details");
				StudentDetails.viewStudents();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("You are Entered Wrong option.Please select Correct option");
				break;
			}

		} while (true);

	}

}
