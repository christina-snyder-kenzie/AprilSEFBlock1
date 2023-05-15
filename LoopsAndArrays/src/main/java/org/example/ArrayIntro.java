package org.example;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        double monday = 78;
        double tuesday = 82;
        double wednesday = 85;
        double thursday = 90;
        double friday = 65;

        System.out.println(thursday);

        //an array is a data structure that can hold more than one value

        double[] temps4Week = {78 , 82 , 85 , 90 , 65};

        //in general, to make an array:
        //option 1:
            //dataType[] arrName = {value1, value2, etc};
        //option 2:
            //dataType[] arrName = new dataType[size];
                //this will create size spots that are filled with
                    //default values:
                        //int -> 0
                        //double -> 0.0
                        //boolean -> false
                        //String -> null (null is a very special nothing)
                        //other objects -> null

        //element is another way of saying value at a position
        int numElements = temps4Week.length;
        System.out.println(numElements);
        double firstTemp = temps4Week[0];
        System.out.println(firstTemp);

        //in general, to retrieve an element:
            //dataType value = arrName[index];
        double lastTemp = temps4Week[temps4Week.length - 1];
        System.out.println(lastTemp);

        //in general, to update an element/ change the value:
            //arrName[index] = newValue;

        temps4Week[0] = 102;
        System.out.println(temps4Week[0]);

        System.out.println(temps4Week);
        System.out.println(Arrays.toString(temps4Week));

        String[] guestList = new String[6];
        guestList[0] = "Me";
        guestList[1] = "Charles";
        guestList[2] = "Michael";
        guestList[3] = "Caroline";
        guestList[4] = "Hunter";
        guestList[5] = "Samee";
        System.out.println(Arrays.toString(guestList));

        guestList[2] = "Nate";
        System.out.println(Arrays.toString(guestList));

        //I want caroline and charles to swap places
        //SWAP

        //WRONG WAY FIRST:
            //whereI'mGoing = whatIHave;
            //guestList[1] = guestList[3];
            //guestList[3] = guestList[1];
        System.out.println(Arrays.toString(guestList));

        //RIGHT WAY TO SWAP:
        String saved = guestList[1];
        guestList[1] = guestList[3];
        guestList[3] = saved;
        System.out.println(Arrays.toString(guestList));

    } //ends the main method
} //ends the class/file
