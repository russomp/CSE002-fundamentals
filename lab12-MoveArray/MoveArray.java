/*
Michael Russo
CSE002 - Lab 12

Sort Array Java Program:
  Given an array and index, move the value at the given
  index 

Instructions:
  Compile Program:
    javac MoveArray.java
  Run Program:
    java MoveArray
*/

// import Scanner
import java.util.Scanner;

// declare class
public class MoveArray{

	// print array as string
	public static void printArray(int[] array){
		System.out.print("[");
		for (int j = 0; j < array.length; j++){
			if (j == array.length-1){
				System.out.println(array[j] + "]");
			}
			else{
				System.out.print(array[j] + ",");
			}
		}
	}

	// main method
	public static void main(String[] args){
		
		// declare scanner to take user inpus
		Scanner scanner = new Scanner(System.in);

		// prompt user to input array size
		System.out.print("Enter array size: ");
		int arraySize = scanner.nextInt();

		// declare array to store random integers
		int[] array = new int[arraySize]; 
		
		// store random integers in the array
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}

		// print original array
		printArray(array);

		// initialize loop condition
		boolean badInput = true;
		int index=0;
		// prompt user to input valid index to be shifted 
		while (badInput){
			System.out.print("Enter index to be moved: ");
			index = scanner.nextInt();
			try{
				int value = array[index];
				badInput = false;
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("Error: Index out of range");
			}
		}

		// move index value to back of array
		for (int j = index; j < array.length - 1; j++){
			int tmp = array[j];
			array[j] = array[j+1];
			array[j+1] = tmp;
		}

		// print updated array
		printArray(array);
		
	}
}
