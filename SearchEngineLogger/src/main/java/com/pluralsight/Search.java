/*
    TODO: Create a Java application named SearchEngineLogger.
    Create a method to log the actions of the user. Write each user action to a file
    name logs.txt.
    Actions include: a. Launching the application
                     b. Searching for a term
                     c. Exiting the application
    In the main() method prompt the user for a search term that they wish to search.

 */


package com.pluralsight;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Search {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("YYYY-MM-dd  HH:mm:ss");
        String formattedDate = current.format(fmt);

        System.out.println("Testing : " + formattedDate);

        do {
            String launch = PromptInput();
            String search = PromptInput();
            String exit = PromptInput();
        }
        while();



    }

    //Create a method to log the actions of the user. Write each user action to a file name logs.txt.
    public void logUserActions(){

        //action : launch application
        //action : search for a term
        //action : exit application


    }

    public static String PromptInput(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }
}
