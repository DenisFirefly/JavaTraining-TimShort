package oop;



class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " Is sleeping");
	}
	
}


public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Denis";
		person1.email = "denisfirefly@gmail.com";
		person1.phone = "088542356";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		
		person2.name = "Maria";
		person2.email = "maria@abv.bg";
		person2.phone = "089554214";
		
		person2.sleep();
		
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Denis";
		String email = "denisfirefly@gmail.com";
		String phone = "088542356";
		
		// Action, activity, behavior
		// System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		// What if we wanted to do this for another person?
		String name2 = "Maria";
		String email2 = "maria@gmail.com";
		String phone22 = "089554214";
		
		// Action, activity, behavior
		// System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating.");
		
		// What about binding attributes and properties together?
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking.");
		
	*/
	}
	
	

}

