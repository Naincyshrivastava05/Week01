import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.println("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];

        String[] weightStatuses = new String[numberOfPersons];

        // Input height and weight for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            System.out.println("Enter weight (in kilograms) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]); // BMI formula

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25.0) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] < 40.0) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("Results:");
        System.out.println( "Height(m)       Weight(kg)                BMI        Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf( heights[i]+"               "+ weights[i]+"         "+ bmis[i]+"           "+ weightStatuses[i]);
        }
    }
}
