import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Count the number of digits in the input number
        int num = number; // Temporary variable to preserve the original number
        int count = 0; // To store the number of digits

        // Loop to count the digits
        while (num > 0) {
            num = num / 10; // Remove the last digit
            count++;
        }

        // Step 2: Extract digits and store them in an array
        num = number; // Reset num to the original number
        int[] digits = new int[count]; // Array to store the digits
        int index = 0; // Index to fill the digits array

        // Loop to extract digits and store them in the digits array
        while (num > 0) {
            int rem = num % 10; // Get the last digit
            digits[index++] = rem; // Store the digit in the array
            num = num / 10; // Remove the last digit
        }

        // Step 3: Initialize frequency array to track the frequency of each digit
        int[] freq = new int[10]; // Frequency array for digits 0-9
        Arrays.fill(freq, 0); // Fill the array with 0

        // Step 4: Calculate the frequency of each digit
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++; // Increment the frequency of the corresponding digit
        }

        // Step 5: Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of digit " + i + " is " + freq[i]);
        }

        scanner.close(); // Close the scanner to free resources
    }
}
