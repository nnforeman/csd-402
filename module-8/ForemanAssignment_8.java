/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: February 15, 2026
Assignment: Module 8
Purpose: Write a program with a class ArrayListTest.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class NatashaArrayListTest {

    // Finding the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {

        // If the list is empty, return 0
        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    // Main method for testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        Integer value;

        do {
            value = input.nextInt();
            numbers.add(value);   // 0 is also added
        } while (value != 0);

        // Call the max method
        Integer result = max(numbers);

        // Display result
        System.out.println("The largest value is: " + result);

        input.close();
    }
}
