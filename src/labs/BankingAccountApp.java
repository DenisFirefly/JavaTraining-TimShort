package labs;

public class BankingAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("54896357", 900);
		BankAccount acc2 = new BankAccount("46871123", 1000);
		BankAccount acc3 = new BankAccount("02598420", 1700);
		
		acc1.setName("Jim Carrey");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(800);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int ID = 1000;	// Internal ID
	private String accountNumber;  // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: ?" + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: ?" + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println(name + " your current balance is ?" + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: "  + name + "]\n" + "[Account number: " + accountNumber + "]\n" + "[Balance: ?" + balance + "]";
	}
	
}
