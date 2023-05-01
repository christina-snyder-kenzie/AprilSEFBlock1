package org.example;

public class IntroToVariables {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("| Christina |");
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("Snyder");
        System.out.println("I a\nm 31");

        System.out.println(31);
        System.out.println("31");

        System.out.println(31 + 5); //+ addition
        System.out.println("31" + 5); //+ concatenation
            //concatenation = glue together

        System.out.println(31 - 5);
        System.out.println(34 / 5); //truncation happens
            //Truncation means chopping off the decimal
            //No Rounding
        System.out.println(34.0 / 5);

        System.out.println(31 * 5);

        System.out.println(2023 - 1992);

        //Variables are a way for us to store or remember things in code
            //require data types

            //Primitive data types:
                //int - whole numbers (short for integer)
                //double - number with decimals
                    //float - also number with decimals
                //long, short, byte - also for numbers, but rarely used
                //boolean - used to represent yes / no (true / false)
                //char - used for a single letter
            //Object Data  Types:
                //String - for words and phrases
                //Scanner - use this for user input

        //Variable declaration looks like this: (in general)
            //dataType variableName = value;
        //syntax = grammar rules of code

        int birthYear = 1992;
        System.out.println("I was born in " + birthYear);
        int currentYear = 2023;
        System.out.println("It is currently " + currentYear);
        int myAge = currentYear - birthYear;
        System.out.println("I am " + myAge);

        double coffeeRating = 3.8;
        System.out.println("My coffee was a " + coffeeRating);

        char first = 'C';
        char middle = 'E';
        char last = 'S';
        System.out.println("First initial: " + first);
        System.out.println("Middle initial: " + middle);
        System.out.println("Last initial: " + last);

        boolean hasDogs = true;
        boolean hasCats = false;

        /*
        Variable Naming Rules (Requirements):
            1. must start with a letter
            2. Cannot be reserved words (the orange words)
            3. No Spaces
            4. AlphaNumeric (plus the underscore maybe also $)
                //Alpha = Letters
                //Numeric = Numbers

        Variable Naming Conventions (hard suggestions):
            1. Variables start with a lower case letter
            2. Descriptive
            3. camelCase (capitalize each word after the first)
                3b. You can use underscores for spaces
            numBeveragesDrankToday
            num_beverages_drank_today
         */


    }
}
