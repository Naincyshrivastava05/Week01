import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking distance in feet
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = sc.nextInt();

        // Conversion factors
        int feetPerYard = 3;
        int yardsPerMile = 1760;
        int feetPerMile = feetPerYard * yardsPerMile;

        // Convert distance
        int miles = distanceInFeet / feetPerMile;
        int remainingFeet = distanceInFeet % feetPerMile;
        int yards = remainingFeet / feetPerYard;
        remainingFeet = remainingFeet % feetPerYard;

        // Output
        System.out.println("The distance is " + miles + " miles, " + yards + " yards, and " + remainingFeet + " feet.");
    }
}