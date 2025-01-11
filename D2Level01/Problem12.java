import java.util.Scanner;

class Problem12 {
    public static void main(String[] args) {
   
 //Initializing Scanner object
        Scanner input = new Scanner(System.in);

       //Input: number
	System.out.println("Enter the number:-");
        int n = input.nextInt();

        //Check natural no
        if (n >1) {
            int sum = 0, i = 1;

           //Sum using while loop
            while (i <= n) {
                sum += i;
                i++;
            }

         //formula for sum of natural no
            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Results are " + (sum == formulaSum ? "correct." : "incorrect."));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}

