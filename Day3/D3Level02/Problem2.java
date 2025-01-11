import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Arrays to store ages and heights of three friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Loop to input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt(); // Store age of the friend
            System.out.println("Enter height (in cm) of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt(); // Store height of the friend
        }

        // Variables to keep track of the youngest and tallest friend indices
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            // Compare ages to find the youngest friend
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Compare heights to find the tallest friend
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest friend and their age
        System.out.println("The youngest friend is Friend " + (youngestIndex + 1) + " with age: " + ages[youngestIndex]);

        // Display the tallest friend and their height
        System.out.println("The tallest friend is Friend " + (tallestIndex + 1) + " with height: " + heights[tallestIndex]);
    }
}
