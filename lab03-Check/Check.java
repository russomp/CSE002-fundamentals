//Michael Russo
//Lab 03
//
//Check Java Program:
//  takes user inputs
//    (1) original cost of bill
//    (2) precentage tip desired
//    (3) number of people splitting the check
//  computes the total dollar amount each person needs to pay
//
//Instructions:
//  Compile Program:
//    javac Check.java
//  Run Program:
//    java Check
//  Input dollar amount for cost of bill (###.##)
//  Input precentage tip desired (###.##)
//  Input number of people splitting bill (##) 
//

//import scanner utility
import java.util.Scanner;

//define class
public class Check{
    
    //define main method
    public static void main(String[] args){
        
        //declare scanner class
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for inputs listed above
        System.out.print("Enter total bill ($###.##): $");
        double billTotal = myScanner.nextDouble();
        System.out.print("Enter precent tip desired (%##.#): %");
        double percentTip = myScanner.nextDouble();
        percentTip /= 100;
        percentTip += 1;
        System.out.printf("Enter number of people paying the bill (##): ");
        double numSplit = myScanner.nextDouble();
        
        //declare output variables and compute values
        double taxedTotal = billTotal * percentTip;
        double billPerPerson = taxedTotal / numSplit;
        
        //display cost per person splitting the bill
        System.out.printf("Each person owes $%.2f\n", billPerPerson);
        
    }
}