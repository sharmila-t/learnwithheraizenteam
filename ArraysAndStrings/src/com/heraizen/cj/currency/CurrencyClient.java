package com.heraizen.cj.currency;

public class CurrencyClient {

	public static void main(String[] args) {

		CurrencyContainer cc = new CurrencyContainer();
		cc.getCurrency("india").getCurrency();
		cc.getCurrency("Uk").getCurrency();
		cc.getCurrency("Usa").getCurrency();
		cc.getCurrency("Chaina").getCurrency();
	}

}
