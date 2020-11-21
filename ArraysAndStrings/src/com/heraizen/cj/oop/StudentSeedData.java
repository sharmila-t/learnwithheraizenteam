package com.heraizen.cj.oop;

public  class StudentSeedData {


	public Student[] getStudent() {
		Student s = new Student(1001, "sharmila", "vellore");
		Student s1 = new Student(1002, "Swetha", "Pernambut");
		Student s2 = new Student(1003, "Sathish", "Masigam");

		return new Student[]{s,s1,s2};

	}
	

}
