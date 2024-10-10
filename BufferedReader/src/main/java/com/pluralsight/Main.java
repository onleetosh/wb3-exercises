package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        //create a filereader
        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader buffReader= new BufferedReader(fileReader);
        buffReader.readLine();
        String input;

        //part 2. write a new file
        FileWriter fw = new FileWriter("payroll-oct-2024.txt");
        fw.write("id | name | gross pay\n");

        System.out.printf("%s %17s %22s \n" , "ID", "NAME", "Pay this period"  );
        System.out.println("------------------------------------------------------");

        while ((input = buffReader.readLine()) != null){
            String[] token = input.split(Pattern.quote("|"));
            int employeeId = Integer.parseInt(token[0]);
            String name = token[1];
            double hoursWorked = Float.parseFloat(token[2]);
            double payRate = Double.parseDouble(token[3]);


            Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
            displayEmployee(employee);

            //write file
            String outputData = employee.getEmployeeID() + " | " +  employee.getName() + " | " + employee.CalculateGrossPay()+ "\n";
            fw.write(outputData);

        }
        //close the streams and release the resources
        buffReader.close();
        fw.close();



    }


    private static void displayEmployee(Employee e){
        System.out.printf("%d : %20s       $%.2f \n", e.getEmployeeID(), e.getName(), e.CalculateGrossPay());
    }
}