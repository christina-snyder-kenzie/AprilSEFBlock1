package org.example;

import java.util.Arrays;

public class StringReIntro {
    public static void main(String[] args) {
        String phrase = "All dogs go to heaven";

        int a = phrase.indexOf("dogs"); // 4
        int b = phrase.indexOf("A"); // 0
        int b2 = phrase.indexOf("l"); // 1
        int c = phrase.indexOf("cats"); // -1

        String d = phrase.substring(2, 5); // "l d"
        String e = phrase.substring(phrase.length() - 3); // "ven"

        char f = phrase.charAt(phrase.length() - 1); // 'n'

        //immutability
            //im mutate ability
            //unable to change
        //Strings are immutable

        System.out.println(phrase.substring(0, 3));
        System.out.println(phrase);

        String first3 = phrase.substring(0, 3);

        //replace(oldString, replacementString)
        String crazy8s = phrase.replace("o", "8");
        System.out.println(crazy8s);

        phrase = phrase.replace("l", "7");
        System.out.println(phrase);

        String noOhs = phrase.replace("o", "");
        System.out.println("NO Ohs: " + noOhs);

        //.toCharArray() -> makes an array with each letter as its own element
        char[] letters = phrase.toCharArray();
        char firstLetter = letters[0];
        System.out.println(Arrays.toString(letters));

        //.split(delimiter)
            //delimiter is a fancy word for separator
        //returns an array of Strings
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words){
            System.out.println(word);
        }

        String[] data = phrase.split("o ");
        System.out.println(Arrays.toString(data));


        String fullName = "Christina Elvira Snyder";
        //Your task: create a variable that contains only your initials
        String firstInitial = fullName.substring(0, 1);
        //int posOfSpace = fullName.indexOf(" ");
        String[] names = fullName.split(" ");
        System.out.println(Arrays.toString(names));

        String allInitials = "";
        for (String name : names){
            System.out.println(name);
            String initial = name.substring(0, 1);
            System.out.println(initial);
            allInitials += initial + ".";
        }
        System.out.println(allInitials);


        //Given a string, count how many 'w's there are

        String str = "The water park was wacky, wonderful, awesome, wow";

        //we need a counter

        //init
        int counter = 0;
        //loop
        for (int i = 0; i < str.length(); i++) {
           /*
            String letter = str.substring(i, i + 1);
            //if statement (about w's) (if the letter is a w)
            if (letter.equals("w")) {
                //counter++
                counter++; //counter = counter + 1;
            }
            */


            char letter = str.charAt(i);
            if (letter == 'w'){
                counter++;
            }
        }
        System.out.println("The string has " + counter + " w's");




        //how do I look at each letter?
            //for (int i = 0; i < str.length(); i++) {  char letter = str.charAt(i); }

            //for (int i = 0; i < str.length(); i++) { String letter = str.substring(i, i + 1); }

            //for (char letter : str.toCharArray() ) { ... }


        //How do I see if the letter is a w?
            //String letter;
                //if (letter.equals("w"))

            //char letter;
                //if (letter == 'w')

        String withOutWs = str.replace("w", "");
        int numberOfWs = str.length() - withOutWs.length();

        String[] wackyWords = str.split(" ");
        for (int i = 0; i < wackyWords.length; i++){
            String currentWord = wackyWords[i];
            if (currentWord.equals("wow")){
                System.out.println(currentWord + " at " + i);
            }
        }


        System.out.println(MethodIntro.findSign(-102));

        

    } //ends the main method
} //ends the class/file
