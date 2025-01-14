import java.util.*;

public class SplitString{
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
		
	public static String[] spilString(String s){
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
		
		public static  int wordLength(String s){
			int length = 0;
			for(char c: s.toCharArray()){
				length++;	
			}
			return length;
		}
		
		public static String[][] splitArray(String[] arr){
			String[][] ans = new String[arr.length][2];
			
			for(int i =0; i<arr.length; i++){
				String s = arr[i];
				ans [i][0] = s;
				ans [i][1] = String.valueOf(wordLength(s));
			}
			return ans;
		}
		
		
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			String s = sc.nextLine();
			s.trim();
			
			String[] ans = spilString(s);
			System.out.println(Arrays.toString(ans));
			
			String[][] result = splitArray(ans);
			
			System.out.println("word\tlength");
			for(int i =0; i<result.length; i++){
				System.out.println(result[i][0] +"\t"+result[i][1]);
			}
			
			
		}
}