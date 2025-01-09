import java.util.Scanner;

class Problem1{
	public static void main(String[] args){

 	 // Create a Scanner object to take input from the user
	Scanner sc = new Scanner(System.in);
	//Input: Number1
	System.out.print("Enter number 1:-");
	int number1 = sc.nextInt();
	
	//Input: Number2
	System.out.print("Enter number 2:-");
	int number2= sc.nextInt();
	
	//Calculating Quotient 
	int quo = number1/number2;
	
	//Calculating Reminder
	int rem = number1%number2;

	System.out.println(" The Quotient is "+ quo +"  and Reminder is " + rem+ " of two number "+ number1+"  and "+number2);
	}
}