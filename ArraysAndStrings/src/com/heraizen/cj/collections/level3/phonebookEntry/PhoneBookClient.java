package com.heraizen.cj.collections.level3.phonebookEntry;

import java.util.Scanner;

public class PhoneBookClient {

	public static void main(String[] args) {
		PhoneBook phone = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Choice\n1.Add new phoneBook Entry\t2.SearchName\t3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Phone Number ");
				String phNo = sc.next();
				System.out.println("Enter the name");
				String name = sc.next();
				phone.addDetails(phNo, name);
				break;
			case 2:
				System.out.println("Enter Phone Number ");
				String phNoToSearch = sc.next();
				phone.getName(phNoToSearch);
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
