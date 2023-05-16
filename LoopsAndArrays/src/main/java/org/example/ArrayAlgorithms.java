package org.example;

import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        //Filling up an array
            //populating an array
        //GOAL: populate/fill an array with random numbers from 1 to 100
            //(int) (Math.random() * 100 + 1);

        int[] numbers = new int[10];
        int index = 0;
        while (index < numbers.length){
            numbers[index] = (int) (Math.random() * 100 + 1);
            index += 1;
        }
        System.out.println(Arrays.toString(numbers));

        //Summing (sum = adding)
        //Aggregation
        //Collection
        //Accumulation
        int basket = 0;
        int i = 0;
        while (i < numbers.length){
            int currNumber = numbers[i];
            basket = basket + currNumber; //basket += currNumber;
            i++; //i = i + 1 // i += 1
        }
        System.out.println(basket);

        //what if I only want to sum values greater than 50
        i = 0;
        basket = 0;
        while (i < numbers.length){
            int curr = numbers[i];
            if (curr > 50){
                basket += curr;
            }
            i++;
        }
        System.out.println(basket);

        //COUNTING!
        i = 0;
        int counter = 0;
        while (i < numbers.length){
            if (numbers[i] > 50){
                counter++; //counter += 1; // counter = counter + 1;
            }
            i++;
        }
        System.out.println(counter);

        //GOAL: find the biggest number (the MAXIMUM)
        int maximum = numbers[0];
        int indexForMax = 1;
        while (indexForMax < numbers.length){
            int curr = numbers[indexForMax];
            if (curr > maximum){
                maximum = curr;
            }
            indexForMax++;
        }
        System.out.println("MAX: " + maximum);

    }
}
