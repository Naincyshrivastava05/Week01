import java.util.Scanner;

public class Substring{
	public static int count(String s, String sub){
		int index = 0;
		int count = 0;
		while((index = s.indexOf(sub,index)) != -1){
			count++;
			index += sub.length();
		}
		return count;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String -");
		String  s = sc.next();
			System.out.print("Enter the Substring -");
		String sub = sc.next();
		int ans = count(s,sub);
		System.out.println("The number of accurance of substring is-"+ans);
		
	}
}