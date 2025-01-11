import java.util.Scanner;


class Problem9 {
    public static void main(String[] args) {
//Initializing Scanner object
        Scanner input = new Scanner(System.in);
	//Taking counter as input
 System.out.print("Enter the number:-");
        int st= input.nextInt();


       //Decrement no
        for (int i = st; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch");
    }
}

