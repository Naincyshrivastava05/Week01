import java.util.*;

public class Rotation{
	public static void rotate(int[] arr, int rotation){
	int n = arr.length;
		for(int i =0; i<rotation; i++){
			int temp = arr[n-i-1];
			for(int j =arr.length-1; j>=1; j--){
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of arrray");
		int n = sc.nextInt();
		System.out.println("Enter the element of the array");
		int[] arr = new int[n];
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number of rotation");
		int r = sc.nextInt();
		rotate(arr, r);
		System.out.println(Arrays.toString(arr));
	}
}