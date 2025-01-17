import java.util.Scanner; // Importing Scanner for user input

// Class to find the most frequent character in a string
public class MostFrequentCharacter {

    // Method to find the most frequent character in the input string
    public static char findMostFrequentChar(String s) {
        int[] freq = new int[256]; // Array to store frequencies of all ASCII characters

        // Loop through each character in the string and update its frequency
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++; // Increment the frequency of the character
        }

        // Variables to track the most frequent character and its frequency
        char mostFrequentChar = s.charAt(0);
        int maxFrequency = 0;

        // Loop through the frequency array to find the character with the highest frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFrequency) {
                maxFrequency = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Call the findMostFrequentChar method and store the result
        char mostFrequentChar = findMostFrequentChar(s);

        // Print the most frequent character
        System.out.println("The most frequent character is: '" + mostFrequentChar + "'");
    }
}
