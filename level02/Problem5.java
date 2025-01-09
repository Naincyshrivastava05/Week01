import java.util.Scanner;

public class Problem5{
	public static void main(String[] args){
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		//Input: Temprature in Farenhite
		System.out.print("EnterTemprature:-");
		double fahrenheit =sc.nextDouble();

		//Converting temprature from celsius to Farenhite
		double celsiusResult = (fahrenheit -32)* 5/9;

		System.out.println("The temprature "+ fahrenheit +" farenheit is " +  celsiusResult +" celsius");

	}
}