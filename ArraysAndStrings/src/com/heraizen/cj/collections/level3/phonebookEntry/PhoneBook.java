package com.heraizen.cj.collections.level3.phonebookEntry;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	Map<String, String> phoneBook = new HashMap<>();

	public void addDetails(String phNo, String name) {
		phoneBook.put(phNo, name);

	}

	public String getName(String phNo) {
		if (phoneBook.isEmpty()) {
			System.out.println("Contact list is Empty");
		} else {
			for (Map.Entry<String, String> entryBook : phoneBook.entrySet()) {
				if (entryBook.getKey().equals(phNo)) {
					System.out.println(entryBook.getValue());
				}

				else {
					System.out.println("Sorry! No person found with the given number.");
				}
			}

		}

		return phNo;

	}

}
