package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create an array with 10 quotes
        String[] quotes = {
                " \"If you don’t take risks, you can’t create a future.\" — Monkey D. Luffy, One Piece ",
                " \"Push through the pain. Giving up hurts more.\" — Vegeta, Dragon Ball Z ",
                " \"Hard work is worthless for those that don’t believe in themselves.\" — Naruto Uzumaki, Naruto ",
                " \"Sometimes, we have to look beyond what we want and do what’s best.\" — Piccolo, Dragon Ball Z ",
                " \"Searching for someone to blame is such a pain.\" — Satoru Gojo, Jujutsu Kaisen ",
                " \"Human strength lies in the ability to change yourself.\" – Saitama, One Punch Man ",
                " \"Fools who don’t respect the past are likely to repeat it.\" – Nico Robin, One Piece",
                " \"Forgetting is like a wound. The wound may heal, but it has already left a scar.\" – Monkey D. Luffy, One Piece ",
                " \"Knowing what it feels like to be in pain, is exactly why we try to be kind to others.\" – Jiraiya, Naruto ",
                " \"Believe in your own power.\" – Mikasa Ackerman, Attack on Titan " };

        //use a while loop to continue prompting user
        while (true) {

            //use try /catch to handle error
            try {
                System.out.println("Select a quote by entering a # between 1-10");
                String userInput = input.nextLine();
                int number = Integer.parseInt(userInput);
                System.out.println(quotes[number]);

                //break out of loop by entering 0
                if(number == 0) {
                    break;
                }

            } catch(ArrayIndexOutOfBoundsException e) { // Exception method will apply to all possible errors

                System.out.println("Invalid number, please try again ");

            }
            //second catch
            catch (NumberFormatException e) {
                System.out.println("Please enter a numeric value");
            }

        }

    }



}
