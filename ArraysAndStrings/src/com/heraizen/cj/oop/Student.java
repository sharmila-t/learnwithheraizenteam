package com.heraizen.cj.oop;
public class Student {
	private int id;
	private String name;
	private String address;
	private static int count = 0;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	{
		count++;
	}

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("address=" + address);
		System.out.println("******************************");
	}

	public void setValues(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Student s = new Student(1001, "sharmila", "vellore");
		Student s1 = new Student(1002, "Swetha", "Pernambut");
		Student s2 = new Student(1003, "Sathish", "Masigam");
		s.display();
		s1.display();
		s2.display();
		
		System.out.println("Total no of count"+count);

	}
}
