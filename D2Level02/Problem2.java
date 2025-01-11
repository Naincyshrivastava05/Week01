
import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if year is valid
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            // Single if condition using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
	}
}

