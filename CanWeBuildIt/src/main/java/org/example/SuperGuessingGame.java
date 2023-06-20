package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperGuessingGame {
    //GOAL: Write a guessing game that allows unlimited attempts
        //allows the user to quit if they say "quit"
        //collect their responses for analysis afterwards

    //generate a lucky number (randomly)
    //get their guess
    //test their guess (comparison to lucky)
    //repeat until correct (or they say quit)

    /*
        boolean keepGoing = true;
        while (keepGoing){
            enter your number
            grab that number (use scanner)
            if -> quit
                break; (a little tacky...)
                keepGoing = false;
            else -> test and save the number
        }
     */

    //methodIdeas:
        //getInput
            //prompt the user, use scanner to grab their answer, return it
        //generateLuckyNumber
            //return a random int
        //testGuess
            //would print "too low/too high/just right" and return a... boolean?

    public static boolean testGuess(int guess, int luckyNumber){
        if (guess == luckyNumber){
            System.out.println("You got it right!");
            return true;
        } else if (guess < luckyNumber) {
            System.out.println("You're too low!");
            return false;
        } else {
            System.out.println("Your guess is too high!");
            return false;
        }
    }

    public static String getInput(String prompt){
        //1, Make the scanner
        Scanner scan = new Scanner(System.in);
        //2. prompt the user
        System.out.println(prompt);
        //3. Retreive their response
        String response = scan.nextLine();
        return response;
    }

    public static int makeLuckyNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int lucky = makeLuckyNumber(1, 50);
        ArrayList<Integer> allTheGuesses = new ArrayList<Integer>();
        boolean keepGoing = true;
        while(keepGoing) {
            String response = getInput("Enter a number between 1 and 50");
            if (response.toLowerCase().equals("quit")) {
                keepGoing = false;
            } else {
                int guess = Integer.parseInt(response);
                allTheGuesses.add(guess);
                boolean result = testGuess(guess, lucky);
                if (result == true){
                    keepGoing = false;
                }
            }
        }
        System.out.println(allTheGuesses);
    }
}
