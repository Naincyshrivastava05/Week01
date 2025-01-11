import java.util.Scanner;

class Problem18 {
    public static void main(String[] args) {

       // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Get input
        int number = scanner.nextInt(); // Reads an integer input from the user

        // Loop to calculate and print the multiplication table for the range 6 to 9
        for (int i = 6; i <= 9; i++) { 
// Loop iterates from 6 to 9
            System.out.println(number + " * " + i + " = " + (number * i)); 
            // Outputs the result of number multiplied by the current value of i
        }
    }
}
