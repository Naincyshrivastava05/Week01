import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {

        // Create arrays to store employee data
	//Creating array of salaries
        double[] salaries = new double[10];
	//Creating array of year of service
        double[] yearsOfService = new double[10];
	//Creating array of amout
        double[] bonusAmounts = new double[10];
	//Creating array of new salaries
        double[] newSalaries = new double[10];

        // Variables for total calculations
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        // Input salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = sc.nextDouble();

            // Cheking input is valid or not
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter data for the same employee
                continue;
            }

            // Store valid input
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonus and new salaries
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusPercentage;
            double newSalary = salaries[i] + bonus;

            // Update arrays and totals
            bonusAmounts[i] = bonus;
            newSalaries[i] = newSalary;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

 

        // Display total bonus and salary details
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
