import java.util.Arrays;

class RandomNumberStatistics {

   // Method to generate an array of 4-digit random numbers
   public int[] generate4DigitRandomArray(int size) {
      int[] randomNumbers = new int[size];
      for (int i = 0; i < size; i++) {
         // Generate a random 4-digit number (between 1000 and 9999)
         randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
      }
      return randomNumbers;
   }

   // Method to find the average, minimum, and maximum values of an array
   public double[] findAverageMinMax(int[] numbers) {
      int sum = 0, min = numbers[0], max = numbers[0];

      for (int num : numbers) {
         sum += num; // Add to the sum
         min = Math.min(min, num); // Update the minimum value
         max = Math.max(max, num); // Update the maximum value
      }

      // Calculate the average
      double average = (double) sum / numbers.length;

      // Return the results as a double array
      return new double[] { average, min, max };
   }

   public static void main(String[] args) {
      // Create an instance of the class
      RandomNumberStatistics statistics = new RandomNumberStatistics();

      // Generate an array of 5 random 4-digit numbers
      int[] randomNumbers = statistics.generate4DigitRandomArray(5);

      // Display the generated numbers
      System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

      // Find and display the average, minimum, and maximum values
      double[] results = statistics.findAverageMinMax(randomNumbers);
      System.out.println("Average: " + results[0]);
      System.out.println("Minimum: " + (int) results[1]);
      System.out.println("Maximum: " + (int) results[2]);
   }
}
