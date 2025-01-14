import java.util.*;

public class SplitString{

		public static boolean compare(String[] arr1, String[] arr2){
			for(int i =0; i<arr1.length; i++){
				if(!(arr1[i].equals(arr2[i]))){
					return false;
				}
			}
			return true;
		}
		public static int countWord(String s){
		if(s.isEmpty()) return 0;
			int count = 1;
			for(int i =0; i<s.length(); i++){
				if(s.charAt(i)==' '){
					count++;
				}
			}
			return count;
		}
		
	public static String[] splitString(String s){
		int n = countWord(s);
		String[] arr = new String[n];
		int index = 0;
		String str = "";
		for(int i =0; i<s.length(); i++){
			if(s.charAt(i)!=' '){
				str +=  s.charAt(i);
			} 
			else{
				arr[index++] = str;
				str = "";
			}
			if(str.length()>0) arr[index] = str;
		}
	
		return arr;
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			String s = sc.nextLine();
			s.trim();
			
			String[] ans1 = splitString(s);
			String[] ans2 = s.split(" ");
			
			System.out.println("Output using custom function is-");
			System.out.println(Arrays.toString(ans1));
			
			System.out.println("Output using inbuilt function is-");
			System.out.println(Arrays.toString(ans2));
			
			boolean ans = compare(ans1,ans2);
			if(ans)System.out.println("Both method gives equal result");
			else System.out.println("Both method gives different result");
			
			}
			
			
		}
