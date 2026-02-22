/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: February 22nd, 2026
Assignment: Module 9 - Program 1
Purpose: Write a program using an ArrayList, exception handling, and autoboxing to safely retrieve elements.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ForemanAssignment_9_Program1 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        // Minimum 10 Strings
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("dragonfruit");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("honeydew");
        words.add("kiwi");
        words.add("lemon");

        // Print using for-each loop (showing index too so user can choose)
        System.out.println("ArrayList contents:");
        int index = 0;
        for (String w : words) {
            System.out.println(index + ": " + w);
            index++;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich element number would you like to see again? (0-" + (words.size() - 1) + "): ");

        // Working with user String input
        String userText = input.nextLine();

        try {
            // Autoboxing/Unboxing example:
            // parseInt returns int (primitive) -> autobox into Integer
            Integer choiceObj = Integer.parseInt(userText); // autoboxing
            int choice = choiceObj;                         // auto-unboxing

            // Attempt to print chosen element
            System.out.println("You chose: " + words.get(choice));

        } catch (NumberFormatException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}