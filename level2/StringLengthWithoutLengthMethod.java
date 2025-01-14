import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find the length of a string without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            // Infinite loop to count each character
            while (true) {
                s.charAt(count); // Access each character at index count
                count++; // Increment the counter for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
             System.out.println("Handling exception");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Finding the length using the custom method
        int calculatedLength = findLength(input);

        // Finding the length using the built-in length() method
        int actualLength = input.length();

        // Displaying the results
        System.out.println("\nLength of the string calculated by custom method: " + calculatedLength);
        System.out.println("Length of the string using built-in method: " + actualLength);

        // Comparing the results
        if (calculatedLength == actualLength) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
    }
}
