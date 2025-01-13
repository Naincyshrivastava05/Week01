import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for 3 sides of the triangle
        System.out.print("Enter side1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate rounds using a method
        double rounds = calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("The number of rounds needed to complete 5km run: " + rounds);
    }

    // Method to calculate the number of rounds needed to complete a 5km run
    public static double calculateRounds(double side1, double side2, double side3) {
		int distance = 5000;
        double perimeter = side1 + side2 + side3;  // Perimeter of the triangle
        return distance / perimeter;  // 5 km = 5000 meters
    }
}
