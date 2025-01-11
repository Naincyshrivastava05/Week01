import java.util.Scanner;
public class Problem3{
	public static void main(String[] args){
		
	  // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Taking input 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
 // Store the original number for comparison
        int originalNumber = number; 
 // To store the sum of digits
        int sumOfDigits = 0; 

        // Calculate the sum of digits
        while (number != 0) {
// Add the last digit to sum
            sumOfDigits += number % 10; 
 // Remove the last digit 
            number /= 10; 
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

	}
}