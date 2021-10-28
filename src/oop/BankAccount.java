package oop;

public class BankAccount implements IRate {
	// Define variables 
	String accountNumber;
	
	// static >> belongs to the CLASS not the instance 
	// final >> constant (often static final)
	private static final String routingNumber = "054657";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have No return type
	BankAccount() {
		System.out.println("New Account created");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		// InitDeposit, accountType, Msg are local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Old balance: €" + balance);
		System.out.println("Initial deposit of: €" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least €1, 000!";
			System.out.println(Msg);
		}
		else {
			Msg = "Thanks for your initial deposit!";
			System.out.println(Msg);
		}
		balance = balance+initDeposit;
	}
	
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name ="Mr./Ms." + name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting rate...");
	}
	public void increaseRate() {
		System.out.println("Increasing rate...");
	}
	
	
	
	
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private: can be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction is: " + activity);
		System.out.println("Your new balance is: €" + balance);
	}
	
	void checkBalance() {
		System.out.println("New balance: €" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT: #"  + accountNumber + ". ROUTING: #" + routingNumber + ". BALANCE: €" + balance + " ]";
	}

}
