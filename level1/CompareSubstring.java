import java.util.Scanner;

public class CompareSubstring {

    // Method to compare substring using charAt() method
    public static String compare(String s, int start, int end) {
        // Check if end index is greater than or equal to string length, if so, adjust it to the last index.
        if (end >= s.length()) {
            end = s.length() - 1;
        }

        // Initialize an empty string to store the substring
        String str = "";

        // Loop through the string from 'start' index to 'end' index (excluding 'end' itself)
        for (int i = start; i < end; i++) {
            str += s.charAt(i); // Append each character to the substring
        }

        // Return the substring
        return str;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String str = sc.next();
	int start  = sc.nextInt();
	int end = sc.nextInt();

        // Call the compare() method to get the substring from index 2 to 4
        String subStr = compare(str, start, end);

        // Print the result using charAt() method
        System.out.println("SubString of string using charAt() method from index " + 2 + " to " + 4 + " is " + subStr);

        // Get the substring from index 2 to 4 using the substring() method
        String subStr2 = str.substring(2, 4);

        // Print the result using substring() method
        System.out.println("SubString of string using substring() method from index " + 2 + " to " + 4 + " is " + subStr2);

        // Compare both substrings and print if they are the same or different
        if (subStr.equals(subStr2)) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Both methods give different results");
        }
    }
}
