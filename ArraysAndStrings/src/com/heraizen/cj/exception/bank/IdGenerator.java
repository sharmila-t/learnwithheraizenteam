package com.heraizen.cj.exception.bank;

public final class IdGenerator {
	private static int id=100;
	private IdGenerator() {
		
	}
	static int newId() {
		return id++;
	}

}
