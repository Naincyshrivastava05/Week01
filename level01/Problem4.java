class Problem4{
	public static void main(String[] args){		
		//HardCoding values
		double costPrice = 129;
		 double sellingPrice = 191;

		//Calcutating Profit in number
		double profit = sellingPrice - costPrice;

		//Calculating Profit in Percentage
		double profitPercentage =(profit/costPrice)*100;
		
		System.out.println("Profit in number is:-" + profit + " Profit in percentage is:-" + profitPercentage); 
	}
}