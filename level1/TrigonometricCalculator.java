import java.util.Scanner;

class TrigonometricCalculator {

   // Method to calculate sine, cosine, and tangent of an angle
   public double[] calculateTrigonometricFunctions(double angle) {
      // Convert the angle from degrees to radians as Java's Math functions use radians
      double radians = Math.toRadians(angle);

      // Calculate the sine of the angle
      double sine = Math.sin(radians);

      // Calculate the cosine of the angle
      double cosine = Math.cos(radians);

      // Calculate the tangent of the angle
      double tangent = Math.tan(radians);

      // Return the calculated values as an array
      return new double[] { sine, cosine, tangent };
   }

   public static void main(String[] args) {

      // Create an instance of the TrigonometricCalculator class
      TrigonometricCalculator calculator = new TrigonometricCalculator();

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the angle in degrees
      System.out.print("Enter the angle (in degrees): ");
      double angle = input.nextDouble();

      // Validate the input: Handle special cases for tangent where the angle is 90° or its odd multiples
      if (angle % 180 == 90) {
         System.out.println("Tangent is undefined for angles like 90°, 270°, etc.");
         return; // Exit the program
      }

      // Call the method to calculate trigonometric functions
      double[] result = calculator.calculateTrigonometricFunctions(angle);

      // Display the calculated sine value
      System.out.println("Sine: " + result[0]);

      // Display the calculated cosine value
      System.out.println("Cosine: " + result[1]);

      // Display the calculated tangent value
      System.out.println("Tangent: " + result[2]);
   }
}

