package com.heraizen.cj.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		int ele1, ele2;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value");
		ele1 = sc.nextInt();
		System.out.println("enter the first value");
		ele2 = sc.nextInt();
		System.out.println("enter the 5 elements");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " value ");
			arr[i] = sc.nextInt();
		}
		boolean flag1 = false, flag2 = false;
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele1) {
				pos = i;
				flag1 = true;

			}
			if (arr[i] == ele2) {
				pos = i;
				flag2 = true;
			}

		}
		if (flag1 && flag2 && pos != -1)
			System.out.println("Success");
		else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
