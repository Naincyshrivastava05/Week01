
// Import the Scanner class for user input
import java.util.Scanner;

public class IsPalindrome {

    // Method to check if a text is a palindrome using Logic 1 (Iterative approach)
    public static boolean isPalindromeLogic1(String text) {
        int start = 0; // Start index
        int end = text.length() - 1; // End index
        while (start < end) {
            // Compare characters at start and end positions
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Not a palindrome if characters don't match
            }
            start++; // Move start index forward
            end--; // Move end index backward
        }
        return true; // Text is a palindrome
    }

    // Method to check if a text is a palindrome using Logic 2 (Recursive approach)
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: If start index crosses or meets end index, it's a palindrome
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Not a palindrome if characters don't match
        }
        // Recursive call to check the rest of the string
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to reverse a string using the charAt() method
    public static String reverseString(String text) {
        String reversed = ""; // Initialize an empty string for reversed text
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i); // Append characters in reverse order
        }
        return reversed; // Return the reversed string
    }

    // Method to check if a text is a palindrome using Logic 3 (String reversal and comparison)
    public static boolean isPalindromeLogic3(String text) {
        String reversed = reverseString(text); // Reverse the string
        char[] original = text.toCharArray(); // Convert the original string to a character array
        char[] reverse = reversed.toCharArray(); // Convert the reversed string to a character array
        // Compare the characters of the original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) {
                return false; // Not a palindrome if characters don't match
            }
        }
        return true; // Text is a palindrome
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine(); // Read the input text

        // Check if the text is a palindrome using Logic 1
        System.out.println("Is \"" + text + "\" a palindrome using Logic 1? " + isPalindromeLogic1(text));

        // Check if the text is a palindrome using Logic 2
        System.out.println("Is \"" + text + "\" a palindrome using Logic 2? " + isPalindromeLogic2(text, 0, text.length() - 1));

        // Check if the text is a palindrome using Logic 3
        System.out.println("Is \"" + text + "\" a palindrome using Logic 3? " + isPalindromeLogic3(text));
    }
}




