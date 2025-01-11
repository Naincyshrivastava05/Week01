import java.util.Scanner;

public class Problem8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input marks for each subject
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do {
                    System.out.print("Enter marks in " + subject + " (0-100): ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >=80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            }
	else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } 
 else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println( "Student            Physics             Chemistry            Maths            Percentage           Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf( 
                              (i + 1)+"                    "+marks[i][0]+"                     "+marks[i][1]+"                         "+ marks[i][2]+"                            "+ percentages[i]+"                      "+ grades[i]);
        }


    }
}
