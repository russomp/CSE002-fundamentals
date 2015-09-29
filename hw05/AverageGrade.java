//Michael Russo
//Hw 05
//
//Average Grade Java Program:
//  prompts user to enter a grade in range 0 to 100
//  stops taking grade values when user enters '999'
//  computes average of all grades entered by user
//
//Instructions:
//  Compile Program:
//    javac AverageGrade.java
//  Run Program:
//    java AverageGrade
//  Enter grade values in range 0 to 100
//  Enter '999' when finished entering grades


//import scanner class to read user inputs
import java.util.Scanner;

//import input mismatch error for scanner class
import java.util.InputMismatchException;

//define AverageGrade class
public class AverageGrade{
    
    //define main method of AverageGrade class
    public static void main(String[] args){
        
        //declare scanner to store user inputs
        Scanner myScanner = new Scanner(System.in);
        
        //declare and initialize all variables in scope
        double gradeInput = 0;
        double gradesTotal = 0;
        double gradesAverage = 0;
        double numInputs = 0;
        
        //display termination condition
        System.out.println("***Enter '999' when done entering grades***");
        
        //prompt user for valid input
        do{
            //check if user input is a valid number
            try{
                //prompt user for grade and store value as type 'Double' 
                System.out.print("Enter student grade [0-100]: ");
                gradeInput = myScanner.nextDouble();
                
                if (gradeInput != 999){
                    //check for grades out of possible range
                    if ((gradeInput < 0 || gradeInput > 100)){
                        //print error statement if grade is out of range
                        System.out.println("Error: Grade out of range.");
                        //return to top of loop and prompt user for new input
                        continue;
                    }
                    else{
                        //sum valid grade values entered by user
                        gradesTotal += gradeInput;
                        //count number of valid user inputs
                        numInputs ++;
                    }
                }
            }
            //check for invalid entries of type other than 'Double'
            catch (InputMismatchException e){
                //print error statement
                System.out.println("Error: Enter a valid grade value to continue or enter '999' to terminate.");
                myScanner.next();
            }
        } while (gradeInput != 999);
    
        //check if any grades were inpute
        if (numInputs == 0){
            //print error message if no grades are entered
            System.out.println("No grades found.");
        }
        else{
            //calculate and print the average
            gradesAverage = (gradesTotal / numInputs);
            System.out.printf("Average = %.2f\n", gradesAverage);
        }
        
    }
    
}