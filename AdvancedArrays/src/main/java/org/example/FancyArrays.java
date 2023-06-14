package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class FancyArrays {
    public static void main(String[] args) {
        //primitive array ( [] )
        //vs
        //array list ( <> )

        int[] arr = {7, 5, 1, 3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //ArrayList (Collections.sort)
        System.out.println(Arrays.toString(arr));
        int[] copy = Arrays.copyOf(arr, arr.length);


        System.out.println(Arrays.toString(copy));
        boolean samesame = Arrays.equals(arr, copy);
        System.out.println(samesame);
        Arrays.fill(copy, 0, 2, 1000);
        //fill (array, startingPoint, endingPoint, newValue)
        System.out.println(Arrays.toString(copy));

        //ArrayUtils basically lets arrays function LIKE arrayLists
        int[] arrWith87 = ArrayUtils.add(arr, 87);

        int[] without87 = ArrayUtils.removeAllOccurences(arrWith87, 87);

        int[] toShift = {6, 2, 3, 5};
        int saved = toShift[0];
        int[] without6 = ArrayUtils.remove(toShift, 0);
        int[] shifted = ArrayUtils.add(without6, saved);
        System.out.println(Arrays.toString(without6));
        System.out.println(Arrays.toString(shifted));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        int removedNumber = list.remove(0);
        list.add(removedNumber);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            System.out.println(number);
        }


    }
}
