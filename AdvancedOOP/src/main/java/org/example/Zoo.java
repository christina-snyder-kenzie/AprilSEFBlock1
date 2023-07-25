package org.example;

public class Zoo {
    public static void main(String[] args) {
        Animal winnie = new Animal("fur", 4, true, false, true, 41.5);

        System.out.println("Winnie's weight before eating is: " + winnie.getWeight() + " lbs");

        winnie.eat();

        System.out.println("Winnie's weight after eating is: " + winnie.getWeight() + " lbs");

        winnie.sleep();

        System.out.println("Winnie's weight after sleeping is: " + winnie.getWeight() + " lbs");


        System.out.println("-----------------------------------------------");


        Animal roo = new Animal("fur", 4, true, false, true, 200);

        Animal kanga = new Animal("fur", 4, true, false, true, 250);

        System.out.println("Roo is injured: " + roo.getIsInjured());

        System.out.println("Kanga is injured: " + kanga.getIsInjured());

        roo.fight(kanga);

        System.out.println("Roo is injured: " + roo.getIsInjured());

        System.out.println("Kanga is injured: " + kanga.getIsInjured());
        kanga.breathe();

        System.out.println("-------------------------------");

        Fish guppy = new Fish("scales", true, false, false, 5, "red", 2.5, true);

//        guppy.breathe();
//        guppy.swim();

        // POLYMORPHISM!!!

        // We can 'label' a Fish as an Animal, but we cannot label an Animal as a Fish
        // Allowed:
        Animal nemo = new Fish("scales", true, false, false, 1, "orange and black", 1, false);
        // Not Allowed:
        // Fish marlin = new Animal()

        guppy.sleep();
        nemo.sleep();

        guppy.swim();
       //  nemo.swim();    doesn't work because Animals do not have a swim method

        guppy.breathe();
        // if you can do a more specific thing, do the more specific thing
        nemo.breathe();

        Animal lion = new Animal("fur/hair", 4, false, true, true, 300);

        lion.breathe();

        System.out.println(nemo instanceof Fish);  // true
        System.out.println(nemo instanceof Animal); // true

        System.out.println(guppy instanceof Animal); // true
        System.out.println(lion instanceof Fish);   // false

        // Object - all objects inherit from Object
        System.out.println(kanga instanceof Object); // true
        System.out.println("word" instanceof Object); // true


        System.out.println("-----------------------");

        Shark gloria = new Shark("sharkskin", true, false, false, 200, "gray", 5, true, 3);

        gloria.swim(); // sharks keep swimming
        gloria.bite(); // CHOMP
        gloria.bite(); // i'm not hungry
        gloria.swim(); // sharks keep swimming
        gloria.bite(); // CHOMP


        System.out.println("----------------------");

        // USING ENUMS
        Employee bezos = new Employee("Jeff Bezos", Department.OUTBOUND, Shift.RT);


        System.out.println(bezos.getDepartment());  // OUTBOUND
        System.out.println(bezos.getShift());  // RT


    }
}
