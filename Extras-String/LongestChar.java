import java.util.*; // Importing the utility package for Scanner and other utilities

// Class to find the longest word in a string
public class LongestChar {

    // Method to find the longest word in the input string
    public static String findLongest(String s) {
        // Split the input string into words using whitespace as the delimiter
        String[] arr = s.split(" ");

        String ans = ""; // Variable to store the longest word
        int max = 0;     // Variable to store the length of the longest word

        // Loop through each word in the array
        for (String str : arr) {
            if (str.length() > max) {
                max = str.length(); // Update the maximum length
                ans = str;          // Update the longest word
            }
        }

        return ans; // Return the longest word
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String s = sc.nextLine(); // Read the entire line of input

        // Call the findLongest method and store the result
        String ans = findLongest(s);

        // Print the longest word
        System.out.println("The longest word in the string is: " + ans);
    }
}
