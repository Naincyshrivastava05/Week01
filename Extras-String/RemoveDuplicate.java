import java.util.*;

public class RemoveDuplicate{
	//Function to reverse String
	public static String remove(String s){
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<s.length(); i++){
			char currentChar = s.charAt(i);
			if(sb.indexOf(String.valueOf(currentChar))==-1) {
				sb.append(currentChar);
			}
		}
		return sb.toString();
		
	}
	
	 // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.println("Enter String -");
        String s = sc.next(); // Read the string input from the user

        // Call the reverse method to remove duplicate character
        String ans = remove(s);

        // Print the result
       System.out.println(ans);
    }
	
}