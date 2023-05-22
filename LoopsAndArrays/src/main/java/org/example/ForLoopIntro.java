package org.example;

import java.util.Arrays;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
        for (initialization ; condition ; incrementation) {
            do stuff
        }
         */

        int[] arr = {7, 5, 2, 8, 1, 3};

        for (int index = 0 ; index < arr.length ; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();

        //What if I want to find all the numbers less than 3
        for (int index = 0; index < arr.length; index++){
            if (arr[index] <= 3){
                System.out.print(arr[index] + " ");
            }
        }
        System.out.println();

        //I want to calculate an AVERAGE
            //average = the total of the numbers divided by the number of numbers

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i]; //sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average: " + Math.round(average * 100) / 100.0);


        //We want to count adjacent duplicates

        /*
            counting algorithm!
            int counter = 0;
            loop
                if (condition) -> determines what we count
                    counter++;
         */
        int[] doubles = {2, 2, 3, 4, 4, 5, 6, 7, 7};
        int counter = 0;
        for (int i = 0; i < doubles.length - 1; i++){
            int currDude = doubles[i];
            int neighbor = doubles[i + 1];
            if (currDude == neighbor){
                counter++;
            }
        }
        System.out.println("The number of adj. dups is : " + counter);

        //I want to make a NEW ARRAY that only contains numbers less than or equal to 3
        //{7, 5, 2, 8, 1, 3} -> {2, 1, 3}
            //to make a NEW ARRAY:
                //option 1: dataType[] arrName = {v1, v2, v3, etc};
                //option 2: dataType[] arrName = new dataType[size];
        //the size is dependent on HOW MANY are less than (or equal to) 3
            //HOW MANY -> counting


        //TO FILL UP AN ARRAY WITH SPECIFIC VALUES:
            //1. COUNT how many of the specific values you have
            //2. Make a new array of the appropriate size
            //3. Using TWO Indexes, populate your new array

        //FIND HOW MANY NUMBERS ARE LESS THAN 3
            //counting
        int countLess3 = 0;
        for (int i = 0; i < arr.length; i++){
            int currNumber = arr[i];
            if (currNumber <= 3){ //filter
                countLess3++;
            }
        }

        int[] smallNumbers = new int[countLess3]; //use count as the size for the new array

        //the second loop fills up the new array
        int smallIndex = 0;
        for (int i = 0; i < arr.length; i++){ //loop over the original AGAIN
            if (arr[i] <= 3){
                //we have to copy over the numbers
                //whereI'm going = what I have
                smallNumbers[smallIndex] = arr[i];
                smallIndex++;
            }
        }
        System.out.println(Arrays.toString(smallNumbers));











    } //ends the main method
} //ends the file/class
