package org.example;

public class StringIntro {
    public static void main(String[] args){
        //Variables:
        //dataType variableName = value;

        String name = "Christina";
        System.out.println(name);
        System.out.println(name.length());
        int numLetters = name.length();

        //String have indexes
        //and Index is a location or a spot
        //charAt(index)
            //returns the character at that index

        String kenzie = "Kenzie Academy!";

        System.out.println("Kenzie Academy! length: " + kenzie.length());

        char firstLetter = kenzie.charAt(0);
        System.out.println(firstLetter);
        char mysteryLetter = kenzie.charAt(3);
        System.out.println(mysteryLetter);
        char lastLetter = kenzie.charAt(kenzie.length() - 1);
        System.out.println(lastLetter);

        //.substring(startingIndex)
            //Will start at startingIndex and go to the end of the string
            //returns a new string

        //"Kenzie Academy!"
        String portion = kenzie.substring(2);
        System.out.println(portion);
        String test = kenzie.substring(7);
        System.out.println(test);

        //.substring(start, stop)
            //The stopping point is EXCLUSIVE
            //We go up to but NOT INCLUDING the stopping point
        String firstTwo = kenzie.substring(0, 2);
        System.out.println(firstTwo);
        //"Kenzie Academy!"
        String kenzieSolo = kenzie.substring(0, 5);
        System.out.println(kenzieSolo);

        //.indexOf(littleString)
            //returns the position of that string

        int positionOfSpace = kenzie.indexOf(" ");
        System.out.println(positionOfSpace);
        String beforeTheSpace = kenzie.substring(0, positionOfSpace);
        System.out.println(beforeTheSpace);
        String afterTheSpace = kenzie.substring(positionOfSpace + 1, kenzie.length());
        System.out.println(afterTheSpace);

        String sentence = "I love pizza and candy";
        int startingPoint = 0;
        int midPoint = sentence.length() / 2;
        int endPoint = sentence.length();
        String firstHalf = sentence.substring(startingPoint, midPoint);
        String secondHalf = sentence.substring(midPoint, endPoint);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
