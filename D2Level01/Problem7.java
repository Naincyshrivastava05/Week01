import java.util.Scanner;

class Problem7 {
    public static void main(String[] args) {

      //Create scanner object
        Scanner input = new Scanner(System.in);
      
     //input month
  System.out.print("Enter the Month :-");
        int month = input.nextInt();
//input day 
  System.out.print("Enter the Day:-");
        int day = input.nextInt();

//Cheking if season is spring or not 
   if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6))  {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

