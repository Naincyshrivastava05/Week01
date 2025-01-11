import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter three First Number1: ");
      	  int num1 = scanner.nextInt();

	System.out.print("Enter three First Number2: ");
     	   int num2 = scanner.nextInt();

	System.out.print("Enter three First Number3: ");
     	    int num3 = scanner.nextInt();

        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3 ? "Yes" : "No"));

	}
}