class Problem7{
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        // Conversion factor from cubic kilometers to cubic miles
        double kmToMiles = 0.239913;

        // Volume of Earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Volume of Earth in cubic miles
        double volumeMiles= volumeKm* kmToMiles;

        // Output the results
        System.out.println("The volume of Earth in cubic kilometers is: " + volumeKm + " and cubic miles is : " +volumeMiles);
    }
}
