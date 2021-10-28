package Lab2;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		StudentDatabase acc1 = new StudentDatabase("Mike Shinoda", "125467893");
		acc1.setEmailID();
		acc1.enroll();
		acc1.checkBalance();
		acc1.pay(50);
		acc1.deposit(50);
		acc1.deposit(50);
		acc1.pay(30);
		acc1.showCourses();
		acc1.bookCourse("Cooking");
		acc1.bookCourse("Climbing");
		acc1.showCourses();
		acc1.setPhone("+49478565987");
		acc1.setCity("Dortmud");
		acc1.setState("NRW");
		System.out.println(acc1.toString());
	}

}

class StudentDatabase {
	
	// Properties of the student database
	private static int ID = 100;
	private String accountNumber;	// ID + random 4 digits(1000 - 9000) + last 4 of SSN
	private String name;
	private String SSN;
	private String emailID;			// Automatisation based on the name
	private double balance = 0;
	private String courses = "";
	private String phone;
	private String city;
	private String state;
	
	StudentDatabase(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		//ID++;
		setAccountNumber();
	}
	
	public void setAccountNumber() {
		int random = (int) (Math.random() * (9000 - 1000 + 1) + 1000);
		accountNumber = ID + "" + random + SSN.substring(5, 9);
		System.out.println("Account number: " + accountNumber);
	}
	
	public void setEmailID() {
		String nameMail = name.toLowerCase().replace(" ", "");
		emailID = nameMail + "@studentdatabase.com";
		System.out.println("Your student email adress: " + emailID);
	}
	
	public void enroll() {
		System.out.println("You have been succesfully enrolled.");
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit: €" + amount +"\nBalance: €" + balance);
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		if (balance < 0) {
			System.out.println("Insuficiant funds! Your transaction has been canceled!");
			balance = balance + amount;
			checkBalance();
		}
		else checkBalance();
	}

	public void checkBalance() {
		System.out.println("Your current balance: €" + balance);
	}
	
	public void showCourses() {
		if (courses == "") {
			System.out.println("You still didn't book any courses");
		}
		else
			System.out.println("You have the folowing courses: " + courses);
	}
	
	public void bookCourse(String course) {
		courses = courses + course + "; ";
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "[Name: "  + name + "]\n" + "[Account number: " + accountNumber + "]\n" + "[Student Email: " + emailID + "]\n" + "[Phone number: " + phone + "]\n" + "[City, State: " + city + ", " + state +  "]\n" + "[Balance: €" + balance + "]";
	}
}
