//Michael Russo
//Homework 02
//
//Arithmetic Java Program:
//  given a set of items and respective costs
//  computes total cost per item before and after tax
//  computes toatl cost for all items before and after tax
//
//Instructions:
//  Compile Program:
//    javac Arithmetic.java
//  Run Program:
//    java Arithmetic
//

//define class
public class Arithmetic{
    
    //define main method
    public static void main(String[] args){
        
        //define inputs
        int sockNum = 3;
        double sockCost = 2.58;
        
        int glassesNum = 6;
        double glassesCost = 2.29;
        
        int envelopeNum = 1;
        double envelopeCost = 3.25;
        
        double salesTax = 0.06;
        
        //declare and compute totals before tax
        double sockTotal = sockNum * sockCost;
        double glassesTotal = glassesNum * glassesCost;
        double envelopeTotal = envelopeNum * envelopeCost;
        double totalCost = sockTotal + glassesTotal + envelopeCost;
        
        //declare and compute totals after tax
        double sockTotalTax = sockTotal * (1 + salesTax);
        double glassesTotalTax = glassesTotal * (1 + salesTax);
        double envelopeTotalTax = envelopeTotal * (1 + salesTax);
        double totalCostTax = sockTotalTax + glassesTotalTax + envelopeTotalTax;
        
        //print out totals before tax
        System.out.printf("\nTotal cost of socks before tax: $%.2f\n", sockTotal);
        System.out.printf("Total cost of glasses before tax: $%.2f\n", glassesTotal);
        System.out.printf("Total cost of envelopes before tax: $%.2f\n", envelopeTotal);
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("Total cost before tax: $%.2f\n\n", totalCost);
        
        //print out totals after tax
        System.out.printf("Total cost of socks after tax: $%.2f\n", sockTotalTax);
        System.out.printf("Total cost of glasses after tax: $%.2f\n", glassesTotalTax);
        System.out.printf("Total cost of envelopes after tax: $%.2f\n", envelopeTotalTax);
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("Total cost after tax: $%.2f\n\n", totalCostTax);
        
    }
}