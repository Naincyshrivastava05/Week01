import java.util.Scanner;

public class  Problem10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base 
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        // Input power
        System.out.print("Enter power: ");
        int power = input.nextInt();

        int result = 1;

        // Calculate power using loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);

        input.close();
    }
}
