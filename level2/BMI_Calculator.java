import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D array to store weight, height, and BMI for 10 persons
        // 1st column = weight (kg), 2nd column = height (cm), 3rd column = BMI
        double[][] personsData = new double[10][3];
        
        // Taking user input for 10 persons' weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            
            System.out.print("Enter weight (in kg): ");
            personsData[i][0] = sc.nextDouble();
            
            System.out.print("Enter height (in cm): ");
            personsData[i][1] = sc.nextDouble();
            
            // Calculate BMI for each person
            personsData[i][2] = calculateBMI(personsData[i][0], personsData[i][1]);
        }
        
        // Display BMI and Status for each person
        System.out.println("\nBMI and Status for each person:");
        for (int i = 0; i < 10; i++) {
            double weight = personsData[i][0];
            double height = personsData[i][1];
            double bmi = personsData[i][2];
            String status = determineBMIStatus(bmi);
            
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s\n", 
                               i + 1, weight, height, bmi, status);
        }
        
        sc.close();
    }
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {
        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;
        
        // BMI formula: BMI = weight / (height * height)
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine the BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <=24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <=39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
