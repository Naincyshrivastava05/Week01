import java.util.Scanner;
public class Problem1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

     	   // 1. Check if a number is divisible by 5
    	    System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0 ? "Yes" : "No"));

	}
}