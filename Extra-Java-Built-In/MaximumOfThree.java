import java.util.Scanner;

public class MaximumOfThree {

    // Function to take input from the user
    public static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to calculate the maximum of three numbers using Math.max
    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Find the maximum of a, b, and c
    }

    // Main function to control the program flow
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three inputs
        int num1 = getInput(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");
        int num3 = getInput(sc, "Enter the third number: ");

        // Finding and displaying the maximum
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);

        sc.close();
    }
}
