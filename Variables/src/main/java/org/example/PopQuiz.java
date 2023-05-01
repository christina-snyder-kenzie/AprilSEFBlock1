package org.example;

public class PopQuiz {
    public static void main(String[] args) {
        int a = 6 / 3; //2
        int b = 7 / 2; //3
            //this TRUNCATES
            //truncation means chop off the decimal
        int c = 15 / 5; //3
        //int c2 = 7.0 / 2; ERRORS Incompatible types
        double d = 7.0 / 2; //3.5
        double e = 7 / 2.0; //3.5
        double f = 7 / 2; //3.0

        double g = 4; //promotion
            //as it crosses over the equals sign, it is promoted to a double
        //int h = 4.0; //NOT ALLOWED
        int h = (int) 4.0; //casting
            //Casting forces the change of datatype

        //ints are whole numbers
        //doubles have decimals
        System.out.println(g);

        double x = 7; //7.0 promoted
        double y = 2; //2.0 promoted
        double z = x / y; //3.5

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);


        //I want to say 2 to the fifth power
        //2 ^ 5
        //Math.pow(2, 5);
















    }
}
