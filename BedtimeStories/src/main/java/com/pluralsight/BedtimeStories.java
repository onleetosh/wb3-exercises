package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nSelect a title:");
            System.out.println("1. Goldilocks and the Three Bears \n2. Hansel and gretel \n3. Mary Had a Little Lamb");
            System.out.print("\nEnter a number (1-3): ");

            int title = prompt.nextInt();

                if (title == 1) {
                    System.out.println("\n\t\"Goldilocks and the Three Bears\" \n\t\t\tby Robert Southey\n");
                    try {
                        // create a FileInputStream object pointing to a specific file
                        FileInputStream fis = new FileInputStream("goldilocks.txt");
                        // create a Scanner to reference the file to be read
                        Scanner scanner = new Scanner(fis);
                        int lineNumber = 1;
                        // read until there is no more data
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine().trim();
                            System.out.println(lineNumber + ". " + line);
                            lineNumber++;
                        }
                        // close the scanner and release the resources
                        scanner.close();
                    } catch (IOException e) {
                        // display stack trace if there was an error
                        e.printStackTrace();
                    }

                    break;

                }
                if (title == 2) {
                    System.out.println("\n\t\"Hansel and Gretel\" \n\t\tby Jacob and Wilhelm Grimm\n");
                    try {
                        // create a FileInputStream object pointing to a specific file
                        FileInputStream fis = new FileInputStream("hansel_and_gretel.txt");
                        // create a Scanner to reference the file to be read
                        Scanner scanner = new Scanner(fis);
                        int lineNumber = 1;
                        // read until there is no more data
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine().trim();
                            System.out.println(lineNumber + ". " + line);
                            lineNumber++;
                        }
                        // close the scanner and release the resources
                        scanner.close();
                    } catch (IOException e) {
                        // display stack trace if there was an error
                        e.printStackTrace();
                    }
                    break;
                }

                if (title == 3) {
                    System.out.println("\n\t\"Mary had a Little Lamb\" \n\t\tby Sarah Josepha Hale \n");
                    try {
                        // create a FileInputStream object pointing to a specific file
                        FileInputStream fis = new FileInputStream("mary_had_a_little_lamb.txt");
                        // create a Scanner to reference the file to be read
                        Scanner scanner = new Scanner(fis);
                        int lineNumber = 1;
                        // read until there is no more data
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine().trim();
                            System.out.println(lineNumber + ". " + line);
                            lineNumber++;
                        }
                        // close the scanner and release the resources
                        scanner.close();
                    } catch (IOException e) {
                        // display stack trace if there was an error
                        e.printStackTrace();
                    }
                    break;
                } else {
                    System.out.println("Invalid option.");
                }

            }

        }
    }
