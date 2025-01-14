import java.util.Scanner;

public class TrimSpaces {

    // Method to determine the start and end indices without leading and trailing spaces
    public static int[] findStartAndEnd(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using start and end indices
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        // Find start and end indices
        int[] indices = findStartAndEnd(input);
        int start = indices[0];
        int end = indices[1];

        // Trim spaces using custom method
        String trimmedUsingCustomMethod = createSubstring(input, start, end);

        // Trim spaces using built-in trim method
        String trimmedUsingBuiltIn = input.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedUsingCustomMethod, trimmedUsingBuiltIn);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Original String: [" + input + "]");
        System.out.println("Trimmed (Custom Method): [" + trimmedUsingCustomMethod + "]");
        System.out.println("Trimmed (Built-in Method): [" + trimmedUsingBuiltIn + "]");
        System.out.println("Comparison Result: " + (areEqual ? "Both methods give the same result" : "Methods give different results"));
    }
}
