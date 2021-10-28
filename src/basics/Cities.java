package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		String[] cities = {"New York", "Miami", "Dallas", "San Francisco"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare an array
		String[] countries;
		
		//Define the array
		countries = new String[3];
		countries[0] = "Bulgaria";
		countries[1] = "Germany";
		countries[2] = "Canada";
		System.out.println(countries[0]);
		
		System.out.println("*****************");
		
		//Declare & define an array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: Enters the loop THEN tests condition
		do {
		System.out.println("State: " + states[i]);
		i = i + 1;
		} while (i < 5);
		
		//While Loop: Tests condition FIRST then enters the loop
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "New Jersey") {
				System.out.println("State FOUND!");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPrinting with FOR loop!");
		// For Loop: Best function for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		
	}
}