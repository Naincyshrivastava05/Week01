import java.util.Scanner;

class Problem9{
	public static void main(String[] args){
	//Creating object of Scanner class
	Scanner sc = new Scanner(System.in);

	//Fees of students
	double fee = sc.nextInt();

	//Discount percent of Fee
	double discountPercent  = sc.nextDouble();

	//Calculating the discount amount on fee
	double discount = (fee * discountPercent) / 100.0;

	//Discounted price the student will pay
	double disAmount = fee - discount;

	System.out.println("The discount amount is INR  "+ discount + "  and final discounted fee is INR  "+disAmount);

	
	}
}