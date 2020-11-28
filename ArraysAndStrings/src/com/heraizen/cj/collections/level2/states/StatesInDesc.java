package com.heraizen.cj.collections.level2.states;

import java.util.HashSet;
import java.util.Set;

public class StatesInDesc {
	private static Set<String> listOfStates = new HashSet<>();

	public static void addStates(String state) {
		if (listOfStates.stream().anyMatch(n -> n.equalsIgnoreCase(state))) {
			System.out.println("Entered State already present");

		} else {
			listOfStates.add(state);
		}

	}

	public static void viewStates() {
		listOfStates.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
	}

}
