import java.util.ArrayList;
import java.util.Scanner;

public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        factors.add(number); // Including the number itself
        // Convert ArrayList to int[]
        return factors.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatestFactor = 0;
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorialDigits = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorialDigits += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorialDigits == number;
    }

    // Helper method to compute the factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        // Display factors
        System.out.println("Factors of " + number + ": ");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Find greatest factor
        System.out.println("\nGreatest factor: " + findGreatestFactor(number));

        // Sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(number));

        // Product of factors
        System.out.println("Product of factors: " + productOfFactors(number));

        // Product of cubes of factors
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(number));

        // Check if perfect number
        System.out.println("Is perfect number: " + isPerfectNumber(number));

        // Check if abundant number
        System.out.println("Is abundant number: " + isAbundantNumber(number));

        // Check if deficient number
        System.out.println("Is deficient number: " + isDeficientNumber(number));

        // Check if strong number
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
}