/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Assignment: Module 12
Purpose: Demonstrate method overloading by calculating the cost of a yearly auto service visit with different parameters.
*/

public class ForemanAssignment_12 {

    // Standard service charge
    public static double yearlyService() {
        double standardCharge = 100.00;
        return standardCharge;
    }

    // Standard service charge + oil change
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 100.00;
        return standardCharge + oilChangeFee;
    }

    // Standard service charge + oil change + tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 100.00;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Standard service charge + oil change + tire rotation - coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        double standardCharge = 100.00;
        return standardCharge + oilChangeFee + tireRotationFee - couponAmount;
    }

    public static void main(String[] args) {

        // Test each method twice

        System.out.println("No parameters:");
        System.out.println("Service Cost: $" + yearlyService());
        System.out.println("Service Cost: $" + yearlyService());

        System.out.println("\nOne parameter (oil change):");
        System.out.println("Service Cost: $" + yearlyService(35.00));
        System.out.println("Service Cost: $" + yearlyService(40.00));

        System.out.println("\nTwo parameters (oil change + tire rotation):");
        System.out.println("Service Cost: $" + yearlyService(35.00, 20.00));
        System.out.println("Service Cost: $" + yearlyService(40.00, 25.00));

        System.out.println("\nThree parameters (oil change + tire rotation - coupon):");
        System.out.println("Service Cost: $" + yearlyService(35.00, 20.00, 10.00));
        System.out.println("Service Cost: $" + yearlyService(40.00, 25.00, 15.00));
    }
}