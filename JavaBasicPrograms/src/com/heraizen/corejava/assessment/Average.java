package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double person1, person2, person3, sum, avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		person1 = sc.nextDouble();
		System.out.println("Enter the weight of the second person:");
		person2 = sc.nextDouble();
		System.out.println("Enter the weight of the third person: ");
		person3 = sc.nextDouble();
		sum = person1 + person2 + person3;
		avg = sum / 3;
		System.out.println("The sum of weight of the 3 persons is" + " " + sum + " " + "Kgs and the average weight is "
				+ avg + " " + "kgs");

	}

}
