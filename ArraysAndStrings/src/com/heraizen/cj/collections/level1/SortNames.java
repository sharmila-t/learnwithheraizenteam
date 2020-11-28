package com.heraizen.cj.collections.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNames {

	public static void main(String[] args) {
		String data[] = { "Sandhiya", "Asha", "Shilpa", "Sharmila", "Rishitha", "Sathish", "Swetha", "Sabarish",
				"Manish", "Yuva" };

		List<String> list = getResults(data);
		System.out.println(list);

	}

	public static List<String> getResults(String data[]) {
		List<String> list = new ArrayList<>();
		for (String names : data) {
			list.add(names);

		}
		List<String> result = list.stream().collect(Collectors.toList());
		Collections.sort(list);

		return list.stream().map(name -> name.substring(0,name.length() / 2).toLowerCase()+name.substring(name.length()/2,name.length()).toUpperCase()).collect(Collectors.toList());

	}

}
