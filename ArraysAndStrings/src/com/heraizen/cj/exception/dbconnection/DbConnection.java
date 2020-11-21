package com.heraizen.cj.exception.dbconnection;

public class DbConnection {
	public static int count = 0;

	public static DbConnection getObject() {
		try {
			if (count > 1) {
				throw new IllegalArgumentException();
			} else {
				return new DbConnection();
			}
		} finally {

		}

	}

	private DbConnection() {
		count++;
		System.out.println("Count = " + count);
	}
}
