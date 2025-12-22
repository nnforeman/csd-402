/*
 * Course: CSD 402 – Programming with Java
 * Assignment: 3
 * Author: Natasha Foreman
 * Date: 12/21/2025
 */

public class NestedLoopsPattern {
    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("   ");
            }

            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            value /= 4;

            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value /= 2;
            }

            System.out.println("  @");
        }
    }
}
