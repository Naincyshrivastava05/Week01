import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Input number from user

        int[] factor = findfactor(num); // Find factors of the number
        int sum = factorSum(factor); // Calculate sum of factors
        int prod = factorProduct(factor); // Calculate product of factors
        int sqSum = factorSqSum(factor); // Calculate sum of squares of factors

        // Display factors
        System.out.println("The factors of the number " + num + " are:");
        for (int i = 0; i < factor.length; i++) {
            System.out.print(factor[i] + " ");
        }
        System.out.println(); // Line break

        // Display results
        System.out.println("The sum of factors of the number " + num + " is: " + sum);
        System.out.println("The product of factors of the number " + num + " is: " + prod);
        System.out.println("The sum of squares of factors of the number " + num + " is: " + sqSum);
    }

    // Method to find factors of a number
    public static int[] findfactor(int n) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factor = new int[count]; // Create an array to store factors
        int index = 0;
        // Store factors in the array
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factor[index++] = i;
            }
        }
        return factor; // Return array of factors
    }

    // Method to calculate the sum of factors
    public static int factorSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each factor to sum
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static int factorProduct(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i]; // Multiply each factor
        }
        return prod;
    }

    // Method to calculate the sum of squares of factors
    public static int factorSqSum(int[] arr) {
        int sq = 0;
        for (int i = 0; i < arr.length; i++) {
            sq += Math.pow(arr[i], 2); // Add square of each factor
        }
        return sq;
    }
}
