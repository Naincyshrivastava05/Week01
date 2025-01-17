import java.util.Scanner; // Importing Scanner for user input

// Class to remove a specific character from a string
public class RemoveCharacter {

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String s, char toRemove) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the character at position i

            // If the character is not equal to the one to remove, append it to the result
            if (c != toRemove) {
                result.append(c);
            }
        }

        return result.toString(); // Convert StringBuilder to string and return
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the string
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Prompt the user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        char toRemove = sc.next().charAt(0); // Read the first character of the input

        // Call the removeCharacter method and store the result
        String result = removeCharacter(s, toRemove);

        // Print the string after removing the specified character
        System.out.println("String after removing the character: " + result);
    }
}
