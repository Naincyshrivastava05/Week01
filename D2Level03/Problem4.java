import java.util.Scanner;
public class Problem4{
	public static void main(String[] args){
		
	 // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sumOfDivisors = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
  // Adding the divisor to the sum
                sumOfDivisors += i;  // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
	}
}