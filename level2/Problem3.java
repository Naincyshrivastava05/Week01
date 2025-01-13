import java.util.Scanner;

import java.util.Scanner;
public class Problem3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Take user input for year

        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582 && isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        }
        return false; // It's not a leap year
    }
}
