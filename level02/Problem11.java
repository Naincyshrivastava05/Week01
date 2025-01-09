import java.util.Scanner;

public class Problem11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        int time = sc.nextInt();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " 
                           + principal + ", Rate " + rate + ", and Time " + time);
    }
}
