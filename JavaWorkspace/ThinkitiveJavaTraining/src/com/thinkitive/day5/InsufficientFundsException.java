package com.thinkitive.day5;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException() {
		super("Deduction amount is more than account balance");
	}
}
