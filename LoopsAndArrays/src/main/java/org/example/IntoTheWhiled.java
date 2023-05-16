package org.example;

public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        if (number < 10) {
            System.out.println("The number is: " + number);
        }

        System.out.println("-------------");
        while (number <= 10) { //continuously runs repeatedly until
            //the condition becomes false
            System.out.println("The number is: " + number);
            number = number + 1; // number += 1; //also number++;
        }

        /*
            Loops (Iteration)

            Initialization (the starting point)
            while (Condition is true){ (the stopping point)
                do stuff; (maybe print something, collect something, etc)
                Incrementation (move from starting to stopping)
            }
         */

        //let's write a loop that counts from 0 to 30 in steps of 3
        //(I want multiples of 3)
        //0 3 6 9 12 15 18 ... 30
        int numThrees = 0; //initialization
        while (numThrees <= 30) { // condition
            System.out.print(numThrees + " "); //do stuff
            numThrees = numThrees + 3; //incrementation
        }
        System.out.println();

        //Space Invaders!
        //Do a countdown to blastoff

        //Start at 10 and count down to 1
        //init
        //while (condition){
            //do something (probably print the number)
            //incrementation
        //}
        int timer = 10;
        System.out.println("~~Initializing countdown sequence~~");
        while (timer > 0){
            System.out.println(timer);
            timer = timer - 1;
        }
        System.out.println("BLASTOFF");

        //Can we print all the powers of 2 from 1 to 100
        // ^ nah
        // Math.pow(2, exponent)
        // 2 * 2 = 4, 4 * 2 = 8

        //1, 2, 4, 8, 16, 32, 64
        //0, 1, 2, 3,  4,  5,  6
        int powerOf2 = 1; //init
        while (powerOf2 < 100){ //condition
            System.out.print(powerOf2 + ", "); //do stuff
            powerOf2 = powerOf2 * 2; //incrementation
        }
        System.out.println();

        int exponent = 0;
        while (Math.pow(2, exponent) < 100){
            System.out.print((int) Math.pow(2, exponent) + ", ");
            exponent = exponent + 1;
        }
        System.out.println();

        //print out multiples of 5 starting at 100 and stopping at 5
            //100, 95, 90, ... 15, 10, 5
        //print out powers of 2 starting at 128 and doing down to 1
            //128, 64, 32, 16, 8, 4, 2, 1
            //HINT: 2 ^ 7 == 128
        //print out even numbers between 0 and 99
            //0, 2, 4, 6... 96, 98







    } //ends the main method
} //ends the file/class
