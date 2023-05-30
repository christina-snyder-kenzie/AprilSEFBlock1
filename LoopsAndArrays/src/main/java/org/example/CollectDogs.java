package org.example;

import java.util.Arrays;

public class CollectDogs {
    public static void main(String[] args) {

        //I want to collect only CERTAIN dogs
            //Specifically, ones that start the letter 'p'
                //pitbull, pug, pomeranian

            //Words that start with a letter ('p')?
                //access position zero
                    //.substring(0, 1)
                //see if that's the right letter
                    //if statement
                        //if (firstLetter.equals("p"))

        //count how many we need
        //make a new array
            //new arrays either need:
                //all the data (X)
                //or the size
        //fill up the new array
            //two diff sizes -> two diff indexes!

        String[] dogs = {"dachsund", "yorkie", "pitbull", "lab", "pug", "mastiff", "pomeranian"};
        //init
        int counter = 0;
        //loop
        for (int i = 0; i < dogs.length; i++) {
            String puppy = dogs[i];
            String firstLetter = puppy.substring(0, 1);
            //if statement (first letter is p)
            if (firstLetter.equals("p")) {
                //increment
                counter++; //counter = counter + 1;
            }
        }
        String[] pumpedDogs = new String[counter];
        int puppyIndex = 0;
        for (int i = 0; i < dogs.length; i++){
            //if (dogs[i].substring(0, 1).equals("p")){
            if (dogs[i].indexOf("p") == 0){
                pumpedDogs[puppyIndex] = dogs[i];
                puppyIndex++;
            }
        }
        System.out.println("Pumped Dogs: " + Arrays.toString(pumpedDogs));



    } //ends the main method
}//ends the class
