import java.util.Scanner; // Importing the Scanner class to read input from the user

// Class to compare two strings lexicographically
public class LexicographicalComparison {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length(); // Length of the first string
        int len2 = s2.length(); // Length of the second string
        int minLength = Math.min(len1, len2); // Minimum length of the two strings

        // Loop through the characters of both strings up to the minimum length
        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i); // Character from the first string
            char c2 = s2.charAt(i); // Character from the second string

            if (c1 != c2) {
                return c1 - c2; // Return the difference of the characters if they are not equal
            }
        }

        // If all characters are equal up to the minimum length, compare the lengths of the strings
        return len1 - len2;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        // Compare the two strings using the custom compareStrings method
        int result = compareStrings(s1, s2);

        // Print the lexicographical comparison result
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\" in lexicographical order.");
        }
    }
}
