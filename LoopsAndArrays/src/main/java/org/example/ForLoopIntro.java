package org.example;

import java.util.Arrays;

public class ForLoopIntro {

    //you can also put methods here

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



        //Collect any number that has an 8
            //0. How do I know if a number has an 8?
            //1. Count any number that has an 8
            //2. Make an array of that size
            //3. Fill that array with numbers that have an 8

        /*
            How to know if a number has an 8:

            boolean = true/false

            start with a lowered flag
            loop over the number ** (how? IDK)
                if (the current digit is an 8)
                    raise the flag


            5824

            5824 % 10 -> 4
            5824 / 10 -> 582

            582 % 10 -> 2
            582 / 10 -> 58

            58 % 10 -> 8
            58 / 10 -> 5

            5 % 10 -> 5
            5 / 10 -> 0

            mod 10 divide 10 rule

         */

        int number = 5824;
        boolean flag = false;
        while (number > 0){
            int digit = number % 10;
            if (digit == 8){
                flag = true;
            }
            number = number / 10;
        }

        System.out.println("Number has an 8: " + flag);

        int[] maybe8s = {12, 385, 888, 99, 803};
        //GOAL: to have an array with only numbers with 8's
            //{385, 888, 803}

        int count8s = 0;
        for (int i = 0; i < maybe8s.length; i++){
            int currNumber = maybe8s[i];
            boolean has8 = false;
            while (currNumber > 0){
                int currDigit = currNumber % 10;
                if (currDigit == 8){
                    has8 = true;
                }
                currNumber = currNumber / 10;
            }
            if (has8){
                count8s++;
            }
        }
        System.out.println("The number of numbers with 8s: " + count8s);

        int count8sAgain = 0;
        for (int i = 0; i < maybe8s.length; i++){
            int currNumber = maybe8s[i];
            if (numberHas8(currNumber)){
                count8sAgain++;
            }
        }
        System.out.println("The number of numbers with 8s: " + count8sAgain);

        int[] only8s = new int[count8s];
        //in general: dataType[] name = new dataType[size];


        //whereI'm going = what I have
        //only8s[position] = maybe8s[i];

        //1
        int spot = 0;
        for (int i = 0; i < maybe8s.length; i++){
            //2
            int currNumber = maybe8s[i];
            if (numberHas8(currNumber)){
                //3
                only8s[spot] = currNumber;
                //4
                spot++;
            }
            //5
        }
        //6
        System.out.println(Arrays.toString(only8s));

    } //ends the main method
    public static boolean numberHas8(int number){
        boolean has8 = false;
        while (number > 0){
            int currDigit = number % 10;
            if (currDigit == 8){
                has8 = true;
            }
            number = number / 10;
        }
        return has8;
    }

} //ends the file/class
