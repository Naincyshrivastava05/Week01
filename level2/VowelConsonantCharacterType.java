import java.util.Scanner;

public class VowelConsonantCharacterType {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert uppercase letter to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // If not a letter, return not a letter
        return "Not a Letter";
    }

    // Method to analyze each character in a string and return a 2D array
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            String type = checkCharacter(ch); // Check the character type
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = type; // Store the type
        }

        return result;
    }

    // Method to display a 2D array in a tabular format using \t
    public static void displayArray(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");

        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Analyze the string and get the result as a 2D array
        String[][] result = analyzeString(input);

        // Display the result in a tabular format using \t
        displayArray(result);
    }
}
