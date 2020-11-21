package com.heraizen.cj.strings;

import java.util.Scanner;

public class Delimiters {
	private String fname;
	private String middleName;
	private String lastName;
	public static int  count=0;
	
	
	
	public Delimiters(String fname, String middleName, String lastName) {
		super();
		this.fname = fname;
		this.middleName = middleName;
		this.lastName = lastName;
	}


	public  void display() {
		System.out.println("First Name ="+fname);
		System.out.println("Middle Name ="+middleName);
		System.out.println("Last Name ="+lastName);

	}
	{
		count++;
	}


	public void setValues(String fname, String middleName, String lastName ) {
		this.fname = fname;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Delimiters [fname=" + fname + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}

}
