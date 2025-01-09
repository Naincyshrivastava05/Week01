class Problem5{
	public static void main(String[] args){
	// Number of Pen
	int pen  = 14;
	// Number of  student 
	int student = 3;
	// Number of pens each student get 
	int numPen = pen/student;
	//Number of remaining Non-destributed Pens
	int rem = pen%student;
	System.out.println("The Pen Per Student is "+ numPen+"  and the remaining pen not distributed is "+ rem); 
	}
}