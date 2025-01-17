import java.util.Scanner;

public class IsPrime{
	public static void isPrime(int n){
		for(int i = 2; i<Math.sqrt(n); i++){
			if(n%i == 0) {
				System.out.println("The given number is not a Prime number");
				break;
			}
		}
		System.out.println("The given number is a Prime number");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		isPrime(n);
	}
}