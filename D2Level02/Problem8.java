import java.util.Scanner;

public class Problem8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input age and height of Amar
        System.out.print("Enter Amar's age and height (in cm): ");
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();
	    // Input age and height of Akbar
        System.out.print("Enter Akbar's age and height (in cm): ");
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();
    // Input age and height of Anthony
        System.out.print("Enter Anthony's age and height (in cm): ");
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        // Find youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestName = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Find tallest
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestName = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("The youngest is: " + youngestName);
        System.out.println("The tallest is: " + tallestName);

    }
}
