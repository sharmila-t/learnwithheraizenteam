package com.heraizen.cj.collections.level1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ComparingNamesUsingSet {

	public static void main(String[] args) {
		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("David");
		uniqueNames.add("Scott");
		uniqueNames.add("Adam");
		uniqueNames.add("Jane");
		uniqueNames.add("Usman");
		uniqueNames.add("Shalini");
		System.out.println("Existing names are " + uniqueNames.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the removing name in the existing list");
		String names = sc.nextLine();
		checkNames(uniqueNames, names);

	}

	public static Set<String> checkNames(Set<String> listOfNames, String name) {
		if (listOfNames.iterator().hasNext()) {
			if (listOfNames.contains(name)) {
				listOfNames.remove(name);
				System.out.println("After Removing the name in the set :" + listOfNames);

			} else {
				System.out.println("Name not found");
			}

		}
//		second method
//		if(listOfNames.stream().anyMatch(n->n.equalsIgnoreCase(name)))
//		{
//			System.out.println("The name found in  list"+name);
//			listOfNames.remove(name);
//		}else {
//			System.out.println("Name not found");
//		}

		return listOfNames;

	}
}


