import java.util.Scanner;

public class Problem15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: unit price 
        System.out.print("Enter the unit price ");
        double unitPrice = sc.nextDouble();
       // Input: unit quality
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity 
                           + " and unit price is INR " + unitPrice);
    }
}
