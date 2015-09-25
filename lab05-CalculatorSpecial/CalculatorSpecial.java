//Michael Russo
//Lab 05
//
//Calculator Java Program:
//  takes user inputs: 
//    (1) integer value, a
//    (2) integer value, b
//    (3) operator [+, -, *, /]
//  computes value of a+b, a-b, a*b, OR a/b based operator input
//  repeats this process until user inputs 'n' or 'N'
//
//Instructions:
//  Compile Program:
//    javac Calculator.java
//  Run Program:
//    java Calculator
//  Input integer value one
//  Input integer value two
//  Input operator value
//  Input 'n' or 'N' when done using calculator

//import scanner class to read user inputs
import java.util.Scanner;

//define Timer class
public class CalculatorSpecial{
    
    //define main method of Timer class
    public static void main(String[] args){
        
        //declare scanner to store user inputs
        Scanner myScanner = new Scanner(System.in);
        
        //declare input variables
        int myIntA = 0;
        int myIntB = 0;
        int myIntC = 0;
        double total= 0;
        
        //print termination message
        System.out.println("***Enter 'n' or 'N' at any point to terminate calculator app***");
        
        //repeat calculations until user enters 'n' or 'N'
        while(true){
        
            //declare loop condition
            boolean badInput = true;
            
            //get proper input for 'a' or terminate
            do{
                //prompt user for inputs and store input values as type 'String'
                System.out.print("Enter integer, a: ");
                String myStringA = myScanner.next();
                
                //check for termination condition
                if (myStringA.equals("n") || myStringA.equals("N")){
                    System.out.println("...\nCALCULATOR TERMINATED");
                    return;
                }
                else{
                    //convert 'myStringA' to type 'Int' and check for exceptions 
                    try{
                        myIntA = Integer.parseInt(myStringA);
                        badInput = false;
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error. Please enter an integer to proceed or enter 'n'/'N' to terminate.");
                    }
                }
            } while(badInput);
            
            //declare loop condition
            badInput = true;
            
            //get proper input for b or terminate
            do{
                //prompt user for inputs and store input values as type 'String'
                System.out.print("Enter integer, b: ");
                String myStringB = myScanner.next();
                
                //check for termination condition
                if (myStringB.equals("n") || myStringB.equals("N")){
                    System.out.println("...\nCALCULATOR TERMINATED");
                    return;
                }
                else{
                    //convert 'myStringB' to type 'Int' and check for exceptions 
                    try{
                        myIntB = Integer.parseInt(myStringB);
                        badInput = false;
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error. Please enter an integer to proceed or enter 'n'/'N' to terminate.");
                    }
                }
            } while(badInput);
    
            
            //prompt user for operator
            System.out.print("Enter operator [+, -, *, OR /]: ");
            String myOperator = myScanner.next();
                
            //check for termination condition
            if (myOperator.equals("n") || myOperator.equals("N")){
                System.out.println("...\nCALCULATOR TERMINATED");
                return;
            }
            else{
                
                //declare loop condition
                boolean badOperator = true;
                
                //repeat until valid operator is given
                while(badOperator == true){
                    
                    //create a switch statement to operate on a and b based on operator input
                    switch(myOperator){
                    case "+": total = myIntA + myIntB;
                        System.out.println("a + b = " + total);
                        badOperator = false;
                        break;
                    case "-": total = myIntA - myIntB;
                        System.out.println("a - b = " + total);
                        badOperator = false;
                        break;
                    case "*": total = myIntA * myIntB;
                        System.out.println("a * b = " + total);
                        badOperator = false;
                        break;
                    case "/": total = myIntA / (double)myIntB;
                        System.out.println("a / b = " + total);
                        badOperator = false;
                        break;
                    default:
                        //ask for valid operator and enter a new operator
                        System.out.println("Please enter valid operator [+, -, *, OR /]: ");
                        System.out.print("Enter operator [+, -, *, OR /]: ");
                        myOperator = myScanner.next();
                    }
                }
            }
        }
    }
}
