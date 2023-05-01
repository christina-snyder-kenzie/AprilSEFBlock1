package org.example;

public class FunWithMath {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        System.out.println(num1 * num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 + num2);

        // ^ is actually NOT for exponents
            //Technically: it's the bitwise XOR operator
        //INTRODUCING: The Math methods!
        //Math.pow(base, exponent)


        //lets do 2 cubed (to the third power)
        System.out.println(Math.pow(2, 4));
        double result = Math.pow(2, 5);
        System.out.println("2 to the 5th is: " + result);

        //Math.sqrt(value)
        System.out.println(Math.sqrt(144));

        //Math.abs(value)
            //absolute value
        System.out.println(Math.abs(-7));

        //Math.random()
        System.out.println(Math.random());

        System.out.println(Math.PI);

        //MODULUS (%)
            //mod is the remainder operator
        System.out.println(27 % 5);
        System.out.println(16 % 4);

        double pi = 3.14159;
        System.out.printf("PI is: %.4f\n", pi);
        System.out.println(Math.round(pi));
        pi = pi * 100;
        pi = Math.round(pi);
        pi = pi / 100;
        System.out.println(pi);

    }


}
