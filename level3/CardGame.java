
// Import necessary classes
import java.util.Random;

public class CardGame {

    // Define the suits and ranks of a deck of cards
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Calculate the total number of cards in the deck
    private static final int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        // Create an array to store the deck of cards
        String[] deck = new String[numOfCards];

        // Populate the deck with combinations of suits and ranks
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit; // Combine rank and suit
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        // Create a Random object for generating random numbers
        Random random = new Random();

        // Shuffle the deck using the Fisher-Yates algorithm
        for (int i = 0; i < deck.length; i++) {
            // Generate a random index between i and the last index
            int randomCardNumber = i + random.nextInt(deck.length - i);

            // Swap the current card with the randomly selected card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute the deck of cards among players
    public static String[][] distributeDeck(String[] deck, int numPlayers) {
        // Check if the deck can be evenly distributed among players
        if (deck.length % numPlayers != 0) {
            System.out.println("Cannot distribute the deck evenly among the players.");
            return null;
        }

        // Create a 2D array to store the cards for each player
        String[][] players = new String[numPlayers][deck.length / numPlayers];

        // Distribute cards evenly among players
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < deck.length / numPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print the cards of each player
    public static void printPlayers(String[][] players) {
        // Iterate over each player's cards and print them
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println(); // Add a blank line between players
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Specify the number of players and distribute the deck
        int numPlayers = 4; // Change this value to adjust the number of players
        String[][] players = distributeDeck(deck, numPlayers);

        // If the deck was successfully distributed, print the players and their cards
        if (players != null) {
            printPlayers(players);
        }
    }
}

