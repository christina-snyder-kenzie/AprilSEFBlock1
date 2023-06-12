package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
/*
    Arrays VS ArrayLists

    COLLECTION - THEY ARE BOTH COLLECTIONS

    Arrays:
    - built in!
    - how do we make one?
       - int[] numbers = new int[size];
       - int[] numbers = {1, 2, 3, 4};
    - how do we know how many elements are in an array?
       - array.length
    - fixed size
    - what can we put inside of arrays?
       - anything! (primitives (int, double, boolean) AND Objects (Strings, Arrays, etc)
    - how do we add/remove elements to an array?
       - its a process....
          - int[] numbers = {1, 2, 3, 4};   lets add 5 to the end
          - make a new array of numbers.length + 1
          - loop over numbers, assign newArray[i] = numbers[i];
          - newArray[newArray.length - 1] = 5;
          - remove is similar, but making it smaller instead
    - how do we access elements at a certain index?
       - array[index]
    - how do we assign a value to an element at a certain index in an array?
       - array[index] = newValue;
    - how do loop over an array?
       - stopping condition is usually array.length
       - can use for-each
    - how do we determine if an element exists within an array?
       - contains algorithm


    ArrayLists:
    - not built in.... must be imported (java.util.ArrayList)
    - how do we make one?
       - ArrayList<String> groceryList = new ArrayList<String>();
    - how do we know how many elements are in an ArrayList?
       - ArrayList.size()
    - variable size/size can change!!!
    - what can we put inside of ArrayLists?
       - ONLY OBJECTS, no primitives!!!
           - wrapper class!
           - autoboxing and auto-unboxing
           - example:
               - ArrayList<int> numbers = new ArrayList<int>();               BAD!
               - ArrayList<Integer> numbers = new ArrayList<Integer>();       GOOD!
    - how do we add/remove elements to an ArrayList?
       - its easy :)
          - .add()
          - ArrayList<Integer> numbers = new ArrayList<Integer>();
          - numbers.add(1);
          - numbers.add(2);
          - numbers.add(3);
          - numbers.add(4);
          - numbers.add(5);  [1, 2, 3, 4, 5]
          - the add method is overloaded!!! we can use add with a different amount of arguments
             - numbers.add(value)             will add the value to the end of the ArrayList
             - numbers.add(index, value)      will add the value at the specified index
             - what if we wanted to add 0 to position 0?
                - numbers.add(0, 0);  [0, 1, 2, 3, 4, 5]
          - .remove(index)
     - how do we access elements within an ArrayList?
          - .get(index)
          - arrayList.get(index)
     - how do we assign a new value to an element at a certain index in an ArrayList?
          - .set(which index?, what new value?)
          - .set(index, value)
             - [0, 1, 2, 3, 4, 5]
             - let's change 2 to 30
             - numbers.set(2, 30);    [0, 1, 30, 3, 4, 5]
     - how do we loop over an ArrayList?
          - usually loop until arrayList.size()
          - can also use for-each
     - how do we determine if an element exists within an ArrayList?
          - arrayList.contains(valueToLookFor) -> returns a boolean
*/






    public static void main(String[] args) {
        // make an ArrayList of Strings
        ArrayList<String> marvelHeroes = new ArrayList<String>();
        System.out.println(marvelHeroes);

        // how to access the size?
        System.out.println("The size of the ArrayList is: " + marvelHeroes.size());

        marvelHeroes.add("Hulk");
        marvelHeroes.add("Iron Man");
        marvelHeroes.add("Spider-man");
        marvelHeroes.add("Thor");
        marvelHeroes.add("Black Widow");
        marvelHeroes.add("Dr. Strange");

        System.out.println(marvelHeroes);
        System.out.println("The size of the ArrayList is: " + marvelHeroes.size());

        // add an element to a certain index
        marvelHeroes.add(0, "Captain America");

        System.out.println(marvelHeroes);
        System.out.println("The size of the ArrayList is: " + marvelHeroes.size());

        // replace Hulk with Black Panther
        marvelHeroes.set(1, "Black Panther");
        System.out.println(marvelHeroes);

        // lets allow the user to choose which hero we print
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 0 to " + (marvelHeroes.size() - 1));

        int index = Integer.parseInt(scan.nextLine());
        String hero = marvelHeroes.get(index);
        System.out.println(hero);
        System.out.println("----------------------");

        // how do we loop over an ArrayList
        for (int i = 0; i < marvelHeroes.size(); i++) {
            String currentHero = marvelHeroes.get(i);
            System.out.println(currentHero);
        }

        // find position of a certain value
        for (int i = 0; i < marvelHeroes.size(); i++) {
            String currentHero = marvelHeroes.get(i);
            if (currentHero.equalsIgnoreCase("Captain America")) {
                System.out.println(i);
            }
        }

        // determining if an ArrayList contains a value
        boolean isIronManHere = marvelHeroes.contains("Iron Man");
        System.out.println("Is Iron Man in our array list?: " + isIronManHere);



        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println("The max value in the array list is: " + findMax(integers));

    }

    public static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {  // auto unboxing
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
















