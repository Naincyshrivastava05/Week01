import java.util.*;

public class ShortestAndLargest {

    // Method to find the shortest and largest words based on length
    public static String[] compare(String[][] arr) {
        int shortest = Integer.MAX_VALUE; // Initialize shortest length to the maximum possible value
        int largest = Integer.MIN_VALUE; // Initialize largest length to the minimum possible value
        
        String[] ans = new String[2]; // Array to store the shortest and largest words
        
        // Iterate through the array to find the shortest and largest words
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i][1]); // Convert the string length to integer
            if (n <= shortest) { // Update shortest length and word if needed
                shortest = n;
                ans[0] = arr[i][0];
            }
            if (n >= largest) { // Update largest length and word if needed
                largest = n;
                ans[1] = arr[i][0];
            }
        }
        return ans; // Return the result
    }

    // Method to count the number of words in a string
    public static int countWord(String s) {
        if (s.isEmpty()) return 0; // Return 0 for an empty string
        int count = 1; // Start with 1 as there is at least one word
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Increment the count for each space
                count++;
            }
        }
        return count;
    }

    // Method to split a string into an array of words without using split()
    public static String[] spilString(String s) {
        int n = countWord(s); // Get the total number of words
        String[] arr = new String[n]; // Create an array to store the words
        int index = 0; // Index for the array
        String str = ""; // Temporary string to build each word
        
        // Iterate through the string to extract words
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { 
                str += s.charAt(i); // Append characters to the current word
            } else {
                arr[index++] = str; // Add the word to the array
                str = ""; // Reset the temporary string
            }
        }
        if (str.length() > 0) arr[index] = str; // Add the last word if it exists
        return arr; // Return the array of words
    }

    // Method to calculate the length of a word without using length()
    public static int wordLength(String s) {
        int length = 0;
        for (char c : s.toCharArray()) { // Iterate through each character
            length++; // Increment the length for each character
        }
        return length; // Return the length
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] splitArray(String[] arr) {
        String[][] ans = new String[arr.length][2]; // 2D array to store words and lengths
        
        // Iterate through the word array
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            ans[i][0] = s; // Store the word
            ans[i][1] = String.valueOf(wordLength(s)); // Store the length as a string
        }
        return ans; // Return the 2D array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine(); // Take input from the user
        s = s.trim(); // Trim leading and trailing spaces
        
        // Split the string into words and calculate lengths
        String[] arr = spilString(s);
        String[][] result = splitArray(arr);
        
        // Display words and their lengths in tabular format
        System.out.println("word\tlength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
        
        // Find and display the shortest and largest words
        String[] ans = compare(result);
        System.out.println("The smallest String is - " + ans[0]);
        System.out.println("The largest String is - " + ans[1]);
    }
}
