import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to get user input
    public static double getInput(Scanner sc) {
        System.out.print("Enter the temperature: ");
        return sc.nextDouble();
    }

    // Function to display the result
    public static void displayResult(double input, double result, String scale) {
        System.out.println(input + " degrees is equal to " + result + " " + scale);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        int choice = sc.nextInt(); // Get user's choice
        double result;

        if (choice == 1) {
            // Convert Fahrenheit to Celsius
            System.out.println("You chose Fahrenheit to Celsius");
            double fahrenheit = getInput(sc); // Get input
            result = fahrenheitToCelsius(fahrenheit); // Convert
            displayResult(fahrenheit, result, "Celsius"); // Display result
        } else if (choice == 2) {
            // Convert Celsius to Fahrenheit
            System.out.println("You chose Celsius to Fahrenheit");
            double celsius = getInput(sc); // Get input
            result = celsiusToFahrenheit(celsius); // Convert
            displayResult(celsius, result, "Fahrenheit"); // Display result
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }

      
    }
}
