
public class NullPointerExp{
		
		public static void checkNullPointerExp(){
			String s = null;
			System.out.println("The Null pointer Exception will accure");
			System.out.println(s.length());
		}
		public static void handleNullPointerExp(){
			String s = null;
			try{
			System.out.println(" Caught the null pointer exception");
			System.out.println(s.length());
			}
			catch(NullPointerException e){
				System.out.println(" Handling a null pointer exception");
			}
		}
		
	public static void main(String[] args){
		System.out.println("Demonstrating the null pointer exception");
		try{
			checkNullPointerExp();
		}
		catch(NullPointerException e){
			handleNullPointerExp();
		}
			
	}
}