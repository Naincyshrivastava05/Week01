import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a number to find its factors: ");
        int n = sc.nextInt();

        // Initial maximum size of the factors array
        int maxFactor = 10;

        // Declare an array to store the factors, initialized with maxFactor size
        int[] factors = new int[maxFactor];

        // Variable to keep track of the current index in the factors array
        int index = 0;

        // Loop through all numbers from 1 to n to find factors
        for (int i = 1; i <= n; i++) {
            // Check if 'i' is a factor of 'n'
            if (n % i == 0) {
                // If the array is full, double its size
                if (index == maxFactor) {
                    // Create a temporary array with double the size of the original
                    int[] temp = new int[factors.length * 2];

                    // Copy elements from the original array to the temporary array
                    System.arraycopy(factors, 0, temp, 0, factors.length);

                    // Assign the temporary array back to the factors array
                    factors = temp;

                    // Update maxFactor to reflect the new size of the array
                    maxFactor = factors.length;
                }

                // Store the factor in the array and increment the index
                factors[index++] = i;
            }
        }

        // Print the factors of the number
        System.out.println("Factors of " + n + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
