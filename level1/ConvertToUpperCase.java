import java.util.Scanner;

public class ConvertToUpperCase {

    // Method to convert a given string to uppercase without using built-in methods
    public static String converToUpperCase(String s) {
        String str = ""; // Initialize an empty string to store the converted result

        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i); // Get the ASCII value of the current character

            // Check if the character is a lowercase letter (ASCII range 97 to 122)
            if (n >= 97 && n <= 122) {
                // Convert the lowercase letter to uppercase by subtracting 32
                str += (char) (s.charAt(i) - 32);
            } else {
                // If not a lowercase letter, keep the character as it is
                str += s.charAt(i);
            }

            // Print the converted character for visualization (optional debugging step)
            System.out.print(str.charAt(i) + " ");
        }

        // Print a newline after displaying all characters (optional debugging step)
        System.out.println();

        // Return the final converted string
        return str;
    }

    // Method to compare two strings and return true if they are equal, false otherwise
    public static boolean compare(String s1, String s2) {
        // Use the equals() method to compare the strings
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // Convert the string to uppercase using the custom method
        String s1 = converToUpperCase(s);

        // Convert the string to uppercase using the built-in toUpperCase() method
        String s2 = s.toUpperCase();

        // Compare the results of the two methods
        boolean ans = compare(s1, s2);

        // Display whether both methods give the same result
        if (ans) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }
    }
}
