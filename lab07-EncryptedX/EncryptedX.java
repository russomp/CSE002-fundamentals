/*
Michael Russo
CSE002 - Lab 07

EncryptedX Java Program:
  prompt user to enter size of print square in range 0 - 100
  display encrypted message in print square

Instructions:
  Compile Program:
    javac EncryptedX.java
  Run Program:
    java EncryptedX
  Input size of pryamid
*/

//import scanner class to read user inputs
import java.util.Scanner;

//define EncryptedX class
public class EncryptedX{

    //define main method of EncryptedX class
    public static void main(String[] args){
    
        //declare scanner to store user input for pryamid size
        Scanner myScanner = new Scanner(System.in);

        //print welcome message for user and store pryamid size
        System.out.println("--- Welcome to Encrypted X ---");
        System.out.print("Enter the display size (0-100):  ");
        int displaySize = myScanner.nextInt();

        // check for valid input in range 0 to 100
        if (displaySize < 0 || displaySize > 100){
            System.out.println(">>> Error: input out of range.");
            System.exit(-1);
        } 

        // print each line star by star inserting spaces when neccessary
        String print_char = "*";
        for (int i = 1; i <= displaySize; i++){
            for (int j = 1; j <= displaySize; j++){
                // set print character to space
                if (j == i || j == (displaySize + 1) - i){
                    print_char = " ";
                }
                else{
                    print_char = "*";
                }
                System.out.print(print_char);
            }
            // start new line
            System.out.println("");
        }
    }
}

