
import java.util.*; // Import all classes from the java.util package

public class Anagram {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the strings
        int[] charCount1 = new int[256]; // Assuming ASCII character set
        int[] charCount2 = new int[256];

        // Calculate the frequency of each character in both strings
        for (int i = 0; i < text1.length(); i++) {
            charCount1[text1.charAt(i)]++; // Increment frequency for text1
            charCount2[text2.charAt(i)]++; // Increment frequency for text2
        }

        // Compare the frequency arrays of the two texts
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false; // Return false if frequencies don't match
            }
        }

        // If all character frequencies match, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first text
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        // Prompt the user to input the second text
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the areAnagrams method to check if the inputs are anagrams
        if (areAnagrams(text1, text2)) {
            // Display the result if the texts are anagrams
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            // Display the result if the texts are not anagrams
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are not anagrams.");
        }
    }
}

