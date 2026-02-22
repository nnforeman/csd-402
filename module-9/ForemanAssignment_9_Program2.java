/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: February 22nd, 2026
Assignment: Module 9 - Program 2
Purpose: Create or append a file with random numbers, then read and display the file contents.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class ForemanAssignment_9_Program2 {

    public static void main(String[] args) {

        Path filePath = Paths.get("data.file");
        Random rand = new Random();

        StringBuilder sb = new StringBuilder();

        // Generate 10 random numbers separated by spaces
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100);
            sb.append(num);
            if (i < 9) {
                sb.append(" ");
            }
        }
        sb.append(System.lineSeparator());

        try {
            // Create file if it doesn't exist, or append
            Files.writeString(
                    filePath,
                    sb.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

            // Read file and display contents
            System.out.println("Contents of data.file:");
            String contents = Files.readString(filePath);
            System.out.println(contents);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}