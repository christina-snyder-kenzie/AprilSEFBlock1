package org.example;

public class IfStatementIntro {
    public static void main(String[] args) {
        //if statements
            //conditional statements
        //is how we make decisions in our code

        //I want to know if a number is positive or negative

        /*
            if statement syntax

            if (boolean condition) {
                do stuff
            } else if (boolean condition 2) {
                do stuff if boolean 2 is true
            } else {
                do stuff if that condition is false
                    like a backup/default
            }
            //continue with other code
         */

        int number = -506;

        if (Math.abs(number) > 100){
            System.out.println("number is a BIG NUMBER");
        } else if (number > 0) {
            System.out.println("number is POSITIVE");
        }  else if (number == 0){
            System.out.println("number is ZERO");
        } else {
            System.out.println("number is NEGATIVE");
        }

        System.out.println("End of if statement");


        //TASK: Determine if a number is even or odd
            //even means divisble by 2
                //after i divide by 2, there is no remainder

        //even numbers -> % 2 (what result do I want for even?) 0
        //odd numbers -> %2 is 1

        int toTest = 7;
        if (toTest % 2 == 1){
            System.out.println("The number is ODD");
        } else if (toTest % 2 == 0){ //this could also just be a plain else
            System.out.println("The number is EVEN");
        }


        double temperature = 83;
        boolean isRaining = true;
        boolean isWindy = true;

        //should I wear a jacket?
            //if it's cold or it's raining
                //i should wear a jacket
        if (temperature < 60){
            System.out.println("I should wear a jacket");
        } else if (isRaining == true){
            System.out.println("I should wear a jacket");
        }

        //combining boolean operations
            // and (&&) requires that both conditions are true
            // or (||) requires that at least ONE condition is true
        temperature = 95;
        isRaining = false;
        isWindy = false;

        if (temperature < 60 || isRaining == true){
            System.out.println("I should wear a jacket");
        } else if (temperature > 60 && isWindy == true){
            System.out.println("I need a windbreaker");
        } else {
            System.out.println("Wear a tshirt");
        }



    } //ends the main method

} //ends the class
