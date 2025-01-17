import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to get input from the user
    public static int[] getInput(Scanner sc) {
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return new int[] { num1, num2 };
    }

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the results
    public static void displayResult(int gcd, int lcm) {
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int[] numbers = getInput(sc); // Get user input
        int num1 = numbers[0];
        int num2 = numbers[1];

        int gcd = calculateGCD(num1, num2); // Calculate GCD
        int lcm = calculateLCM(num1, num2, gcd); // Calculate LCM using GCD

        displayResult(gcd, lcm); // Display the results
        sc.close(); // Close the Scanner
    }
}
