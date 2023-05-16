package org.example;

import java.util.Arrays;

public class LoopingOverArrays {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 1, 3, 8, 2, 0, 4};
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        //System.out.println(numbers[8]); OOB

        int spot = 0; //initialization
        while (spot < numbers.length){ //condition
            System.out.println(spot + ": " + numbers[spot]);
            spot = spot + 1; //incrementation / update
        }

        /*
        In general, how to loop over an array:
        int index = 0;
        while (index < arr.length){
            do something with arr[index];
            index = index + 1;
        }
         */

        //New problem: ONLY print out numbers less than 5
        System.out.println("NUMBERS LESS THAN FIVE BELOW:");
        int index = 0;
        while (index < numbers.length){
            int currentNumber = numbers[index];
            if (currentNumber < 5){
                System.out.println(currentNumber);
            } //ends the if statement
            index = index + 1;
        } // ends the while loop

        //Only print out odd numbers
        System.out.println("ODD NUMBERS BELOW:");
        int i = 0;
        while (i < numbers.length){
            int curr = numbers[i];
            if (curr % 2 != 0) {
                System.out.println(curr);
            }
            i += 1; //the exact same as: i = i + 1;
                //+= is called the compound assignment operator
                //But basically it adds and updates your variable
        } //ends my while loop

        //let's go backwards:
        //I want to print out my array starting on the right and moving left
        //starting point? length - 1 (that's the last index)
        //stopping point? include the zero

        int backwardsIndex = numbers.length - 1;
        while (backwardsIndex >= 0){
            System.out.print(numbers[backwardsIndex] + ", ");
            backwardsIndex -= 1; //backwardsIndex = backwardsIndex - 1;
        }
        System.out.println();

    } // ends main method
} // ends the class/file
