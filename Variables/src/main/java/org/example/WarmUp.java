package org.example;

public class WarmUp {
    public static void main(String[] args) {
        int a = 9 / 2; // 4 (truncation)
        double b = 9.0 / 2; //4.5 (decimals in math, mean decimals in answer);
        double c = 9 / 2; //4.0
        //double c = 9 / 2 (At the time when I do division, they're both whole numbers)
        //double c = 4;
        //promotion happens!
        //c is 4.0
        String d = 5 + "hello"; //5hello
        String e = "hello" + 5; //hello5

        String f = 2 + 5 + "hello"; //7hello
            //7 + "hello"
            //-> 7hello
        String g = "hello" + 2 + 5; //hello25
            //"hello2" + 5
            //"hello25"
        System.out.println(f);
        System.out.println(g);

        //What's going on?
        //The + sign
        //Sometimes means math
        //Sometimes means concatenation
            //concatenation = fancy glue together

        //the + is contextual

        String h = (1 + 2) + 3 + "hello"; //6hello
        String i = "hello" + (1 + 2) + 3; //hello33

        //PcEMDAS
            //Parentheses
            //Casting
            //Exponents
            //Multiplication/ Modulus / Division
            //Addition / Subtraction
        int x = 2 + 3 * 4; //14
            //2 + 12
            //14
        int y = (2 + 3) * 4; //20

        //Casting
            //casting forces a change of data type
        int z = (int) (9.0 / 2);
            //(int) 4.5
            //4
        //int z2 = (int) 9 / 2.0;
            // 9 / 2.0
            //ERROR
            //int z2 = 4.5 (not allowed)
        int z3 = (int) 9.0 / 2;
            //9 / 2
            //4

        int z4 = 9 / (int) 2.0; //4

        //int z5 = 9.0 / (int) 2.0; ERROR
            // 9.0 / 2
            // 4.5
            //Still not allowed in an int




    }
}
