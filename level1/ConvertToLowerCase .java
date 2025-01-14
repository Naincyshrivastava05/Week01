import java.util.Scanner;

public class ConvertToLowerCase{

    // Method to convert a given string to uppercase without using built-in methods
    public static String converToLowerCase(String s) {
        String str = ""; // Initialize an empty string to store the converted result
	 System.out.println("The string using custom method ");
        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i); // Get the ASCII value of the current character

            // Check if the character is a  uppercase letter (ASCII range 97 to 122)
            if (n >= 65 && n <= 90) {
                // Convert the upercase letter to lowercase by adding 32
                str += (char) (s.charAt(i) + 32);
            } else {
                // If not a uppercase letter, keep the character as it is
                str += s.charAt(i);
            }

            // Print the converted character for visualization (optional debugging step)
            System.out.print(str.charAt(i) + " ");
        }

        // Print a newline after displaying all characters (optional debugging step)
        System.out.println();

        // Return the final converted string
        return str;
    }

    // Method to compare two strings and return true if they are equal, false otherwise
    public static boolean compare(String s1, String s2) {
        // Use the equals() method to compare the strings
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // Convert the string to lowercase using the custom method
        String s1 = converToLowerCase(s);

        // Convert the string to lowercase using the built-in toUpperCase() method
        String s2 = s.toLowerCase();
	 System.out.println("The string using inbuilt method ");
	System.out.println(str);


        // Compare the results of the two methods
        boolean ans = compare(s1, s2);

        // Display whether both methods give the same result
        if (ans) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }
    }
}
