import java.util.Scanner;
public class Problem1{
	public static void main(String[] args){
		
	  // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Input number1
        System.out.print("Enter a number: ");
        int number = input.nextInt();

     
 // Store the original number for comparison
        int originalNumber = number;
// To store the sum of cubes of digits
        int sum = 0; 

        // Loop to calculate the sum of cubes of digits
        while (number != 0) {
	  // Extract the last digit
            int digit = number % 10;
 // Add the cube of the digit to the sum
            sum += Math.pow(digit, 3); 
// Remove the last digit
            number /= 10;  
        }

        // Check if the sum of cubes equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

	}
}