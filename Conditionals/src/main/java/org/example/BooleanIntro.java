package org.example;

public class BooleanIntro {
    public static void main(String[] args) {
        //variables
        //dataType variableName = value;
            //dataTypes : int, double, float, char, boolean, String (short, long, byte)
            //rules:
                //alpha numeric
                //no spaces
                //no keywords
                //cannot start with a number
            //conventions:
                //use camelcase
                //all variables start with lower case
                //descriptive

        double x = 9 / 2;
                //truncation happens
            //double x = 4;
                //promotion happens
            //x -> 4.0

        String tricky = (5 + 3) + 4 + "hello" + (5 + 3) + 4;
                    // 8 + 4 + "hello" + 8 + 4
                //CONTEXT MATTERS (What's around the + sign)
                    // 12 + "hello" + 8 + 4
                    // "12hello" + 8 + 4
                    // "12hello8" + 4
                    // 12hello84

        boolean Iam31 = true;
        boolean Iam102 = false;

        //boolean operators
        //these work for numbers
            // > (greater than)
            // < (less than)
            // >= (greater than or equal to)
            // <= (less than or equal to)
            // ==  (equals equals) (comparison operator)
            // != (not equals) (sees if things are different)

        boolean one = 10 > 5;
        System.out.println(one);
        boolean two = 10 < 5;
        System.out.println(two);
        boolean three = 10 == 5;
        System.out.println(three);
        boolean four = 5 > 10;
        System.out.println(four);
        boolean five = 10 != 5;
        System.out.println(five);

        //what about Strings?
            // > and < don't work
            // == and != will compile, but they don't always work

        String word1 = "hello";
        String word2 = new String("hello");
        String word3 = "hello";
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word1 == word2);
        //USE .equals (I call this dot equals)
        System.out.println(word1.equals(word2));
        System.out.println(word1 == word3);


    } //ends the main method

} //ends the class
