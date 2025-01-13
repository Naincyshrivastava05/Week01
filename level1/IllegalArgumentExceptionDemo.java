import java.util.Scanner;

public class IllegalArgumentExceptionDemo{
	public static void generateIllegalArgumentExp(String s){
		System.out.println("Substring with start index 5 and end index 3: " + s.substring(5, 3));
	}
	public static void handleIllegalArgumentExp(String s){
		   try {
            // Attempting the same operation but within a try-catch block
            System.out.println("Substring with start index 5 and end index 3: " + s.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Generic exception handling
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Generating IllegalArgumentException...");
        try {
            generateIllegalArgumentExp(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling IllegalArgumentException...");
        handleIllegalArgumentExp(input);
	}
}