import java.util.Scanner;

public class CompareString{

	public static boolean compareStirng(String s1, String s2){
		
		for(int i =0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i))
			return false;
		}
		return true;
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();
	
	boolean first = compareStirng(s1,s2);
	if(first){
	System.out.println("Both String are equal");
	}
	else{
	System.out.println("Both String are not equal");
	}
	boolean sec = s1.equals(s2);
		
	if(first == sec){
		System.out.println("Method and .equals() both give same result");
	}
	else{
		System.out.println("Method and .equals() both give different result");
	}
	}
}