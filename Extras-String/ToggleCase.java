import java.util.Scanner; // Importing the Scanner class to read input from the user

// Class to toggle the case of characters in a string
public class ToggleCase {

    // Method to toggle the case of each character in the input string
    public static String toggleCase(String s) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the character at position i

            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c)); // Convert to lowercase and append
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c)); // Convert to uppercase and append
            } 
            // If the character is not a letter, append it as is
            else {
                result.append(c);
            }
        }

        return result.toString(); // Convert StringBuilder to string and return
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Read the entire line of input

        // Call the toggleCase method and store the result
        String toggledString = toggleCase(s);

        // Print the string with toggled case
        System.out.println("String with toggled case: " + toggledString);
    }
}
