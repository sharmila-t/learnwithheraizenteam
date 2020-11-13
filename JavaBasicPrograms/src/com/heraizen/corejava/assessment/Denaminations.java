package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class Denaminations {
	public static void main(String args[]) {

		int amt, count = 0;
		int denotes[] = { 1000, 100, 10, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		amt = sc.nextInt();
		int i = 0;

		while (i < denotes.length) {
			count = amt / denotes[i];
			if (count != 0) {
				System.out.println("count" + count);
				System.out.println(denotes[i] + "\tx\t= " + count + "\t= " + denotes[i] * count);

			}

			amt = amt % denotes[i];
			i++;
			
		}

	}
}


//using for loop 
//for (int i = 0; i < denotes.length; i++) {
//
//	count = amt / denotes[i];
//	if (count != 0) {
//		System.out.println(denotes[i] + "\tx\t= " + count + "\t= " + denotes[i] * count);
//
//	}
//
//	totalnotes = totalnotes + count;
//	amt = amt % denotes[i];
//}