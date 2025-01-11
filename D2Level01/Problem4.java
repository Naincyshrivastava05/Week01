import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {
        //Initializing Scanner object
        Scanner input = new Scanner(System.in);
       
         //Taking number as input
	System.out.print("Enter the number:-");
        int number = input.nextInt();

            //Checking and sum natural number
        if (number >= 0) {
            //formula n * (n+1) / 2 
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
