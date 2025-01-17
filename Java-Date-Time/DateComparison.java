import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Prompt user for the first date
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String inputDate1 = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(inputDate1, formatter);

            // Prompt user for the second date
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String inputDate2 = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(inputDate2, formatter);

            // Compare the two dates
            if (date1.isBefore(date2)) {
                System.out.println("The first date is before the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is after the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("Both dates are the same.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates in the format yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}