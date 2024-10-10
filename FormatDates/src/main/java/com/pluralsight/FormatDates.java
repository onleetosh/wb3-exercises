/*
 * Create a Java application named FormatDates. The application will get the
 * current date and time and display that information in the different formats
 */

package com.pluralsight;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();
        System.out.println("\nNo format yet: "+current);

        //format(fmt) to show (mm /dd/yyyy)
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM / dd / yyyy");
        String formattedDate1 = current.format(fmt1);
        System.out.println("\nFormat 1: " + formattedDate1);

        //format(fmt) to show (yyyy - mm - dd)
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy - MM - dd");
        String formattedDate2 = current.format(fmt2);
        System.out.println("\nFormat 2: " + formattedDate2);

        //format(fmt) to show (month date, year)
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate3 = current.format(fmt3);
        System.out.println("\nFormat 3: "+ formattedDate3);

        //format(fmt) to show (day, mon date, year  HH:mm)
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy  HH:mm a");
        String formattedDate4 = current.format(fmt4);
        System.out.println("\nFormat 4: "+ formattedDate4);

        //format(fmt) to show (ex. 5:02 on 05-Sep-2021 ) with local time zone
        //ZonedDateTime zone = ZonedDateTime.now();
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("HH:mm a 'on' MMM, dd, yyyy");
        String formattedDate5 = current.format(fmt5);
        System.out.println("\nFormat 5: "+ formattedDate5);







    }
}
