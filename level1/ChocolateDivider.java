import java.util.Scanner;

class ChocolateDivider {

   // Method to find chocolates per child and remaining chocolates
   public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
      // Calculate the number of chocolates each child gets
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;

      // Calculate the number of remaining chocolates
      int remainingChocolates = numberOfChocolates % numberOfChildren;

      // Return the result as an array containing chocolates per child and remaining chocolates
      return new int[] { chocolatesPerChild, remainingChocolates };
   }

   public static void main(String[] args) {

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the total number of chocolates
      System.out.print("Enter the number of chocolates: ");
      int numberOfChocolates = input.nextInt();

      // Prompt the user to enter the number of children
      System.out.print("Enter the number of children: ");
      int numberOfChildren = input.nextInt();

      // Ensure the number of children is not zero to prevent division by zero error
      if (numberOfChildren == 0) {
         System.out.println("Error: Number of children cannot be zero.");
         return; // Exit the program
      }

      // Call the method to divide chocolates among children
      int[] result = divideChocolates(numberOfChocolates, numberOfChildren);

      // Display how many chocolates each child gets
      System.out.println("Each child gets: " + result[0] + " chocolates");

      // Display the number of remaining chocolates
      System.out.println("Remaining chocolates: " + result[1]);
   }
}
