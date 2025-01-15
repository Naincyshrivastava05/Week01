
// Import the Scanner class for user input
import java.util.Scanner;

public class freq3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = sc.nextLine(); // Read the input string

        // Convert the string to a character array
        char[] ch = str.toCharArray();
        int[] freq = new int[ch.length]; // Array to store the frequency of each character
        String[] result = new String[ch.length]; // Array to store the result as strings

        // Initialize the frequency of each character to 1
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
        }

        // Calculate the frequency of each character
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) { // If duplicate character is found
                    freq[i]++; // Increment the frequency of the character
                    ch[j] = '0'; // Mark the duplicate character as '0' to avoid re-counting
                }
            }
        }

        // Store the non-duplicate characters and their frequencies in the result array
        int k = 0; // Index for the result array
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') { // Skip duplicate characters marked as '0'
                result[k] = "Character: " + ch[i] + ", Frequency: " + freq[i];
                k++;
            }
        }

        // Display the frequency of characters
        System.out.println("Frequency of characters:");
        for (int i = 0; i < k; i++) {
            System.out.println(result[i]); // Print each character and its frequency
        }
    }
}

