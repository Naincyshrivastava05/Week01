import java.util.Scanner;

class WindChillCalculator {

   // Method to calculate wind chill temperature
   public double calculateWindChill(double temperature, double windSpeed) {
      // Formula: windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * windSpeed^0.16
      // This formula is valid for temperatures less than or equal to 50°F and wind speeds greater than 3 mph
	double windChill  = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
      return windChill;
   }

   public static void main(String[] args) {
      // Create an instance of the WindChillCalculator class
      WindChillCalculator calculator = new WindChillCalculator();

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the temperature in Fahrenheit
      System.out.print("Enter temperature (in Fahrenheit): ");
      double temperature = input.nextDouble();

      // Prompt the user to enter the wind speed in miles per hour
      System.out.print("Enter wind speed (in mph): ");
      double windSpeed = input.nextDouble();

      // Validate input: Check if the formula conditions are met
      if (temperature > 50 || windSpeed <= 3) {
         System.out.println("Wind chill calculation is only valid for temperatures <= 50°F and wind speeds > 3 mph.");
         return; // Exit the program
      }

      // Calculate the wind chill temperature using the method
      double windChill = calculator.calculateWindChill(temperature, windSpeed);

      // Display the calculated wind chill temperature
      System.out.println("The wind chill temperature is: " + windChill + "°F");
   }
}
