import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
		
	  Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize counter
        int count = 0;

        // Loop to count digits
        while (number != 0) {
// Remove the last digit
            number /= 10;  
// Increment the counter
            count++;  
        }

        // Print the total number of digits
        System.out.println("The number of digits is: " + count);

	
	}
}