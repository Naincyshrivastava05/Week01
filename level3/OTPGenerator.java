public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        // Check for duplicates by comparing each OTP with every other OTP
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // If any two OTPs are the same, return false
                }
            }
        }
        return true; // If no duplicates are found, return true
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs

        // Generate and store 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
