import java.util.Scanner;

public class FactorialRecursion {

    // Function to get input from the user
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int input = getInput(sc); // Get user input
        int result = calculateFactorial(input); // Calculate factorial using recursion
        displayResult(input, result); // Display the result
       
    }
}
