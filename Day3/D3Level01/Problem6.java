import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
	//Initializing scanner object
        Scanner scanner = new Scanner(System.in);
	//Initializinf array
        double[] heights = new double[11];
        double sum = 0.0;

        // Get input for 11 players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
	//Adding height in sum 
            sum += heights[i];
        }

        // Calculate and display mean height
        double mean = sum / heights.length;
        System.out.println("The mean height of the football players is: " + mean + " meters.");
    }
}
