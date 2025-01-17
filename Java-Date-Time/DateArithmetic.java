import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Prompt user for a date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate, formatter);
            System.out.println("Original Date: " + date);

            // Add 7 days, 1 month, and 2 years
            LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
            System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate);

            // Subtract 3 weeks
            LocalDate finalDate = modifiedDate.minusWeeks(3);
            System.out.println("After subtracting 3 weeks: " + finalDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        
    }
}