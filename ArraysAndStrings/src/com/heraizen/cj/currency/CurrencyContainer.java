package com.heraizen.cj.currency;

public class CurrencyContainer {
	public Currency getCurrency(String country) {
		if (country.toLowerCase().equals("India".toLowerCase()))
			return new India();
		else if (country.toLowerCase().equals("UK".toLowerCase()))
			return new Uk();
		else if (country.toLowerCase().equals("USA".toLowerCase()))
			return new Usa();
		else

			throw new IllegalArgumentException("Please give correct country name");

	}

}
