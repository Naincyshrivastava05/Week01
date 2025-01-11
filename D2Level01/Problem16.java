import java.util.Scanner;

class Problem16 {
    public static void main(String[] args) {

        //Create object
        Scanner input = new Scanner(System.in);

       //Get input no
        int n = input.nextInt();

       //check natural no
        if (n > 0) {
            
           //check even or odd using for loop
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        } else {
           //Print if  not natural no
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}

