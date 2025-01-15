
// Import necessary classes
import java.util.Scanner;

public class Calendar{

    // Array storing names of the months
    private static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array storing the number of days in each month (non-leap year)
    private static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month (MM format)
        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();

        // Prompt the user to enter the year (YYYY format)
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();

        // Display the calendar header
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month and the number of days in the month
        int firstDay = getFirstDay(month, year);
        int daysInCurrentMonth = getDaysInMonth(month, year);

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int i = 1; i <= daysInCurrentMonth; i++) {
            System.out.printf("%3d", i);
            // Print a newline after every Saturday
            if ((i + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    // Method to get the name of the month based on its number
    public static String getMonthName(int month) {
        return monthNames[month - 1]; // Array is 0-indexed, so subtract 1
    }

    // Method to get the number of days in the given month and year
    public static int getDaysInMonth(int month, int year) {
        // Adjust for February in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1]; // Array is 0-indexed, so subtract 1
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 4 and not 100 unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month using Zeller's congruence
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12; // Adjust year for January and February
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Calculate auxiliary value
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Adjust month for Zeller's formula
        return (1 + x + 31 * m0 / 12) % 7; // Calculate the day of the week (0 = Sunday)
    }
}



