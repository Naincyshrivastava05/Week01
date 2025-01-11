import java.util.Scanner;

class Problem17 {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

       //Get salary input
        double salary = input.nextDouble();

         //Get year input
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
    }
}
