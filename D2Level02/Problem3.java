import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Determine grade
        String grade;
        if (percentage >= 80) {
            grade = "Level4, Abobe agency-normalized standars";
        } else if (percentage >= 70 && percentage <=79) {
            grade = "Level3, at Agency-normalized standars";
        } else if (percentage >= 60 && percentage <=69) {
            grade = "Level2, below but approaching  agency-normalized standards ";
        } else if (percentage >= 50 && percentage <=59) {
            grade = "Level1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage <=49) {
            grade = "Level1, too below agency-normalized standards";
        } else {
            grade = "Remedial standards";
        }

        // Output the results
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);

    }
}
