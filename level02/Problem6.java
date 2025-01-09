import java.util.Scanner;

public class Problem6{
	public static void main(String[] args){
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		//Input:  Salary
		System.out.print("Enter Salary:-");
		int salary =sc.nextInt();

		//Input:  Bonus
		System.out.print("Enter Bonus:-");
		int bonus =sc.nextInt();
		
		//Calculating total income
		int totalIncome = bonus+salary;

		System.out.println("The salary is INR "+ salary+" and bonus is INR "+bonus+" Hence Total Income is INR "+totalIncome);

	}
}