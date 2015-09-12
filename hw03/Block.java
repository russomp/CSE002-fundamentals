//Michael Russo
//Homework 03
//
//Block Java Program:
//  takes user inputs: 
//    (1) length
//    (2) width
//    (3) height
//  computes volume of block
//  computes surface area of block
//
//Instructions:
//  Compile Program:
//    javac Timer.java
//  Run Program:
//    java Timer
//  Input length
//  Input width
//  Input height

//import scanner class to read user inputs
import java.util.Scanner;

//define Timer class
public class Block{
    
    //define main method
    public static void main(String[] args){
        
        //declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for inputs and store input values
        System.out.print("Enter length: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter width: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter height: ");
        double height = myScanner.nextDouble();
        
        //check for invalid entries
        if (length <= 0 || width <= 0 || height <= 0) {
            System.out.println("Please enter positive, non-zero values for all inputs.  Thank you!");
            return;
        }
        
        //compute volume of block
        double volume = length * width * height;
        
        //compute block surface area
        double surfaceArea = 2 * (length * width) + 2 * (length * height) + 2 * (height * width);
        
        //print block volume and surface area
        System.out.println("- - -");
        System.out.println("The volume of a " + length + " x " + width + " x " + height + " block is " + volume + ".");
        System.out.println("The surface area of a " + length + " x " + width + " x " + height + " block is " + surfaceArea + ".");

    }
}