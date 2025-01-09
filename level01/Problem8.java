import java.util.*;
class Problem8{
	public static void main(String[] args){
		double km;
	//Initializing Scanner object 
	Scanner sc = new Scanner(System.in);
	//Taking input in kelometers
	km = sc.nextDouble();
	// Converting from km to miles
	double miles = km/1.6;
	
	//Printing the output
	System.out.println("The total miles is :-  "+ miles+ " mile for the given "+ km + " km");
	}
}