/*
 * Course: CSD 402 – Programming with Java
 * Assignment: 2
 * Author: Natasha Foreman
 * Date: 12/13/2025
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Computer choice: 1 = Rock, 2 = Paper, 3 = Scissors
        int computer = random.nextInt(3) + 1;

        // input
        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int user = scanner.nextInt();

        // choices
        System.out.println("Computer chose: " + nameChoice(computer));
        System.out.println("You chose: " + nameChoice(user));

        // result
        if (computer == user) {
            System.out.println("Result: Tie game");
        } else if (
                (user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)
        ) {
            System.out.println("Result: You win");
        } else {
            System.out.println("Result: Computer wins");
        }

        scanner.close();
    }

    // Converts number to choice
    public static String nameChoice(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else if (choice == 3) {
            return "Scissors";
        } else {
            return "Invalid";
        }
    }
}
