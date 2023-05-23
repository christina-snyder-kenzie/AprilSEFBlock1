package org.example;

public class ForEachLoops {
    public static void main(String[] args) {
        //we have used arrays and for loops a lot

        int[] numbers = {7, 5, 1, 3, 8, 2};

        for (int i = 0; i < numbers.length; i++){
            int currentElement = numbers[i];

            //do something with the currentElement
                //maybe print it
                //maybe test it in an if
                //whatever
        }

        //the for each loop (also known as the enhanced for loop)

        //for (dataType currentElement : arrName){
            //do something with currentElement (print, test, etc)
        //}

        //Can we print out an array with a for each loop?
        for (int currentElement : numbers){
            System.out.println(currentElement);
        }

        //for each loops give you access to data points one after the other
            //automatically from start to finish

        //can I sum all the values in an array with a for each loop?

        int basket = 0;
        for (int curr : numbers){
            basket += curr;
        }
        System.out.println("The total is: " + basket);

        int product = 1;
        for (int curr : numbers){
            product *= curr;
        }
        System.out.println("The product is: " + product);

        //can we find the smallest number?
        int min = numbers[0];
        for (int current : numbers){
            if (current < min){
                min = current;
            }
        }
        System.out.println("The smallest is: " + min);

        String[] names = {"Christina", "Michael", "Kelly"};
        // I want total numbers of letters
        int numLetters = 0;
        for (String currName : names){
            numLetters += currName.length();
        }
        System.out.println("Total num letters: " + numLetters);




    } //ends main method
} //ends class/file
