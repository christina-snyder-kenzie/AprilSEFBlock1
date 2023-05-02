package org.example;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("What is your favorite food?");

        String favFood = scan.nextLine();

        System.out.println("Yum! I love " + favFood + " too!!");

        //TASK:
            //Ask for favorite movie
            //Receive the response
            //Print out a message like <movie> rocks!!

        System.out.println("What is your favorite Movie?");
        String favoriteMovie = scan.nextLine();
        System.out.println("Woot. " + favoriteMovie + " rocks!!");

        //TASK: Calculate how many siblings you have
            //based on how many brothers and sisters you have (you can also niblings)
        System.out.println("How many brothers do you have?");
        String brothers = scan.nextLine();
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();

        //Difference: between "2" and 2
        int numberBrothers = Integer.valueOf(brothers); //Integer.parseInt(brothers);
        int numberSisters = Integer.parseInt(sisters);

        System.out.println("You have " + (numberBrothers + numberSisters) + " siblings");

        //TASK: Find how many pets you have
            //Ask for number of dogs
        System.out.println("How many dogs do you have?");
        String dogs = scan.nextLine();
            //Ask for number of cats
        System.out.println("How many cats do you have?");
        String cats = scan.nextLine();
            //Ask for number of fish/birds?
        System.out.println("How many other pets do you have?");
        String other = scan.nextLine();

        //Grab responses
        //Convert to numbers
        int pets = Integer.valueOf(dogs) + Integer.parseInt(cats) + Integer.parseInt(other);
        //Calculate number of pets
        System.out.println("WOW, you have " + pets + " pets!");


    }

}
