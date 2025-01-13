import java.util.Scanner;

class Quadratic {

   // Method to find the roots of the quadratic equation
   public static double[] findRoots(double a, double b, double c) {
      // Calculate delta (discriminant)
      double delta = Math.pow(b, 2) - 4 * a * c;

      // Check the nature of the roots based on delta
      if (delta > 0) {
         // Two distinct roots
         double root1 = (-b + Math.sqrt(delta)) / (2 * a);
         double root2 = (-b - Math.sqrt(delta)) / (2 * a);
         return new double[] { root1, root2 }; // Return both roots
      } else if (delta == 0) {
         // One real root
         double root = -b / (2 * a);
         return new double[] { root }; // Return the single root
      } else {
         // No real roots (delta < 0)
         return new double[] {}; // Return an empty array
      }
   }

   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user for coefficients a, b, and c
      System.out.print("Enter the coefficient a: ");
      double a = input.nextDouble();

      // Ensure 'a' is not zero (to avoid division by zero)
      if (a == 0) {
         System.out.println("The coefficient 'a' cannot be zero for a quadratic equation.");
         return; // Exit the program
      }

      System.out.print("Enter the coefficient b: ");
      double b = input.nextDouble();

      System.out.print("Enter the coefficient c: ");
      double c = input.nextDouble();

      // Call the method to find the roots
      double[] roots = findRoots(a, b, c);

      // Display the results based on the number of roots
      if (roots.length == 2) {
         System.out.println("The roots of the quadratic equation are:");
         System.out.println("Root 1: " + roots[0]);
         System.out.println("Root 2: " + roots[1]);
      } else if (roots.length == 1) {
         System.out.println("The quadratic equation has one root:");
         System.out.println("Root: " + roots[0]);
      } else {
         System.out.println("The quadratic equation has no real roots.");
      }
   }
}
