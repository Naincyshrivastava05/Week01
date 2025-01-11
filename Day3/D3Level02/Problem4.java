
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = sc.nextInt(); // Input the number

        // Initial size of the array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit]; // Array to store the digits of the number
        int index = 0; // Keeps track of the number of digits stored

        // Extract digits and store them in the array
        while (number != 0) {
            // If the array is full, double its size
            if (index == maxDigit) {
                maxDigit +=10; // Increasing the size
                int[] temp = new int[maxDigit]; // Temporary array with increased size
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy old array to new array
                digits = temp; // Update reference to the new array
            }
            digits[index++] = (int)number % 10; // Store the last digit in the array
            number /= 10; // Remove the last digit from the number
        }

        // Initialize variables to store the largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) { 
                secondLargest = largest; // Update the second largest
                largest = digits[i]; // Update the largest
            } else if (digits[i] > secondLargest && digits[i] != largest) { 
                // Update second largest if it's smaller than the current digit and not equal to the largest
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}

