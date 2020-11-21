package com.heraizen.cj.employee;

public class CalculateSum {
	public int sum(int ...values) {
		int total=0;
		for(int val:values) {
			total+=val;
		}
		return total;
	}

	public static void main(String[] args) {
		CalculateSum obj=new CalculateSum();
		System.out.println("sum = "+obj.sum(10,20));
		System.out.println("sum = "+obj.sum(10,20,30));

	}

}
/*
 * int sum(int a, int b) { return a + b;
 * 
 * }
 * 
 * int sum(int a, int b, int c) { return a + b + c;
 * 
 * }
 * 
 * public static void main(String[] args) { CalculateSum obj=new CalculateSum();
 * obj.sum(10, 10); obj.sum(30, 60, 60);
 * 
 * }
 */