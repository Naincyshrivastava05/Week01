import java.util.Scanner; // Importing the Scanner class to read input from the user

// Class to count vowels and consonants in a given string
public class CountVowel {

    // Method to count vowels and consonants in the input string
    public static int[] countVowelConsonent(String s) {
        int vowel = 0; // Variable to store the count of vowels
        int cons = 0;  // Variable to store the count of consonants

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a vowel
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowel++; // Increment vowel count
            } else {
                cons++; // Increment consonant count
            }
        }

        // Return an array containing the counts of vowels and consonants
        return new int[]{vowel, cons};
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = sc.next(); // Read the string input from the user

        // Call the countVowelConsonent method and store the result
        int[] ans = countVowelConsonent(s);

        // Print the count of vowels and consonants
        System.out.println("The number of vowels is: " + ans[0]);
        System.out.println("The number of consonants is: " + ans[1]);
    }
}
