import java.util.Scanner;

class QuotientAndRemainder {

   // Method to find quotient and remainder
   public static int[] findQuotientAndRemainder(int number, int divisor) {
      // Calculate the quotient by dividing the number by the divisor
      int quotient = number / divisor;

      // Calculate the remainder using the modulus operator
      int remainder = number % divisor;

      // Return both quotient and remainder as an array
      return new int[] { quotient, remainder };
   }

   public static void main(String[] args) {

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the number
      System.out.print("Enter the number: ");
      int number = input.nextInt();

      // Prompt the user to enter the divisor
      System.out.print("Enter the divisor: ");
      int divisor = input.nextInt();

      // Ensure the divisor is not zero to avoid division by zero error
      if (divisor == 0) {
         System.out.println("Error: Division by zero is not allowed.");
         return; // Exit the program
      }

      // Call the method to find the quotient and remainder
      int[] result = findQuotientAndRemainder(number, divisor);

      // Display the calculated quotient
      System.out.println("Quotient: " + result[0]);

      // Display the calculated remainder
      System.out.println("Remainder: " + result[1]);
   }
}
