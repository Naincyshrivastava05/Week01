import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate handshakes using a method
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes is: " + handshakes);
    }

    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
