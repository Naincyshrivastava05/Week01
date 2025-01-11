import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
	//Initializing scanner object 
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop until user enters 0 or negative
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
	//Index out of bound
            if(index == 10){
	break;
	}
// Loop breaking condition 
            if (num <= 0 || num == 0) {
                break;
            }

            numbers[index] = num;
           
            index++;
        }

        // Display and sum numbers using for loop
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
	 total += numbers[i];
        }
        System.out.println("Total: " + total);
    }
}
