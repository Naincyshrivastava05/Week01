     
 import  java.util.Scanner;

class SpringSeason {

   // Method to check if it's Spring season
   public boolean isSpringSeason(int month, int day) {
      if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
         return true;
      }
      return false;
   }

   public static void main(String[] args) {

     //Create class obj
      SpringSeason season = new SpringSeason();

      // User input for month and day
      Scanner input = new Scanner(System.in);
      System.out.print("Enter month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter day (1-31): ");
      int day = input.nextInt();

      // Check and display result
      if (season.isSpringSeason(month, day)) {
         System.out.println("It's a Spring Season.");
      } else {
         System.out.println("Not a Spring Season.");
      }
   }
}

