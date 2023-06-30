package org.example;

import java.util.ArrayList;

public class StringsAndMethods {

    //up top?

    public static void main(String[] args) {
        String str = "hello!";

        //goal: update the string to be hello, <name>!
        str = greetName(str, "Christina");
        System.out.println(str);

        StringBuilder strBuild = new StringBuilder("hello!");
        System.out.println(strBuild);
        System.out.println(strBuild.substring(0, 2));
        System.out.println(strBuild.length());
        System.out.println(strBuild.indexOf("ll"));

        strBuild.append("abc");

        System.out.println(strBuild);

        strBuild.delete(strBuild.length() - 3, strBuild.length());

        System.out.println(strBuild);

        strBuild.insert(strBuild.length() - 1, ", Christina");
        greetName(strBuild, "Again");
        System.out.println(strBuild);
        //TODO: Talk about replace

        //replace with STRINGs
        str = str.replace("hello", "goodbye");
        System.out.println(str);

        //replace with STRING BUILDER
        //replace(starting point, stopping point, replacement)
        strBuild.replace(0, 5, "goodbye"); // 0, 1, 2, 3, 4
        System.out.println(strBuild);

        String mystery = ", ";
        int location = strBuild.indexOf(mystery);
        String replacement = "...$$$";
        strBuild.replace(location, location + mystery.length(), replacement);
        System.out.println(strBuild);

        String csv = "coffee,tea,soda,water";
        String[] data = csv.split(",");

        String hashTagSeparated = String.join("#", data);
        System.out.println(hashTagSeparated);

        int[] numbers = {7, 5, 1, 3};
        ArrayList<String> numberList = new ArrayList<String>();
        for (int n : numbers){
            numberList.add(n + "");
        }
        String csvNumber = String.join(",", numberList);
        System.out.println(csvNumber);

        System.out.println(joinInts(new int[]{7, 5}, "#"));
        System.out.println(joinInts(new int[]{7}, "#"));
        System.out.println(joinInts(new int[]{}, "#"));
        System.out.println(joinInts(new int[]{8, 10}, "#"));
        System.out.println(joinInts(new int[]{8, 9, 10, 11}, "candy"));

    }

    //GOAL: Write our own join method that works with integer arrays
    //this method should take in, an array of numbers and a delimeter
        //In general, the delimiter should separate elements
        //if there are only 2 elements, we separate with "and"
        //also note, there is no delimeter after the last one

    //int[] arr = {7, 5, 1, 3, 2}
    //join(arr, "#") -> 7#5#1#3#2

    //int[] arr = {7, 5};
    //join(arr, "#") -> 7 and 5

    //int[] arr = {7};
    //join(arr, "#") -> 7

    //int[] arr = null or {};
    //join(arr, "#") -> ""

    public static String joinInts(int[] data, String delimeter){
        //we want to use String Builder (Because of a lot of concatenation)
        StringBuilder sb = new StringBuilder();
        if (data == null || data.length == 0){
            return "";
        } else if (data.length == 1){
            sb.append(data[0]);
        } else if (data.length == 2){
            sb.append(data[0]);
            sb.append(" and ");
            sb.append(data[1]);
        } else {
            for (int i = 0; i < data.length - 1; i++){
                sb.append(data[i]);
                sb.append(delimeter);
            }

            sb.append(data[data.length - 1]);
        }
        return sb.toString();
    }



    public static void greetName(StringBuilder greeting, String name){
        greeting.insert(greeting.length() - 1, ", " + name);
    }

    //down below?
    public static String greetName(String greeting, String name){
        String firstBit = greeting.substring(0, greeting.length() - 1);
        String lastChar = greeting.substring(greeting.length() - 1);
        greeting = firstBit + ", " + name + lastChar;
        return greeting;
    }

}
