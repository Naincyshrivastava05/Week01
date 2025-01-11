import java.util.Scanner;

class Problem5 {
    public static void main(String[] args) {

	//Initializing Scanner object
        Scanner input = new Scanner(System.in);

         //Get age input

        int age = input.nextInt();
     
         //Checking age if a person age
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}

