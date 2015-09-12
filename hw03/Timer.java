//Michael Russo
//Homework 02
//
//Timer Java Program:
//  takes user inputs: 
//    (1) current time (military, HHMM)
//    (2) dinner reservation time (military, HHMM)
//  computes time untill dinner
//
//Instructions:
//  Compile Program:
//    javac Timer.java
//  Run Program:
//    java Timer
//  Input current time
//  Input dinner reservation time

//import scanner class to read user inputs
import java.util.Scanner;

//define Timer class
public class Timer{
    
    //define main method
    public static void main(String[] args){
        
        //declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for inputs and store input values
        System.out.print("Enter current time (HHMM): ");
        int currentTime = myScanner.nextInt();
        System.out.print("Enter dinner time (HHMM): ");
        int dinnerTime = myScanner.nextInt();
        
        //ensure valid entries are valid
        if (dinnerTime < currentTime) {
            System.out.println("Sorry, but you either missed dinner already or your dinner is scheduled for another day.");
            return;
        }
        else if(currentTime < 0 || dinnerTime < 0 || (Integer.toString(currentTime)).length() < 4 || (Integer.toString(dinnerTime)).length() < 4){
            System.out.println("Invalid Entry.  Please enter valid time in military format (HHMM).");
            return;
        }
        
        //compute time until dinner
        int timeUntilDinner = dinnerTime - currentTime;
        
        //compute hours and minutes until dinner
        int minutes = timeUntilDinner % 100;
        int hours = (int)(timeUntilDinner/100.0);
        
        int currentMinutes = currentTime % 100;
        int currentHours = (int)(currentTime/100.0);
        int dinnerMinutes = dinnerTime % 100;
        int dinnerHours = (int)(dinnerTime/100.0);

        if (dinnerMinutes < currentMinutes){
            dinnerMinutes += 60;
            dinnerHours -= 1;
            minutes = dinnerMinutes - currentMinutes;
            hours = dinnerHours - currentHours;
        }
        
        //output minutes and hour untill dinner
        System.out.println("You have " + hours + " hour(s) and " + minutes + " minute(s) until dinner. Have fun!");
        
    }
}

