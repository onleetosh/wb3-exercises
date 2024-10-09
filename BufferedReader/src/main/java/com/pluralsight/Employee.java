package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    //constructor with parameters to pass data through
    public Employee(int employeeID, String name,  double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }


    //getter method
    public int getEmployeeID() { return employeeID; }
    public String getName() {  return name; }
    public double getHoursWorked() { return hoursWorked; }
    public double getPayRate() { return payRate; }


    //setter methods
    public void setName(String name) { this.name = name; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
    public void setPayRate(double payRate) { this.payRate = payRate;}




    //method designed to calculate and return gross pay
    public double CalculateGrossPay() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return (payRate * 40) + (payRate * overtimeHours * 1.5);
        }
        else{
            return hoursWorked * payRate;
        }
    }

}
