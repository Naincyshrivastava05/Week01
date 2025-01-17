import java.util.Scanner;

public class BasicCalculator {

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; // Return NaN if division by zero
        }
        return a / b;
    }

    // Function to get user input
    public static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner object

        System.out.println("Basic Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = (int) getInput(sc, "Enter your choice (1-4): ");

        // Get the two numbers from the user
        double num1 = getInput(sc, "Enter the first number: ");
        double num2 = getInput(sc, "Enter the second number: ");

        double result;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }
    }
}
