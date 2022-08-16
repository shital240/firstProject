package com.codeo.exceptions;

public class InsufficientBankBalance extends Exception {

	public String getMessage() {
		String message="Insufficient Bank Balance Exception";
		return message;
	}
}
