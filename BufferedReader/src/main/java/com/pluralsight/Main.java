package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        //create a filereader
        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader buffReader= new BufferedReader(fileReader);
        buffReader.readLine();
        String input;

        while ((input = buffReader.readLine()) != null){
            String[] token = input.split(Pattern.quote("|"));
            int employeeId = Integer.parseInt(token[0]);
            String name = token[1];
            double hoursWorked = Float.parseFloat(token[2]);
            double payRate = Double.parseDouble(token[3]);


            Employee person = new Employee(employeeId, name, hoursWorked, payRate);
            displayEmployee(person);
        }
        //close the stream and release the resources
        buffReader.close();



    }


    private static void displayEmployee(Employee e){
        System.out.printf("%d:%s Pay this period: $%.2f \n", e.getEmployeeID(), e.getName(), e.CalculateGrossPay());
    }
}