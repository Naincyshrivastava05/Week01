import java.util.*;
public class FrequencyOfChar{
    // Method to find the frequency of characters in a string
    public static char[][] findFrequency(String text) {
        // Create an array to store the frequency of characters in the text
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create an array to store the characters and their frequencies
        char[][] result = new char[256][2];

        // Initialize index for result array
        int index = 0;

        // Loop through the characters in the text and store the characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i;
                result[index][1] = (char) (frequency[i] + '0');
                index++;
            }
        }

        // Trim the result array to remove empty rows
        char[][] trimmedResult = new char[index][2];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }

    // Main function to take user inputs, call user-defined methods, and display result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        char[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + (result[i][1] - '0'));
        }
    }
}

