package com.heraizen.cj.exception.bankass;

public class NegativeAmount extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmount(String message) {
		super(message);
	}

}
