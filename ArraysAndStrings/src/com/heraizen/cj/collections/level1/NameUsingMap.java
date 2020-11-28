package com.heraizen.cj.collections.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class NameUsingMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1001, "Shalini");
		map.put(1002, "Sabarish");
		map.put(1003, "Sathish");
		map.put(1004, "Rishi");
		viewElements(map);
	}

	public static void viewElements(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
//		second method
//		map.forEach((k,v)->System.out.println("id = "+k +"name ="+v));

	}
}
