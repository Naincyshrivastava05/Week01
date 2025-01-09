import java.util.Scanner;

class Problem10{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	//Taking height as input
	System.out.println("Enter the Height:- ");
	double height = sc.nextInt();

	// Converting into inches
	double inch = height/2.54;

	//Converting into Feets
	double feet = inch/12;
	
	System.out.println("Your Heigth in cm is:- "+ height+" while in feet is- "+feet+" and inches is- "+inch);

	}
}