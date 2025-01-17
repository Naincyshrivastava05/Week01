import java.util.Scanner;

public class Fibonacci {
    // Calculate and print Fibonacci series
    public static void fibonacci(int n) {
        int f = 0;
        int s = 1;

        if (n >= 1) {
            System.out.println(f); // Print the first number
        }
        if (n >= 2) {
            System.out.println(s); // Print the second number
        }

        for (int i = 3; i <= n; i++) { // Start from 3 since first two numbers are printed
            int third = f + s;
            System.out.println(third);
            f = s;
            s = third;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
