import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is  less than 1
        if (number <=1) {
            System.out.println(number + " is NOT a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisors from 2 to sqrt(number) to improve performance 
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }
    }
}
