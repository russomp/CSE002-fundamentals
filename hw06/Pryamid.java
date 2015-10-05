/*
Michael Russo
CSE002 - Homework 06

Pryamid Java Program:
  prompt user to enter size of pryamid
  display pryamid based on input size

Instructions:
  Compile Program:
    javac Pryamid.java
  Run Program:
    java Pryamid
  Input size of pryamid
*/

//import scanner class to read user inputs
import java.util.Scanner;

//define Pryamid class
public class Pryamid{
    
    //define main method of Pryamid class
    public static void main(String[] args){
        
        //declare scanner to store user input for pryamid size
        Scanner myScanner = new Scanner(System.in);
        
        //print welcome message for user and store pryamid size
        System.out.println("*** Welcome to Pyramid ***");
        System.out.print("Enter pryamid size to begin:  ");
        int pryamidSize = myScanner.nextInt();

        //store '*' and ' ' for printing pryamid levels
        String stars = "*";
        String spaces = "";

        //create the last line of the pryamid and a string of spaces of same length
        int sizeOfLastLevel = (2 * pryamidSize) - 1;
        for (int i = 1; i < sizeOfLastLevel; i+=1){
        	stars += "*";
        	if (i % 2 == 0){
        		spaces += " ";
        	}	
        }

        //display pryamid level by level
        int numStars = 1;
        int numSpaces = spaces.length();
        for (int j = 1; j <= pryamidSize; j+=1){
            System.out.println(spaces.substring(0,numSpaces) + stars.substring(0,numStars));
   			numStars += 2;
            numSpaces -= 1;
        }
    }
}

