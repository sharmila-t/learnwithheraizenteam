package com.heraizen.cj.interfac.custom;

public class Driver {

	public static void main(String[] args) {
		UserList list = new UserList();
		MyIterator myiterator = list.getIterator();
		while (myiterator.hasNext()) {
			String name = myiterator.next();
			System.out.println(name);
		}

	}

}
