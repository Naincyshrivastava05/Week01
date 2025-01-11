import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine weight status
        System.out.printf("Your BMI is: %.2f", bmi);
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <=  24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
