package org.example;

import java.util.ArrayList;

public class ScopeExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(5);
        list.add(3);

        int x = 87;
        int y = 36;

        y = wacky(x, y, list); //what is x, y, list, a, b, c after the method runs?
        System.out.println(list);
        doubleIt(list);
        System.out.println(list);

    } //ends main method

    //THE GOAL: Multiply every number by 2
    public static void doubleIt(ArrayList<Integer> list){
        //MISTAKE BELOW, don't do this!
        /*for (int number : list){
            number = number * 2;
        }*/
        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            number = number * 2;
            list.set(i, number); //arr[i] = number * 2

            //list.set(i, list.get(i) * 2);
        }

    }

    public static int wacky(int a, int b, ArrayList<Integer> c){
        a -= b;
        c.add(a);
        return a;
    }

}//ends the class

