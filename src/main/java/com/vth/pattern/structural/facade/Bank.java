package com.vth.pattern.structural.facade;

public class Bank {
	public boolean hasSufficientSavings(Customer c, int amount) {
		System.out.println("Check bank balance for " + c.getName());
		return true;
	}
}
