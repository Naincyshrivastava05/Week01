import java.util.Scanner;

class Problem11 {
    public static void main(String[] args) {

      //Create scanner object
        Scanner input = new Scanner(System.in);

       //Create a variable to store sum
        double total = 0.0;
	
        while (true) {
            System.out.print("Enter a number (0 or negative to stop) ");
            double number = input.nextDouble();
           
          //checks no equal to 0 or smaller
             if (number <= 0) {
                break;
            }
           //Calculate sum
            total += number;
        }
        System.out.println("The total sum is " + total);
    }
}
