package com.vth.pattern.structural.facade;

public class Main {
	public static void main(String[] args) {
		// Facade
		Mortgage mortgage = new Mortgage();
		// Evaluate mortgage eligibility for customer
		Customer customer = new Customer("Ann McKinsey");
		boolean eligible = mortgage.isEligible(customer, 125000);
		System.out.println("\n" + customer.getName() + " has been " + (eligible ? "Approved" : "Rejected"));
	}
}
