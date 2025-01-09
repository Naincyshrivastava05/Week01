class  Problem6{
	public static void main(String[] args){
	//Fees of students
	int fee = 125000;
	//Discount percent of Fee
	int discountPercent  = 10;
	//Calculating the discount amount on fee
	double discount = (fee * discountPercent) / 100.0;
	//Discounted price the student will pay
	double disAmount = fee - discount;
	System.out.println("The discount amount is INR  "+discount+ "  and final discounted fee is INR  "+disAmount);
}
}