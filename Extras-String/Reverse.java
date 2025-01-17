import java.util.Scanner; // Importing the Scanner class to read input from the user

// Class to reverse a given string
public class Reverse {

    // Method to reverse the input string
    public static String reverse(String s) {
        String ans = ""; // Initialize an empty string to store the reversed string

        // Loop through the string from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i); // Append each character to the result string
        }

        return ans; // Return the reversed string
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter string-");
        String s = sc.next(); // Read the string input from the user

        // Call the reverse method and store the result
        String ans = reverse(s);

        // Print the reversed string
        System.out.println("The reversed String is-" + ans);
    }
}
