import java.util.Scanner; // Importing Scanner class for user input
import java.util.Arrays;  // Importing Arrays class for sorting

// Class to check if two strings are anagrams of each other
public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // Remove whitespace and convert both strings to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert both strings to char arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
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

        // Call the areAnagrams method and store the result
        boolean result = areAnagrams(s1, s2);

        // Print whether the strings are anagrams or not
        if (result) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
}
