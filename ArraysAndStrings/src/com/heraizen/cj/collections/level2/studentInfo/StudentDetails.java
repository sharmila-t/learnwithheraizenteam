package com.heraizen.cj.collections.level2.studentInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentDetails {
	static Map<Integer, Student> studentDetails = new HashMap<>();

	public static void addStudent(Student s) {
		studentDetails.put(s.getId(), s);
	}

	public static void viewStudents() {
		System.out.printf("%-8s %-10s %-10s %-10s", "Id", "NAME", "E-mail", "Course");
		studentDetails.forEach((key, value) -> System.out.printf("\n%-8d %-10s %-10s %-10s", key, value.getName(),
				value.getEmail(), value.getCourse()));

	}

	public static String viewStudent(Integer id) {
		if (studentDetails.isEmpty()) {
			System.out.println("student Details list is Empty");
		} else {
			for (Entry<Integer, Student> studentInfo : studentDetails.entrySet()) {
				if (studentInfo.getKey().equals(id)) {
					System.out.println(studentInfo.getValue());
				}

				else {
					System.out.println("“The Student id is not existing”");
				}
			}

		}

		return studentDetails.toString();

	}

}
