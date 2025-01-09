import java.util.Scanner;

class Problem16{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//Input: number of students 
	System.out.print("Enter number of students:-");
	int student = sc.nextInt();
	
	//calculating maximum number of handshakes
	int handshakes = (student*(student-1))/2;
	System.out.println("Number of possible handshakes is:-"+handshakes);
	}
}