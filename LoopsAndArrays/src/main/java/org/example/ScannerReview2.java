package org.example;

import java.util.Scanner;

public class ScannerReview2 {
    public static void main(String[] args) {
        /*
        1. Get Input (we do this with scanner)
        2. Do some work (this depends on the problem)
        3. Produce Output (a fancy print statement)
         */

        //Let's say:
            //I want to calculate area or circumference of a circle
                //area: Pi * R ^ 2
                //circ: 2 * Pi * R
        //1. I need to ask if they want area or circ
        //2. I need to ask for the radius
        //3. Perform the RIGHT calculation
            //How do I know?

        Scanner scan = new Scanner(System.in);
        System.out.println("DO you want area (a) or circumference (c)?");
        String type = scan.nextLine();
        System.out.println("What is your radius?");
        String response = scan.nextLine();
        double radius = Double.parseDouble(response); //Integer.parseInt()

        if (type.equals("a") || type.equals("A")){
            double area = Math.PI * radius * radius;
            System.out.println("The area of a circle with radius " + radius + " is " + area);
        } else if (type.equalsIgnoreCase("c")){
            double circ = 2 * radius * Math.PI;
            System.out.println("The circumference of a circle with radius " + radius + " is " + circ);
        } else {
            System.out.println("HEY! THat's not a valid response");
        }


    }
}
