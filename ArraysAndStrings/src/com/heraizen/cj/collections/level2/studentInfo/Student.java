package com.heraizen.cj.collections.level2.studentInfo;

public class Student {
	public static int id = 10001;
	private String name, email, course;

	public Student(String name, String email, String course) {
		id++;
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [Name=").append(name).append(", E-mail=").append(email).append(", Course=")
				.append(course).append("]");
		return builder.toString();
	}

}
