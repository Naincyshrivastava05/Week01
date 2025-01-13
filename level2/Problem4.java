import java.util.Scanner;

public class Problem4{
	public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }
public static double convertMilesToKm(double miles) {
        // Convert miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        // return the value
        return km;
    }

public static double convertMetersToFeet(double meter) {
        // Convert meter to feet
        double meters2feet = 3.28084;
        double feet= meter* meters2feet;

        // return the value
        return feet;
    }

public static  double convertFeetToMeters(double feet) {
        // Convert Feet To meters
        double  feet2meters = 0.3048;
        double meters = feet *  feet2meters;

        // return the value
        return meters;
    }
        public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();


        // Call the method to convert km to miles
        double miles = convertKmToMiles(km); 

        // Display value in miles
        System.out.println("Distance in miles: " + miles);

        // Calling the Method again to convert km to miles and display it
        System.out.print("Enter the distance in kilometers: ");
        km = sc.nextDouble();
        miles = convertKmToMiles(km);
        System.out.println("Distance in miles: " + miles);
}



}