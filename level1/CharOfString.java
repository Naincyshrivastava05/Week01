import java.util.*;

public class CharOfString {

    public static char[] charOfString(String str) {
        // Create a character array of the same length as the string
        char[] arr = new char[str.length()];

        // Populate the array with characters from the string
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

  
    public static boolean compare(char[] arr1, char[] arr2) {
        // Check if lengths are equal, if not, arrays can't be equal
        if (arr1.length != arr2.length) return false;

        // Compare each character in both arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Convert the string to a character array using charOfString()
        char[] arr1 = charOfString(str);

        // Display the character array
        System.out.println("The characters of the String using charOfString(): " + Arrays.toString(arr1));

        // Convert the string to a character array using toCharArray()
        char[] arr2 = str.toCharArray();

        // Compare the two character arrays
        boolean bool = compare(arr1, arr2);

        // Display whether both methods give the same result or not
        if (bool) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }
    }
}
