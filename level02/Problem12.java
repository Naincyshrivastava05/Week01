import java.util.Scanner;

public class Problem12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        // Convert to kilograms
        double kilograms = pounds / 2.2;

        // Output result
        System.out.println("The weight in pounds is " + pounds + " and in kilograms is " + kilograms);
    }
}
