
import java.util.*;
public class NonReapetingCharacters{
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String str) {
        // Create an array to store the frequency of characters in the text
        int[] charFrequency = new int[256];

        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Loop through the text to find the first non-repeating character in the text
        for (int i = 0; i < str.length(); i++) {
            if (charFrequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found, return a default value
        return '\0';
    }

    public static void main(String[] args) {
        // Take user input
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputStr = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputStr);

        // Display the result
        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

