package org.example;

public class AdvancedIfs {
    public static void main(String[] args) {
        double temperature = 75;
        //80 or above, its HOT
        //60 - 80, its NICE
        //40 - 60, it's chilly
        //below 40 it's COLD

        if (temperature >= 80){
            System.out.println("It's HOT");
        } else if (temperature >= 60) {
            System.out.println("It's nice");
        } else if (temperature >= 40){
            System.out.println("Its chilly");
        } else {
            System.out.println("It's COLD");
        }

        temperature = 90;
        //sequential if statements
        if (temperature >= 80){
            System.out.println("It's HOT");
        }
        if (temperature >= 60 && temperature < 80){
            System.out.println("It's nice");
        }
        if (temperature >= 40 && temperature < 60){
            System.out.println("It's chilly");
        }
        if (temperature < 40){
            System.out.println("It's COLD");
        }


        int windSpeed = 2;
        if (windSpeed > 155){
            System.out.println("AHH CAT 5");
        } else if (windSpeed >= 131){
            System.out.println("Take cover! Cat 4");
        } else if (windSpeed >= 111){
            System.out.println("Hurricane party- cat 3");
        } else if (windSpeed >= 96){
            System.out.println("Cat 2- double fun");
        } else if (windSpeed >= 74){
            System.out.println("Cat 1- barely raining");
        } else {
            System.out.println("Not a hurricane...");
        }

        //positive and even
        //positive and odd
        //negative and even
        //negative and odd

        int number  = 7;
        if (number > 0 && number % 2 == 0){
            System.out.println("Positive and even");
        } else if (number > 0 && number % 2 == 1){
            System.out.println("Positive and odd");
        } else if (number < 0 && number % 2 == 0){
            System.out.println("Negative and even");
        } else if (number < 0 && number % 2 == -1){
            System.out.println("Negative and odd");
        }

        //nested if statement
        if (number > 0){
            System.out.print("Positive");
            if (number % 2 == 0){
                System.out.println(" and even");
            } else {
                System.out.println(" and odd");
            }
        } else if (number < 0){
            System.out.print("Negative");
            if (number % 2 == 0){
                System.out.println(" and even");
            } else {
                System.out.println(" and odd");
            }
        }

        /*
        if (isWeekend){
            if (we have the right number of cigars for weekend){
                return true;
            } else {
                return false;
            }
       } else if (we have the right number for weekdays) {
            return true;
       } else{
            return false;
       }
         */

        //how to compare strings with if statements:
        String food = "";

        if (food.equals("empanadas")){
            System.out.println("Sweet, that's my favorite");
        } else if (!food.equals("dairy")){
            System.out.println("Excellent, no dairy");
        }

        if (food == "empanadas"){
            System.out.println("Sweet, but that's a bad comparison");
        }


        //primitive types vs object types
        //primitive type variables actually store the data
            int x = 7;
        //object type variables store references to memory
            //addresses in memory
            String y = "hello";
            String z = new String("hello");

        //== compares what's IN THE VARIABLE

        boolean result = x == 7;
        boolean result2 = y == "hello";
        boolean result3 = z == "hello";
        

        System.out.println("result 2: " + result2);
        System.out.println("result 3: " + result3);


    } //ends main method
} //ends class
