import java.util.Scanner;
class NaturalNumberSum {

   // Method to find the sum of N natural numbers
   public int findSum(int n) {
      // Initialize a variable to store the sum
      int sum = 0;

      // Iterate from 1 to n and calculate the sum
      for (int i = 1; i <= n; i++) {
         sum += i; // Add the current number to the sum
      }

      // Return the calculated sum
      return sum;
   }

   public static void main(String[] args) {
      // Create an instance of the NaturalNumberSum class
      NaturalNumberSum calculator = new NaturalNumberSum();

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter a number N
      System.out.print("Enter a number N: ");
      int n = input.nextInt();

      // Calculate the sum of the first N natural numbers using the findSum method
      int sum = calculator.findSum(n);

      // Display the result to the user
      System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
   }
}
