import java.util.*;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
       int[] age = new int[n];
	   Random rn = new Random();
	   for(int i =0; i<n; i++){
		age[i] = rn.nextInt(100)+1;
	   }
	   return age;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Age\tVoting Eligibility");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayTable(eligibility);
    }
}
