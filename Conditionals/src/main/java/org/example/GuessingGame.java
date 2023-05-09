package org.example;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        /*
        Our goal: Create a guessing game
           1. generate the secret number
           2. Ask for their guess
           3. correct, too high, too low
           4. Repeat steps 2 and 3
         */
        boolean gotItRight = false;
        //we want a random number between [1, 10]
        int secretNumber = (int) (Math.random() * (10 - 1 + 1) + 1);
        //TODO: make this a random number
        //Math.random() -> double in the range [0, 1)
            //what if I want it on the range [a, b)
            //[10, 15)
            //Math.random() * (b - a) + a

            //for ints, on the ragne [a, b] inclusive
            //(int) (Math.random() * (b - a + 1) + a);
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10");

        int guess = Integer.parseInt(scan.nextLine());

        if (guess == secretNumber){
            System.out.println("Hooray! First Try! You got it right!");
            gotItRight = true;
        } else if (guess < secretNumber){
            System.out.println("Too low! Guess again");
        } else {
            System.out.println("Too high! Guess again");
        }

        //Guess # 2
        if (gotItRight == false){
            System.out.println("Guess a number between 1 and 10");
            guess = Integer.parseInt(scan.nextLine());
            if (guess == secretNumber){
                System.out.println("Nice. Second try- well done!");
                gotItRight = true;
            } else if (guess < secretNumber){
                System.out.println("Too low! Guess one more time");
            } else {
                System.out.println("Too high! Guess one more time");
            }
        }

        //Guess #3
        if (!gotItRight){
            System.out.println("Last chance! Guess a number between 1 and 10");
            guess = Integer.parseInt(scan.nextLine());
            if (guess == secretNumber){
                System.out.println("Cool! Third tries the charm");
            } else {
                System.out.println("womp womp. The secret number was " + secretNumber);
            }
        }

    } //ends main method
} //ends class file
