import java.util.Scanner;
class Problem13{
	public static void main(String[] args){
		//Creating the scanner object
		Scanner sc = new Scanner(System.in);
		//Taking paramete as input
		System.out.print("Enter the Paramter-");
		float para = sc.nextFloat();
		
		//Calculating sides of square
		float side  = para/4;
		
		System.out.println("The length of the side is:- "+side+"  whose perimeter is " +para);

		
	}
}