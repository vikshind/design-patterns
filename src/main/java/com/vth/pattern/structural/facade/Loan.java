package com.vth.pattern.structural.facade;

public class Loan {
	public boolean hasNoBadLoans(Customer c) {
		System.out.println("Check Loan repayment history for " + c.getName());
		return true;
	}
}
