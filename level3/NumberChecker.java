public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Non-zero digit found, hence it's a Duck number
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in):
        int number = sc.nextInt();


        // Find the count of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store the digits of the number
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is it a Duck number? " + isDuck);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is it an Armstrong number? " + isArmstrong);

        // Find the largest and second largest digits
        int[] largestDigits = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestDigits[0]);
        System.out.println("Second largest digit: " + largestDigits[1]);

        // Find the smallest and second smallest digits
        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestDigits[0]);
        System.out.println("Second smallest digit: " + smallestDigits[1]);
    }
}
