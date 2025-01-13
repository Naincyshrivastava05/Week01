import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        int numStudents = 5; // Example number of students
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    // Method to generate random scores for PCM subjects
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(51); // Physics score: 50-100
            scores[i][1] = 50 + rand.nextInt(51); // Chemistry score: 50-100
            scores[i][2] = 50 + rand.nextInt(51); // Math score: 50-100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // 3 columns for total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard using "\t" for alignment
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t"); // Student number
            System.out.print(scores[i][0] + "\t");  // Physics
            System.out.print(scores[i][1] + "\t\t"); // Chemistry
            System.out.print(scores[i][2] + "\t");  // Math
            System.out.print((int) results[i][0] + "\t"); // Total
            System.out.print(results[i][1] + "\t"); // Average
            System.out.println(results[i][2]); // Percentage
        }
    }
}
