package com.heraizen.cj.interfac.custom;

public class UserList {
	private String[] names;

	public UserList() {
		names = "Sharmi,Shalini,Rishi,Sathish,Sabarish,Swetha,Yuva,Manish,Thanshu,Jesvik".split(",");
	}

	MyIterator getIterator() {
		return new X();
	}

	class X implements MyIterator {
		int count = 0;

		@Override
		public boolean hasNext() {

			return count < names.length;
		}

		@Override
		public String next() {
			if (count >= names.length) {
				throw new ArrayIndexOutOfBoundsException(
						"Size is " + names.length + "but you are trying to access index" + count);
			}
			return names[count++];
		}

	}

}
