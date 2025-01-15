// Import the Scanner class for user input
import java.util.Scanner;

public class FrequencyOfUnique {
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        int count = 0;
        // Loop to count the number of unique characters
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            // Check if the character has appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            // If the character is unique, increase the count
            if (!flag) {
                count++;
            }
        }
        // Create an array to store unique characters
        char[] unique = new char[count];
        int index = 0;
        // Populate the unique character array
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                unique[index++] = str.charAt(i);
            }
        }
        return unique; // Return the array of unique characters
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256]; // Array to store frequency of all ASCII characters
        // Calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        // Get the unique characters in the string
        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];
        // Populate the result array with character and its frequency
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]); // Store character as string
            result[i][1] = String.valueOf(frequency[unique[i]]); // Store frequency as string
        }
        return result; // Return the result array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a string:"); // Prompt user for a string
        String str = scanner.nextLine(); // Read the input string
        String[][] result = findFrequency(str); // Find frequency of characters
        System.out.println("Character\tFrequency");
        // Print each unique character and its frequency
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}



