package com.vth.pattern.structural.facade;

public class Credit {
	public boolean hasGoodCredit(Customer c) {
		System.out.println("Check credit for " + c.getName());
		return true;
	}
}
