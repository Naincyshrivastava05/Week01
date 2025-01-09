import java.util.Scanner;

public class Problem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of chocolates
        System.out.print("Enter Total number of chocolates: ");
        int numberOfchocolates = sc.nextInt();
        System.out.print("Enter Total number of days ");
        int numberOfChildren = sc.nextInt();

       // Calculating result
     int chocolatesPerChild = numberOfchocolates / numberOfChildren ;
        int remainingChocolates = numberOfchocolates % numberOfChildren ;

	  // Output result
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates and " 
                           + remainingChocolates + " chocolates remain.");
    }
}
