import java.util.Scanner;

public class NumberChecker2{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] frequency = new int[10]; // Frequency array for digits 0-9
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Create a 2D array to store digit and its frequency
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = frequency[i];
        }

        return freqArray;
    }

    // Method to display the frequency of each digit
    public static void displayDigitFrequency(int number) {
        int[][] frequencies = digitFrequency(number);
        System.out.println("Digit\tFrequency");
        for (int[] entry : frequencies) {
            if (entry[1] > 0) {  // Only display digits that appear at least once
                System.out.println(entry[0] + "\t" + entry[1]);
            }
        }
    }

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Find the count of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store the digits of the number
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find the sum of digits
        int sumDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumDigits);

        // Find the sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is it a Harshad number? " + isHarshad);

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        displayDigitFrequency(number);
    }
}
