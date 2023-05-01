package org.example;

import java.sql.SQLOutput;

public class ChangeCalculator {
    public static void main(String[] args) {
        //GOAL: Given a total and an amount tendered,
            //calculate the change needed
                //20s, 10s, 5s, 1s, quarters, dimes, nickels, pennies

        double total = 41.67;
        System.out.println("Total: " + total);
        double amountTendered = 100;
        System.out.println("Amount Tendered: " + amountTendered);

        double change = amountTendered - total;
        System.out.println("Change needed: " + change);

        //Change my datatype from double to int
            //I do this with a cast

        //(int) variable -> forces truncation and converts to an int
        int num20s = (int) change / 20;
        System.out.println("Num 20s: " + num20s);

        change = change % 20;
     //   System.out.println("Change remaining: " + change);

        int num10s = (int) change / 10;
        System.out.println("Num 10s: " + num10s);

        change = change % 10;
      //  System.out.println("Change remaining: " + change);

        int num5s = (int) change / 5;
        System.out.println("Num 5s: " + num5s);

        change = change % 5;
       // System.out.println("Change remaining: " + change);

        int num1s = (int) change;
        System.out.println("Num 1s: " + num1s);

        change = change - num1s;
       // System.out.println("Change remaining: " + change);

        change = change * 100;
        //System.out.println("Change remaining: " + change);

        change = Math.round(change);
        //System.out.println("Change remaining: " + change);

        int numQuarters = (int) change / 25;
        System.out.println("Num Qs: " + numQuarters);

        change = change % 25;
        //System.out.println("Change remaining: " + change);

        int numDimes = (int) change / 10;
        System.out.println("Num Ds: " + numDimes);

        change = change % 10;

        int numNickels = (int) change / 5;
        System.out.println("Num Ns: " + numNickels);

        change = change % 5;
        int numPennies = (int) Math.round(change);
        System.out.println("Num Ps: " + numPennies);

        //IF CHANGE WAS STILL A DECIMAL:
            //int numQuarters = (int) (change / .25);



    }
}
