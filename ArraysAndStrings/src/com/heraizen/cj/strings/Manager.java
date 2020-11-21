package com.heraizen.cj.strings;

public class Manager {

	public static void main(String[] args) {
		Delimiters[] nameArr=DelimitersSeedData.getNames();
		for(Delimiters name:nameArr) {
			name.display();
		}

	}

}
