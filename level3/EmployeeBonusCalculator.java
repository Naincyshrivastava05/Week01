 import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 20000 + random.nextInt(80001); // Salary between 20,000 and 100,000
            data[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate new salary and bonus for employees
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] newData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercent = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newData[i][0] = salary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    // Method to calculate total salary, total new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] newData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < newData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",
                    i + 1, oldSalary, newData[i][1] > 0 ? bonus / oldSalary * 100 : 0, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("Totals:\t\t%.2f\t\t\t\t%.2f\t\t%.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate random employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate the new salary and bonus
        double[][] newData = calculateNewSalaryAndBonus(employeeData);

        // Display the results in a tabular format
        calculateAndDisplayTotals(newData);
    }
}
