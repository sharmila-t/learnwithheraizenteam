package com.heraizen.cj.collections.level2.states;

import java.util.Scanner;

public class StatesDescManager {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int noOfState=0;
		while(noOfState!=5) {
			System.out.println("Enter the   State = >");
			StatesInDesc.addStates(sc.nextLine());
			noOfState++;
		}

		StatesInDesc.viewStates();
		sc.close();

	}

}
