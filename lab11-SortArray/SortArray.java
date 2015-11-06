/*
Michael Russo
CSE002 - Lab 11

Sort Array Java Program:
  populates an array of length 20 with random ints (1-100)
  populates an array of length 10 with random ints (1-100)
  sorts both arrays using selection sorting algorithm
  uses merge sort to combine the sorted arrays
  prints all arrays

Instructions:
  Compile Program:
    javac SortArray.java
  Run Program:
    java SortArray
*/

// import Scanner
import java.util.Scanner;

// declare class
public class SortArray{
	
	// sorting method using selection sort algorithm
	public static int[] selectionSort(int[] array){
		int temp, minIndex;
		for (int i = 0; i < array.length; i++){
			minIndex = i;
			for (int j = i + 1; j < array.length; j++){
				if (array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;
	}

	// sorting method using a variation of the merge sort algorithm
	public static int[] mergeSort(int[] array1, int[] array2){
		int[] targetArray = new int[array1.length + array2.length];
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < targetArray.length; i++) {
			if (index1 == array1.length){
				targetArray[i] = array2[index2];
				index2++;
			}
			else if (index2 == array2.length){
				targetArray[i] = array1[index1];
				index1++;
			}
			else if (array1[index1] <= array2[index2]){
				targetArray[i] = array1[index1];
				index1++;
			}
			else {
				targetArray[i] = array2[index2];
				index2++;
			}
		}
		return targetArray;	
	}

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
		
		// declare array to store n random integers
		int[] array1 = new int[20];
		int[] array2 = new int[10]; 
		
		// store 20 random integers in array1
		for (int i = 0; i < array1.length; i++){
			array1[i] = (int)(Math.random()*100);
		}

		// store 10 random integers in array2
		for (int j = 0; j < array2.length; j++){
			array2[j] = (int)(Math.random()*100);
		}

		// sort both arrays
		array1 = selectionSort(array1);
		array2 = selectionSort(array2);
		int[] mergedArray = mergeSort(array1, array2);
		
		// print sorted arrays
		printArray(array1);
		printArray(array2);
		printArray(mergedArray);
		
	}
}
