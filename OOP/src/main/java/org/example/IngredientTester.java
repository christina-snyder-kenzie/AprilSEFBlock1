package org.example;

public class IngredientTester {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        Ingredient i2 = new Ingredient(2, "cups", "water");

        System.out.println(i1.getName());
        System.out.println(i2.getUnit());

        System.out.println(i1);
        System.out.println(i2);
    }
}
