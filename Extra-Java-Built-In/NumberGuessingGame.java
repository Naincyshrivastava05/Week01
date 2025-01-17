import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Function to generate a random guess within a given range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low; // Random number in [low, high]
    }

    // Function to process user feedback
    public static String getUserFeedback(Scanner sc) {
        System.out.print("Is the guess 'high', 'low', or 'correct'? ");
        return sc.next().toLowerCase();
    }

    // Function to adjust the range based on feedback
    public static int[] adjustRange(String feedback, int guess, int low, int high) {
        if (feedback.equals("high")) {
            high = guess - 1; // Narrow range to below the guess
        } else if (feedback.equals("low")) {
            low = guess + 1; // Narrow range to above the guess
        }
        return new int[]{low, high};
    }

    // Main game logic
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100 (inclusive). The computer will try to guess it!");
        System.out.println("Provide feedback: 'high', 'low', or 'correct' after each guess.");

        int low = 1, high = 100, attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            int guess = generateGuess(low, high); // Generate a new guess
            attempts++;
            System.out.println("Computer's guess: " + guess);

            String feedback = getUserFeedback(sc); // Get feedback from the user

            if (feedback.equals("correct")) {
                System.out.println("Hurray! The computer guessed your number: " + guess);
                System.out.println("It took " + attempts + " attempts.");
                guessed = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] newRange = adjustRange(feedback, guess, low, high); // Adjust the range
                low = newRange[0];
                high = newRange[1];
            } else {
                System.out.println("Invalid feedback! Please enter 'high', 'low', or 'correct'.");
            }

            // Check if the range is valid
            if (low > high) {
                System.out.println("It seems there was a mistake in feedback. The range is invalid!");
                break;
            }
        }

   
    }

    // Main method to start the game
    public static void main(String[] args) {
        playGame(); // Start the game
    }
}
