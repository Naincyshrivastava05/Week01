import java.util.Scanner; // Importing Scanner for user input

// Class to replace a word in a sentence
public class WordReplace {

    // Method to replace a given word with another word in the sentence
    public static String replace(String sentence, String target, String replacement) {
	
        // Use the replaceAll method of String to replace all occurrences of the target word
        return sentence.replaceAll( target, replacement);
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Prompt the user to enter the word to replace
        System.out.print("Enter the word to replace: ");
        String target = sc.next();

        // Prompt the user to enter the replacement word
        System.out.print("Enter the replacement word: ");
        String replacement = sc.next();

        // Call the replace method and store the result
        String result = replace(sentence, target, replacement);

        // Print the modified sentence
        System.out.println("The modified sentence is: " + result);
    }
}
