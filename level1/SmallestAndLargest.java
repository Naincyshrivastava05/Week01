import java.util.Scanner;

class SmallestAndLargest {

   // Method to find the smallest and largest numbers among three integers
   public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
      // Calculate the smallest number using Math.min
      int smallest = Math.min(number1, Math.min(number2, number3));
      
      // Calculate the largest number using Math.max
      int largest = Math.max(number1, Math.max(number2, number3));
      
      // Return the smallest and largest numbers as an array
      return new int[] { smallest, largest };
   }

   public static void main(String[] args) {

      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the first number
      System.out.print("Enter first number: ");
      int number1 = input.nextInt();

      // Prompt the user to enter the second number
      System.out.print("Enter second number: ");
      int number2 = input.nextInt();

      // Prompt the user to enter the third number
      System.out.print("Enter third number: ");
      int number3 = input.nextInt();

      // Find the smallest and largest numbers using the method
      int[] result = findSmallestAndLargest(number1, number2, number3);

      // Display the smallest number
      System.out.println("The smallest number is: " + result[0]);

      // Display the largest number
      System.out.println("The largest number is: " + result[1]);
   }
}
