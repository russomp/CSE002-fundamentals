//Michael Russo
//Lab 09
//
//CoinFlipping Java Program:
//  computes outcome of random coin flip
//  simulates repeated coin flip based on user input
//  tallies number of heads and number of tails
//
//Instructions:
//  Compile Program:
//    javac CoinFlipping.java
//  Run Program:
//    java CoinFlipping
//  Input integer value for number of flips desired


//import scanner class to read user inputs
import java.util.Scanner;

//define Timer class
public class CoinFlipping{
    
    //method to simulate single coin flip
    public static String flip(){
        String coinStatus;
        int flipOutcome = (int) Math.round(Math.random());
        if (flipOutcome == 0){
            coinStatus = "heads";
        }
        else{
            coinStatus = "tails";
        }
        return coinStatus;
    }
    
    
    //method to repeat "flip" method based on user input
    public static String flip(int n){
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < n; i++){
            if (flip().equals("heads")){
                headCount += 1;
            }
            else{
                tailCount += 1;
            }
        }
        return Integer.toString(headCount) + " " + Integer.toString(tailCount);
    }
    
    //define main method of Timer class
    public static void main(String[] args){
        //declare scanner to store user inputs
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user to input number of flips
        System.out.print("Input number of flips: ");
        int numFlips = myScanner.nextInt();
        System.out.println(flip(numFlips));
    }
}
        