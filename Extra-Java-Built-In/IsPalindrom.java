import java.util.Scanner;

public class IsPalindrom{

    // Function to get input from the user
    public static String getInput(Scanner sc) {
        String s = sc.nextLine();
        return s;
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String s) {
        String original = s.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = getInput(sc); // Get input from the user
        boolean result = isPalindrome(input); // Check if it's a palindrome
        displayResult(input, result); // Display the result
        sc.close(); // Close the Scanner object
    }
}
