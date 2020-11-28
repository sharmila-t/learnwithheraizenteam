package com.heraizen.cj.collections.level1;

import java.util.ArrayList;
import java.util.List;

public class ProcessingList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Desktop");
		list.add("Keyboard");
		list.add("Mouse");
		if (list.isEmpty()) {
			System.out.println("List is empty ");
		} else {
			showElements(list);
		}

	}

	public static void showElements(List<String> list) {
		for (String product : list) {
			System.out.println(product);

		}
//		second method
//		list.forEach(System.out::println);

	}

}
