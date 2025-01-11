import java.util.Scanner;

public class Problem5{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Input the number

        // Temporary variable to calculate the number of digits
        int tempNumber = number;
        int digitCount = 0;

        // Find the count of digits in the number
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10; // Remove the last digit from the number
        }

        // Array to store the digits of the number
        int[] digits = new int[digitCount];
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            digits[index++] = number % 10; // Store the last digit
            number /= 10; // Remove the last digit from the number
        }

        // Display the digits array in reverse order
        System.out.println("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
