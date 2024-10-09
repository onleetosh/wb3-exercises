package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = " ";
        int title = 0;

        // Loop until a valid option is selected
        while (true) {
            System.out.println("\nSelect a title:");
            System.out.println("1. Goldilocks and the Three Bears");
            System.out.println("2. Hansel and Gretel");
            System.out.println("3. Mary Had a Little Lamb");
            System.out.print("\nEnter a number (1-3): ");

            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                title = scanner.nextInt();

                // Switch case for valid file selection
                switch (title) {
                    case 1:
                        fileName = "goldilocks.txt";
                        break;
                    case 2:
                        fileName = "hansel_and_gretel.txt";
                        break;
                    case 3:
                        fileName = "mary_had_a_little_lamb.txt";
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        continue;  // Invalid input, re-prompt the user
                }
                break;  // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next();  // Clear the invalid input
            }
        }

        // After valid input
        if (title== 1){
            System.out.println("\n\t\"Goldilocks and the Three Bears\" \n\t\t\tby Robert Southey\n");
        }
        if (title == 2){
            System.out.println("\n\t\"Hansel and Gretel\" \n\t\tby Jacob and Wilhelm Grimm\n");

        }
        if (title==3){
            System.out.println("\n\t\"Mary had a Little Lamb\" \n\t\tby Sarah Josepha Hale \n");

        }

        // Attempt to read and display the file
        try {
            readFile(fileName);  // Call the method to read and display the file
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to read and display the file contents
    private static void readFile(String fileName) throws IOException {
        // Create a FileInputStream and a Scanner to read the file
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);

        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            System.out.println(lineNumber + ". " + line);
            lineNumber++;
        }

        // Close resources
        scanner.close();
        fis.close();
    }
}
