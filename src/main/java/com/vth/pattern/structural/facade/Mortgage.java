package com.vth.pattern.structural.facade;

//Facade class

public class Mortgage {
	Bank bank = new Bank();
	Loan loan = new Loan();
	Credit credit = new Credit();

	public boolean isEligible(Customer cust, int amount) {
		System.out.println(String.format("%s applies for %s loan\n", cust.getName(), amount));
		boolean eligible = true;
		// Check creditworthyness of applicant
		if (!bank.hasSufficientSavings(cust, amount)) {
			eligible = false;
		} else if (!loan.hasNoBadLoans(cust)) {
			eligible = false;
		} else if (!credit.hasGoodCredit(cust)) {
			eligible = false;
		}
		return eligible;
	}
}
