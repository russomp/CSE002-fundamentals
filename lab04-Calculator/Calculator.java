//Michael Russo
//Lab 04
//
//Calculator Java Program:
//  takes user inputs: 
//    (1) integer value, a
//    (2) integer value, b
//    (3) operator [+, -, *, /]
//  computes value of a+b, a-b, a*b, OR a/b based operator input
//
//Instructions:
//  Compile Program:
//    javac Calculator.java
//  Run Program:
//    java Calculator
//  Input integer value one
//  Input integer value two
//  Input operator value

//import scanner class to read user inputs
import java.util.Scanner;

//define Timer class
public class Calculator{
    
    //define main method of Timer class
    public static void main(String[] args){
        
        //declare scanner
        Scanner myScanner= new Scanner(System.in);
        
        //prompt user for inputs and store input values
        System.out.print("Enter integer, a: ");
        int myIntA= myScanner.nextInt();
        
        System.out.print("Enter integer, b: ");
        int myIntB= myScanner.nextInt();
        
        System.out.print("Enter operator [+, -, *, OR /]: ");
        String myOperator = myScanner.next();
        
        //declare variable total to store value of operation between a and b
        int total= 0;
        
        //create a switch statement to operate on a and b based on operator given
        switch(myOperator){
        case "+": total = myIntA + myIntB;
            System.out.println("a + b= " + total);
            break;
        case "-": total = myIntA - myIntB;
            System.out.println("a - b= " + total);
            break;
        case "*": total = myIntA * myIntB;
            System.out.println("a * b= " + total);
            break;
        case "/": total = myIntA / myIntB;
            System.out.println("a / b = " + total);
            break;
        default: 
            System.out.println("Invalid entry.");
        }
    }
}
