import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        // Validate age
        if (age < 0) {
            return false; // Invalid age
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {

        // Array to store ages of 10 students
        int[] studentAges = new int[10];
        Scanner sc = new Scanner(System.in);

        // Input ages for the students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }

        // Check voting eligibility for each student
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote =canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + "): Eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + "): Not eligible to vote.");
            }
        }

    }
}
