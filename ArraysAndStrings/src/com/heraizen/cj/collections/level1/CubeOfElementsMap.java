package com.heraizen.cj.collections.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CubeOfElementsMap {
	public static void main(String[] args) {
		Integer[] list = { 1, 2, 4, 6, 7, 9 };
		getMap(list);

	}

	public static Map<Integer, Integer> getMap(Integer numbers[]) {
		Map<Integer, Integer> cubeOfElement = new HashMap();

		for (Integer userInput : numbers) {
			cubeOfElement.put(userInput, (int) Math.pow(userInput, 3));
		}
		Set<Entry<Integer, Integer>> entrySet = cubeOfElement.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " --- " + entry.getValue());
		}
		
		return cubeOfElement;

	}
}



