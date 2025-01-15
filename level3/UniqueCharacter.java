
import java.util.*;
public class UniqueCharacter{
    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to Find unique characters in a string using charAt() method and return them as 1D array
    public static char[] findUniqueChars(String text) {
        int length = findLength(text);
        char[] result = new char[length];
        int index = 0;

        // Loop to Find the unique characters in the text
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            // Inner loop checks if the character is unique by comparing it with the previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            // If the character is unique, it is stored in the result array
            if (isUnique) {
                result[index++] = text.charAt(i);
            }
        }

        // Create a new array to store the unique characters
        char[] uniqueChars = new char[index];
        System.arraycopy(result, 0, uniqueChars, 0, index);
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        char[] uniqueChars = findUniqueChars(text);
        System.out.println("Unique characters: " + java.util.Arrays.toString(uniqueChars));
    }
}

