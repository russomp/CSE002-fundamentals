//Michael Russo
//Lab 02
//Cyclometer Java Program:
//  given time elapsed and number of front tire rotations
//  compute the time and distance of two trips
//
//Instructions:
//  first compile the program
//    javac HelloWorld.java
//  run the program
//    java HelloWorld

// define a class
public class Cyclometer{
    
    //add main method
    public static void main(String[] args) {
        
        //define inputs
        double wheelDiam = 27.0; //inch
        int tripTime1 = 480; //sec
        int tripTime2 = 3220; //sec
        int numRot1 = 1561; //
        int numRot2 = 9037; //
        
        //define and calculate output variables
        double distTrip1 = ((wheelDiam * 3.14159) * numRot1) / (12 * 5280); //mi
        double distTrip2 = ((wheelDiam * 3.14159) * numRot2) / (12 * 5280); //mi
        double distTotal = distTrip1 + distTrip2; //mi
        
        //print input and output variables
        System.out.println("Trip 1 took " + tripTime1/60 + " minutes and had " + numRot1 + " counts.");
        System.out.println("Trip 2 took " + tripTime2/60 + " minutes and had " + numRot2 + " counts.");
        System.out.println("Trip 1 was " + distTrip1 + " miles.");
        System.out.println("Trip 2 was " + distTrip2 + " miles.");
        System.out.println("The total distance was " + distTotal + " miles.");
        
    } //end of main method
    
} //end of class
    