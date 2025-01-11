import java.util.Scanner;

class Problem15 {
    public static void main(String[] args) {

  //Initializing Scanner object
        Scanner input = new Scanner(System.in);

       //Input: number
	System.out.print("Enter the number:-");
        int n = input.nextInt();

        if (n >= 0) {
            long factorial = 1;//create variable
            
           
          //multiply using for loop
             for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}

