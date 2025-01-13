public class StringIndexOutOfBoundsExp {

    // Method to demonstrate StringIndexOutOfBoundsException
    public static void checkStringIndexOutOfBound() {
        String s = "Hello";
        System.out.println("Character at index 10: " + s.charAt(10)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBound() {
        try {
            checkStringIndexOutOfBound(); // Calling the method that causes the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handling index out of bound exception.");
            System.out.println("Exception Message: " + e.getMessage()); // Correct usage of e.getMessage()
        }
    }

    public static void main(String[] args) {
        handleStringIndexOutOfBound(); // Call the handler method
    }
}
