package org.example;

import java.util.Arrays;

public class ApplicationWithMethods {

    // Write all of your code between the two curly braces
    // Only use data structures, types, and control flow we have learned in class. This includes -
    //  - primitive arrays
    //  - primitive data types
    //  - for loops
    //  - while loops
    //  - if/else blocks

    //Write a method that finds the smallest number in an array
    public static int findSmallest(int[] arr){
        int smallest = arr[0];
        int i = 1;
        while (i < arr.length){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            i++;
        }
        return smallest;
    }

    //2, 7, 12, 18
    //This method finds the largest number in an array
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for (int number : arr){
            if (number > largest){
                largest = number;
                //return largest; WRONG PLACE
            }
        }
        return largest;
    }

    //find the sum of an array in a method
    public static int findSum(int[] thingies){
        int cart = 0;
        for (int item : thingies){
            cart += item;
        }
        return cart;
    }

    //find the average
    //average is a double!
    public static double findAverage(int[] stuff){
        int sum = findSum(stuff);
        double average = ((double) sum) / stuff.length;
        return average;
    }

    //Let's code a method that returns all numbers divisible by a given number

    //inputs:
        //an array
        //the number to test with (the divisor)

    //the work:
        //count
        //make that new array
        //fill it up

    //outputs
        //an array with only those divisible numbers
    public static int[] collectDivisible(int[] numbers, int divisor, boolean IWantDivis){
        int counter = 0;
        for (int num : numbers){
            if (IWantDivis && num % divisor == 0){ //divisibility check
                counter++;
            } else if (IWantDivis == false && num % divisor != 0){
                counter++;
            }
        }
        int[] onlyDiv = new int[counter];
        int specialIndex = 0;
        for (int num : numbers){
            if (IWantDivis && num % divisor == 0){
                onlyDiv[specialIndex++] = num;
            } else if ( !IWantDivis  && num % divisor != 0){
                onlyDiv[specialIndex++] = num;
            }
        }
        return onlyDiv;
    }


    public static void arrayAnalyzer(int[] numbers) { // This curly brace
        System.out.println("****Array Analyzer Program****");

        /*
        The largest number in the array
        The smallest number in the array
        The sum of all the numbers in the array
        The average value of all the numbers in the array (the sum of all values divided by the number of values). Hint: This should be a double
        A new array containing all even numbers in the array
        A new array containing all numbers divisible by 8 in the array
        A new array containing all odd numbers in the array
         */

        System.out.println("Largest Number: " + findLargest(numbers));
        System.out.println("Smallest Number: " + findSmallest(numbers));
        System.out.println("Sum: " + findSum(numbers));
        System.out.println("Average: " + findAverage(numbers));
        int[] evens = collectDivisible(numbers, 2, true);
        int[] eights = collectDivisible(numbers, 8, true);
        int[] odds = collectDivisible(numbers, 2, false);
        System.out.println("Even Numbers: " + Arrays.toString(evens));
        System.out.println("Odd Numbers: " + Arrays.toString(odds));
        System.out.println("Numbers divisible by 8: " + Arrays.toString(eights));

        /*
        Largest Number: XYZ
        Smallest Number: XYZ
        Sum: XYZ
        Average: XYZ.XYZ
        Even Numbers: [XYZ, XYZ, XYZ, etc]
        Odd Numbers: [XYZ, XYZ, XYZ, etc]
        Numbers divisible by 8: [XYZ, XYZ, XYZ]
         */

    } // This curly brace

    public static void main(String[] args) {
        int[] data = new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 };

        arrayAnalyzer(data);

    }
}