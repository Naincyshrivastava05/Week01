public class ArrayIndexOutOfBoundExp {

    // Method to deliberately throw an ArrayIndexOutOfBoundsException
    public static void thowArrayIndexOutOfBoundExp() {
        // Defining an array with a fixed size of 5
        int[] arr = new int[5];
        System.out.println("Exception will occur now:");
        
        // Attempting to access an element at index 7, which is out of bounds for an array of size 5
        System.out.println("The element at index 7 for a size 5 array: " + arr[7]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundExp() {
        // Defining an array with a fixed size of 5
        int[] arr = new int[5];
        System.out.println("Handling ArrayIndexOutOfBoundsException");
        
        try {
            // Attempting to access an element at index 7, which is out of bounds
            System.out.println("The element at index 7 for a size 5 array: " + arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling the ArrayIndexOutOfBoundsException
            System.out.println("Exception caught. Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Calling the method that deliberately throws ArrayIndexOutOfBoundsException
            thowArrayIndexOutOfBoundExp();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the exception and calling the handler method
            System.out.println("Exception occurred in thowArrayIndexOutOfBoundExp(). Calling handleArrayIndexOutOfBoundExp() method.");
            handleArrayIndexOutOfBoundExp();
        }
    }
}
