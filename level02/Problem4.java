import java.util.Scanner;

public class Problem4{
	public static void main(String[] args){
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		//Input: Temprature in celsius
		System.out.print("EnterTemprature:-");
		int tempInCel = sc.nextInt();

		//Converting temprature from celsius to Farenhite
		int farenheitResult = (tempInCel * 9 / 5) + 32;

		System.out.println("The temprature "+tempInCel+" is " +  farenheitResult+" farenheit");

	}
}