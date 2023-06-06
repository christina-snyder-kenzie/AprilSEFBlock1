package org.example;

public class MilestoneHints {
    public static void main(String[] args) {
        String crazy = "I LoVE piZza AnD CanDY";
        System.out.println(grabCaps(crazy));
        System.out.println(crazy.toUpperCase());
    }

    //could we write a method that determines if a character is a letter?
    public static boolean isLetter(char letter){
        if (letter >= 'A' && letter <= 'Z'){
            return true;
        } else if (letter >= 'a' && letter <= 'z'){
            return true;
        } else {
            return false;
        }
    }

    //I want to write a method that ONLY grabs capital letters
    public static String grabCaps(String str){
        //I want to take capital lettesr and toss them into a basket
        String basket = "";
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (letter >= 'A' && letter <= 'Z'){
                basket += letter;
            }
        }
        return basket;
    }

}
