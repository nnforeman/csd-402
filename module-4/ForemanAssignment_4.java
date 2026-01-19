/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: January 18, 2026
Assignment: Module 4
Purpose: Calculate and display the average of arrays using overloaded methods.
*/

public class AverageTest {

    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        System.out.print("Short array elements: ");
        for (short s : shortArray) {
            System.out.print(s + " ");
        }
        System.out.println("\nAverage: " + average(shortArray) + "\n");

        System.out.print("Int array elements: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nAverage: " + average(intArray) + "\n");

        System.out.print("Long array elements: ");
        for (long l : longArray) {
            System.out.print(l + " ");
        }
        System.out.println("\nAverage: " + average(longArray) + "\n");

        System.out.print("Double array elements: ");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
