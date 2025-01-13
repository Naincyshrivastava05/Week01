import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the number using a method and store the result
        int result = checkNumber(number);

        // Display the result
		if(result == -1){
		 System.out.println("The number is Negative");
		}
		else if(result == 1){
		 System.out.println("The number is Positive");
		}
		else{
		 System.out.println("The number is Zero");
		}
        
    }

    // Method to return -1 for negative number, 1 for positive, and 0 for zero
    public static int checkNumber(int number) {
        if (number < 0) return -1;
        else if (number > 0) return 1;
        else return 0;
    }
}
