import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
	
	//Initializing Scanner object
        Scanner input = new Scanner(System.in);
	//Taking counter as input
 System.out.print("Enter the number:-");
        int counter = input.nextInt();
//looping throw counter
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launch");
    }
}

