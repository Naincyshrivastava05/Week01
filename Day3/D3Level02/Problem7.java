import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array for height, weight, and BMI
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number]; // To store weight status

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter data for Person " + (i + 1) + ":");

            // Input weight
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Input height
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
 System.out.println( "Height(m)       Weight(kg)                BMI        Weight Status");

        for (int i = 0; i < number; i++) {
            System.out.printf( 
                              personData[i][0]+"           "+ personData[i][1]+"             " + personData[i][2]+"         "+weightStatus[i]);
        }
    }
}
