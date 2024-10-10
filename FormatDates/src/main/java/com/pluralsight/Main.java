package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("\nToday is: " +today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("\nThe current time: " +currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("\nRight now , right now: " + rightNow);

        //LocalDate class has methods that allow you to get information about the date
        LocalDate date = LocalDate.now();
        System.out.println("\nDay of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        //The LocalTime class has methods that allow you to get information about the time
        LocalTime time = LocalTime.now();
        System.out.println("\nHour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());

        //The DateTimeFormatter class can be used to help you display dates/times in a format that you need
        LocalDateTime today2 = LocalDateTime.now();
        System.out.println("\nToday is: " + today2);
        // Specify the date/time format you will want to use
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today2.format(fmt);
        System.out.println("Today is: " + formattedDate);

        String userInput;
        DateTimeFormatter formatter;
        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println("\nYour birthday fomatted: " + birthDay);

    }
}