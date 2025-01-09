import java.util.Scanner;

public class Problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: sides of the triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Calculate number of rounds
        double distanceToRun = 5000; // 5 km in meters
        int rounds = (int)(distanceToRun / perimeter);

        // Output result
        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }
}
