import java.util.Scanner; // Importing the Scanner class to read input from the user

// Class to check if a string is a palindrome
public class IsPalindrom {

    // Method to check if the input string is a palindrome
    public static boolean isPalindrom(String s) {
        int n = s.length(); // Get the length of the string

        // Loop through the first half of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character at position i matches the corresponding character from the end
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false; // If mismatch is found, the string is not a palindrome
            }
        }

        return true; // If no mismatch is found, the string is a palindrome
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter String -");
        String s = sc.next(); // Read the string input from the user

        // Call the isPalindrom method to check if the string is a palindrome
        boolean bool = isPalindrom(s);

        // Print the result
        if (bool) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }
    }
}
