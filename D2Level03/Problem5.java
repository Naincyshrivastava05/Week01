import java.util.Scanner;
public class Problem5{
	public static void main(String[] args){
	// Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Taking a month as input 
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
 	  // Taking a  day as input 
        System.out.print("Enter day: ");
        int day = input.nextInt();
	// Taking a  year as input 
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Calculate intermediary values
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Print the day of the week
        System.out.println("Day of the week (0=Sunday, 1=Monday, ...): " + d0);

	
	}
}