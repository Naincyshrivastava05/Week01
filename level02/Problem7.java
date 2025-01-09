import java.util.Scanner;

public class Problem7{
	public static void main(String[] args){
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		//Input:  Number1
		System.out.print("Enter Number1 :-");
		int num1=sc.nextInt();

		//Input:  Number2
		System.out.print("Enter Number2 :-");
		int num2=sc.nextInt();
		
		//Swapping Two Numbers
		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The swapped numbers are "+ num1 +" and "+ num2 );

	}
}