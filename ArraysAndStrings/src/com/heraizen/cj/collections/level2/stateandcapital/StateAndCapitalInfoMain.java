package com.heraizen.cj.collections.level2.stateandcapital;

import java.util.Scanner;

public class StateAndCapitalInfoMain {

	public static void main(String[] args) {
		StateAndCaptitalInfo stateAndCaptitalInfo = new StateAndCaptitalInfo();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Choice\n1.Add new State And Captital Info \t2.Search State\t3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter state ");
				String state = sc.next();
				System.out.println("Enter Capital");
				String capital = sc.next();
				stateAndCaptitalInfo.add_state_capital(state, capital);
				break;
			case 2:
				System.out.println("Enter state ");
				String stateToSearch = sc.next();
				stateAndCaptitalInfo.view_capital(stateToSearch);
				break;
			case 3:
				System.exit(0);

			default:
				System.out.println("You are Entered Wrong option.Please select Correct option");
				break;
			}

		} while (true);
	}

}
