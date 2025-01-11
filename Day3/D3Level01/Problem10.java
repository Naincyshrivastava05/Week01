import java.util.Scanner;

public class Problem10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String[] resultArray = new String[number];

        // Looping throw elements
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultArray[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultArray[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                resultArray[i - 1] = "Buzz";
            } else {
                resultArray[i - 1] = String.valueOf(i);
            }
        }

        // Displaing result 
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + resultArray[i]);
        }
    }
}
