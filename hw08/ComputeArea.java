/*
Michael Russo
CSE002 - Homework 08

Compute Area Java Program:
  prompt user to enter a shape
  prompt user to input shape dimensions
  compute area of specified shape

Instructions:
  Compile Program:
    javac ComputeArea.java
  Run Program:
    java ComputeArea
  Input shape type
  Input shape dimensions
  Enter '0' to terminate program
*/

// import Scanner
import java.util.Scanner;

// declare class
public class ComputeArea{
	// method for computing area of a circle
	public static double area(int radius){
		// compute area
		double areaCircle = Math.PI * Math.pow(radius, 2);
		return areaCircle;
	}
	// method for computing area of a rectangle
	public static double area(int length, int width){
		// compute area
		double areaRect = length * width;
		return areaRect;
	}
	// method for computing area of a trapezoid
	public static double area(int height, int base1, int base2){
		// compute area
		double areaTrap = 0.5 * height * (base1 + base2);
		return areaTrap;
	}
	// main method
	public static void main(String[] args){
		// declare scanner for user inputs
		Scanner inputScanner = new Scanner(System.in);
		// print program information and commands
		System.out.println("*** Compute Area Program ***");
		System.out.println("- Command List -");
		System.out.println("0 - terminate program");
		System.out.println("1 - compute CIRCLE area");
		System.out.println("2 - compute RECTANGLE area");
		System.out.println("3 - compute TRAPEZOID area");
		
		int startCommand = 0;

		do {
			// prompt user to enter shape type or terminate program
			System.out.print("Enter a command: ");
			// declare scanner and take user input
			startCommand = inputScanner.nextInt();

			if (startCommand == 0){
				System.out.println("<END>");
			}
			else if (startCommand == 1){
				// prompt user for shape dimensions
				System.out.print("Enter radius: ");
			    int inputRadius = inputScanner.nextInt();
			    System.out.println(">>> Circle: Area = " + area(inputRadius));
			}
			else if (startCommand == 2){
				// prompt user for shape dimensions
				System.out.print("Enter length: ");
			    int inputLength = inputScanner.nextInt();
			    System.out.print("Enter width: ");
			    int inputWidth = inputScanner.nextInt();
			    System.out.println(">>> Rectangle: Area = " + area(inputLength, inputWidth));
			}
			else if (startCommand == 3){
				// prompt user for shape dimensions
				System.out.print("Enter height: ");
			    int inputHeight = inputScanner.nextInt();
			    System.out.print("Enter base1: ");
			    int inputBase1 = inputScanner.nextInt();
			    System.out.print("Enter base2: ");
			    int inputBase2 = inputScanner.nextInt();
			    System.out.println(">>> Trapezoid: Area = " + area(inputHeight, inputBase1, inputBase2));
			}
			else{
				// handle invalid command
				System.out.println(">>> Invalid Command. Please enter a command from the list below.");
				System.out.println("0 - terminate program");
				System.out.println("1 - compute CIRCLE area");
				System.out.println("2 - compute RECTANGLE area");
				System.out.println("3 - compute TRAPEZOID area");
			}
		} while (startCommand != 0);
	}
}
