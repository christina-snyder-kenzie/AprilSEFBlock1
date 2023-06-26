package org.example;

public class DogPark {
    public static void main(String[] args) {
        /*
        Dog buddy = new Dog();
        buddy.breed = "Lab";
        buddy.weight = 90;
        buddy.age = 7;
        */
        Dog buddy = new Dog("Lab", 90, 7);

        System.out.println(buddy.weight);
        buddy.eat();
        System.out.println(buddy.weight);

        buddy.bark();

        int updatedAge = buddy.haveBirthday();
        System.out.println(updatedAge);
        System.out.println(buddy.weight);

        updatedAge = buddy.haveBirthday(10);
        System.out.println(updatedAge);
        System.out.println(buddy.weight);

        /*double updatedWeight = */
        buddy.exercise("spinning in circles", 1);
        System.out.println(buddy.weight);

        double answer = Math.pow(2, 5);

        String x = new String("Hello");
        String piece = x.substring(0, 2);

        Dog stray = new Dog(45, 3);
        int strayAge = stray.haveBirthday(5);
        System.out.println(strayAge);
        System.out.println(stray.weight);
        //System.out.println(stray.breed);
        System.out.println(stray.getBreed());
        System.out.println(buddy.getBreed());
    }
}
