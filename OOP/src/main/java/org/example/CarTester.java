package org.example;

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("abc123", 6000, 5);
        Car c2 = new Car("xyz789", 10000, 4);
        Car c3 = new Car("987321", 2000, 2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
