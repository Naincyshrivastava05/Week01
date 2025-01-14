import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        Random rn = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = rn.nextInt(100); // Physics
            scores[i][1] = rn.nextInt(100); // Chemistry
            scores[i][2] = rn.nextInt(100); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // [total, average, percentage]
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimals
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimals
        }
        return stats;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
		    else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int) stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "%\t\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int students = 10; // Number of students
        int[][] scores = generateScores(students); // Generate scores for students
        double[][] stats = calculateStats(scores); // Calculate total, average, and percentage
        String[] grades = calculateGrades(stats); // Calculate grades
        displayScorecard(scores, stats, grades); // Display the scorecard
    }
}
