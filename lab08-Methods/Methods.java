/*
Michael Russo
CSE002 - Lab 08

Methods Java Program:
  three methods:
  (1) method for computing the mean of set of values
  (2) method for computing the median of a set of values
  (3) method for displaying the mean and median of set
  main method calls each method listed above

Instructions:
  Compile Program:
    javac Methods.java
  Run Program:
    java Methods
  Input ten values
*/

// import scanner class to read user inputs
import java.util.Scanner;

// import array class to sort array
import java.util.Arrays;

//define Methods class
public class Methods{

    // declare mean method and compute mean using input array
    public double mean(double num_array[]){
        double total = 0;
        // compute total
        for (int i = 0; i < 10; i++){
            total += num_array[i];
        }
        // compute and return mean
        return total/num_array.length;
    }

    public double median(double num_array[]){
        // declare and compute median
        double median = (num_array[num_array.length/2] + num_array[num_array.length/2 - 1]) / 2;
        // return median
        return median;

    }

    public void displayMeanAndMedian(double mean, double median){
        System.out.println(mean);
        System.out.println(median);
    }

    // declare main method of Methods class
    public static void main(String[] args){
    
        //declare scanner to store user input for pryamid size
        Scanner myScanner = new Scanner(System.in);

        //print welcome message for user and store pryamid size
        System.out.print("Input 10 numbers: ");
        
        // initialize array for storing input values
        double num_array[] = new double[10];

        // collect input values
        for (int i = 0; i < 10; i++){
            num_array[i] = myScanner.nextDouble();
        }

        Arrays.sort(num_array);

        Methods method = new Methods();

        double mean = method.mean(num_array);
        double median = method.median(num_array);
        method.displayMeanAndMedian(mean, median);
    }
}

