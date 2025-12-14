/*
 * Course: CSD 402 – Programming with Java
 * Assignment: 1
 * Author: Natasha Foreman
 * Date: 12/5/2025
 */

import java.util.Scanner;

public class EnergyCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemp = input.nextDouble();

        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        System.out.println("\nThe energy needed to heat the water is: " + energy + " Joules");

        input.close();
    }
}
