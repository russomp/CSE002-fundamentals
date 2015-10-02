/*
Michael Russo
CSE002 - Lab 06

Time Sheets Java Program:
  prompt user to enter the number of employees on payroll
  prompt user to enter the employee pay rate
  prompt user to enter the hours worked for each day
  repeat for all employees on payroll
  compute and print the total payroll

Instructions:
  Compile Program:
    javac Calculator.java
  Run Program:
    java Calculator
  Input number of employees on payroll
  Input employee pay rate
  Input employee hours
*/

//import scanner class to read user inputs
import java.util.Scanner;

//define Time Sheets class
public class TimeSheets{
    
    //define main method of Timer class
    public static void main(String[] args){
        
        //declare scanner to store user inputs
        Scanner myScanner = new Scanner(System.in);
        
        //print welcome message for user and store number of employees
        System.out.println("*** Welcome to Time Sheets ***");
        System.out.print("Enter the number of employees on your payroll to get started:  ");
        int numEmployees = myScanner.nextInt();

        //set up an array to store days of the week
        String [] workDays = {"Mon: ", "Tues: ", "Wed: ", "Thurs: ", "Fri: "};

        //initialize variables to store employee pay rate and hours
        double payRate = 0;
        double dailyHours = 0;

        //initialize variables to store employee wages and total payroll
        double totalHours = 0;
        double employeePayroll = 0;
        double totalPayroll = 0;

        //compute total payroll
        for (int i = 1; i <= numEmployees; i++){
            
            //print set-up message for each employee
            System.out.print("Enter the pay rate for Employee #" + i + " (cents/hour): ");
            payRate = myScanner.nextDouble();
            System.out.println("-- Enter daily hours for Employee #" + i + " --");
            
            //compute employee hours and payroll 
            for (int j = 0; j < 5; j++){
                System.out.print(workDays[j]);
                dailyHours = myScanner.nextDouble();
                totalHours += dailyHours;
            }

            //add employee payroll to total payroll
            totalPayroll += totalHours * payRate; 
        }

        //display total payroll and exit message
        System.out.println("...");
        System.out.printf("Total Payroll: $%.2f\n", totalPayroll/100);
        System.out.println("*** Exiting Program ***");

    }
}
