package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestion what to wear based on the weather (temperature and Sun condition)
		
		int temperature = 20;
		String SunCondition = "Overcast";
		
		if (temperature > 25) {
			System.out.println("Weather is pleasent. Wear a T-Shirt");
		}
		else if ((temperature > 15) && (SunCondition == "Sunny")) {
			System.out.println("It's a bit cold. Wear jeans and warm clothing. ");
			System.out.println("Wear a hat, too.");
		}
		else if ((temperature > 10) || SunCondition == "Oevrcast") {
			System.out.println("It's gonna be a cloudy cold day.");
		}
		else {
			System.out.println("It's chilling outside. Take a jacket! ");
		}
		System.out.println("The program is ending...");
	}

}
