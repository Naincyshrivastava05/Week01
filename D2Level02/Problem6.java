import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int i = 1;

        // Loop using while
        while (i <= n) {
          //If number is multiple of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
	//If number is multiple of 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
	//If number is multiple of  5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            
        }
	i++;
}
    }
}