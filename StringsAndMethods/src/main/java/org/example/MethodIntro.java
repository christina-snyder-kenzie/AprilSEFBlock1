package org.example;

import java.util.Arrays;

public class MethodIntro {

    //METHODS CAN GO HERE

    // 6/12 warmup examples
    public static boolean isTweetable(String message, int characterLimit) {
        // if the length of the message is less than the character limit, it is tweetable
        if (message.length() <= characterLimit) {
            return true;
        } else {
            return false;
        }
    }

    // create a method which is determine whether or not a particular value (int/String/double/whatever) exists within an array
    public static boolean doesContain(int[] numbers, int numberToLookFor) {
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber == numberToLookFor) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
//        String data = "7,5,1,3";
//
//        String str = "The    water    park was wacky,    wonderful, awesome,    wow";
//        System.out.println(str);
//
//        double result = Math.pow(2, 5);
//
//        //static methods
//            //do not need an object
//            //are called from the class name
//
//        //vs
//
//        //instance methods
//            //need an object
//            //are called from a variable name
//
//        String piece = str.substring(0, 4);
//        int index = str.indexOf("water");
//
//        String sign = findSign(17);
//        System.out.println(sign);
//        System.out.println(wordCount(str));
//
//        String[] words = collectWords(str);
//        System.out.println(Arrays.toString(words));
//
//        System.out.println(fancySubstring("hello", 2, true));
//        System.out.println(fancySubstring("hello", 3, false));
//
//        System.out.println(countLs("hello, world!"));
//        System.out.println("l's: " + countANYletter("hello, world!", 'l'));
//        System.out.println("o's: " + countANYletter("hello, world!", "o"));

        String tweet = "Good morning from Nashville, TN";
        int characterLimit = 144;

        boolean canBeTweeted = isTweetable(tweet, characterLimit);
        System.out.println("Can be tweeted?: " + canBeTweeted);

        characterLimit = 20;

        String aLaterTweet = "Good evening from the capital of Tennessee, Music City USA";
        canBeTweeted = isTweetable(aLaterTweet, characterLimit);
        System.out.println("Can be tweeted?: " + canBeTweeted);

        int[] scores = {10, 11, 12, 5, 7, 9};
        int myScore = 7;
        boolean doesMyScoreExist = doesContain(scores, myScore);
        System.out.println("Does my score exist?: " + doesMyScoreExist);

        int alainsScore = 14;
        boolean doesAlainsScoreExist = doesContain(scores, alainsScore);
        System.out.println("Does Alain's score exist?: " + doesAlainsScoreExist);


    } //ends my main method

    //BRAINSTORM:
    //I want to write a method that could count ANY specific letter

    public static int countANYletter(String str, String specificLetter){
         int counter = 0;
         for (int i = 0; i < str.length(); i++){
             String currentLetter = str.substring(i, i + 1);
             if (currentLetter.equals(specificLetter)){
                 counter++;
             }
         }//ends my for loop
         return counter;
    }//ends my method

    public static int countANYletter(String str, char specificLetter){
        int counter = 0;
        for (char c : str.toCharArray()){
            if (c == specificLetter){
                counter++;
            }
        }
        return counter;
    }


    //GOAL: I want to count how many l's are in a string
    //input: String
    //output: int (we're counting)
    //methodName: countLs

    public static int countLs(String phrase){
        int counter = 0;
        for (char c : phrase.toCharArray()){
            if (c == 'l' || c == 'L'){
                counter++;
            } //ends my if statement
        } //ends my loop
        return counter;
    } //ends my method



    //GOAL: Create a fancy substring
        //we want this to give us the first or last n letters

    //inputs:
        //String
        //int n (the number of letters)
        //boolean startFromFront (true or false)

    //Examples:
        //fancySubstring("hello", 2, true); -> he
        //fancySubstring("hello", 3, false); -> llo

    public static String fancySubstring(String word, int n, boolean startFromFront){
        //how do we substring?
        //if I need them from the front
        if (startFromFront) {
            //substring(0, n)
            String firstBit = word.substring(0, n);
            return firstBit;
        } else {
            //else
            //substring(length - n)
            return word.substring(word.length() - n);
        }
    }


    //NEW GOAL: In a string with extra spaces, can we collect only the words?

    //inputs -> a string with extra spaces
    //do stuff -> collecting algorithm
            //count
            //make the new array
            //fill it up
    //outputs -> an array of only the words

    public static String[] collectWords(String str){
        int count = wordCount(str);

        String[] realWords = new String[count];

        //we need some data (could be words)
        String[] couldBeWords = str.split(" ");

        //we need an index for realWords
        int realWordIndex = 0;

        //we need to actually collect them...
        for (String potential : couldBeWords){

            if (potential.length() != 0){
                realWords[realWordIndex] = potential;
                realWordIndex++;
            }
        }

        return realWords;
    }



    //NEW GOAL: I want to make a wordCount method, that will take in a string, and
        //tell me how many words are in it

    //inputs -> a String
    //the work (we have to find words, and then see how many there are...)
    //outputs -> the number of words

    public static int wordCount(String str){
        String[] words = str.split(" ");
        //return words.length; //only works if NO extra spaces!

        int counter = 0;
        for (String word : words){
            if (word.length() > 0){
                counter++;
            }
        }
        return counter;
        //char[] letters = str.toCharArray();
        //letters.length == str.length()
    }


    //METHODS CAN ALSO GO HERE
    //A method is a reusable block of code

    //GOAL: Given a number, return a string indicating if that number is:
        //Positive, Negative, or Zero

    //in general: (method signature/header)
    //public static returnDataType methodName(dt1 param1, dt2 param2, etc) { }


    public static String findSign(int number) {
        if (number > 0){
            return "Positive";
        } else if (number < 0){
            return "Negative";
        } else {
            String answer = "Zero";
            return answer;
        }
    }























} //ends my class
