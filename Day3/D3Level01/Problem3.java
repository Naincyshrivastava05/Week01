import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
	//Initializing Scanner object
        Scanner scanner = new Scanner(System.in);
	//Taking number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing  multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
