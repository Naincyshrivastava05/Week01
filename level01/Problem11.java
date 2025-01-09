import java.util.Scanner;
class Problem11{
	public static void main(String[] args){
		//Creating object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:- ");
		int number1 = sc.nextInt();
		System.out.print("Enter the first number:- ");
		int number2 = sc.nextInt();
		
		//Adding the numbers
		int add = number1+number2;
		//Subtracting the numbers
		int sub = number1-number2;
		//Multiplying the numbers
		int mul = number1*number2;
		//Dividing the numbers
		int div= number1/number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers: " 
    + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);

	}
}