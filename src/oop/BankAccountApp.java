package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Roger Thur";
		//With Encapsulation : public API methods
		acc1.setName("Roger Thur");
		System.out.println(acc1.getName());
		acc1.setSsn("2554584");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "215487";
		acc1.balance = 12000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		System.out.println("************");
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Acoount");
		acc2.accountNumber = "215487";
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "215487";
		acc3.checkBalance();
		
		System.out.println("************");
		
		/*
		System.out.println("Member 1 routing number:" + acc1.routingNumber );
		System.out.println("Member 2 routing number:" + acc2.routingNumber );
		System.out.println("Member 3 routing number:" + acc3.routingNumber );
		*/
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.setName("Juan");
		cd1.getName();
		cd1.interestRate = 0.045;
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		
	}

}
