/*
Michael Russo
CSE002 - Lab 10

Average (array) Java Program:
  prompt user to enter number of values to be stored
  store random integers btw 0-100 in the array
  print all the values
  compute and print the sum of the values
  compute and print the average of the values
  print all values greater than the average

Instructions:
  Compile Program:
    javac Average.java
  Run Program:
    java Average
  Input number of random integers for the array
*/

// import Scanner
import java.util.Scanner;

// declare class
public class Average{
	// main method
	public static void main(String[] args){
		// declare scanner for user inputs
		Scanner inputScanner = new Scanner(System.in);
		
		// print program information and commands
		System.out.print("Input Number of Values: ");
		double n = inputScanner.nextDouble();
		
		// declare array to store n random integers
		int [] randomArray = new int[(int)n];
		
		// store random integers in array
		for (int i = 0; i < n; i++){
			randomArray[i] = (int)(Math.random()*100);
		}
		
		// print the array
		System.out.print("Array: [");
		for (int j = 0; j < n; j++){
			if (j == n-1){
				System.out.println(randomArray[j] + "]");
			}
			else{
				System.out.print(randomArray[j] + ",");
			}
		}
		
		// compute the sum
		int sum = 0;
		for (int k = 0; k < n; k++){
			sum += randomArray[k];
		}
		System.out.println("Sum: " + sum);
		
		// compute the average
		double average = (double) (sum / n);
		System.out.println("Average: " + average);
		
		// print values greater than the average
		System.out.print("Values above average: ");
		for (int l = 0; l < n; l++){
			if (randomArray[l] >= average){
				System.out.print(randomArray[l] + " ");
			}
		}
		System.out.println();
	}
}
