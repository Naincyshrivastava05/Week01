import java.util.*;

class Problem12{
	public static void main(String[] args){
	 //Creating object of Scanner
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Height:- ");
	double ht= sc.nextInt();
	System.out.print("Enter the Base:- ");
	double base = sc.nextInt();
		
	//Calculating area in centimeters 
	double area1 = 0.5*ht*base;
	double area2 = area1 * 0.155;

	System.out.println("Area in centimers is:- "+ area1+ " Area in inches is:- "+ area2);
	}
}