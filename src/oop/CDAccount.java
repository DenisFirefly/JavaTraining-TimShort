package oop;

public class CDAccount extends BankAccount implements IRate {
	
	double interestRate;
	
	void compount() {
		System.out.println("Compounding interest:...");
		balance = balance+(balance * interestRate);
		System.out.println("In a month with interest rate of " + interestRate + " you will have: €" + balance);
	}

}
