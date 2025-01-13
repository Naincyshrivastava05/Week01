import java.util.Scanner;

public class Problem2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt(); // Take user input

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return; // Exit if input is not valid
        }

        // Calculate sum using recursive method
        int recursiveSum = findSumRecursive(n);
        // Calculate sum using the formula
        int formulaSum = n * (n + 1) / 2;

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (recursive): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (formula): " + formulaSum);

        // Compare the results from both methods
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result!");
        } else {
            System.out.println("The results do not match.");
        }
    }

    // Recursive method to find the sum of natural numbers
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: sum of first 1 number is 1
        }
        return n + findSumRecursive(n - 1); // Recursive case
    }
}
