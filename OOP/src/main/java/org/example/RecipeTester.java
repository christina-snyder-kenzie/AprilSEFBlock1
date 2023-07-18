package org.example;

import java.util.ArrayList;

public class RecipeTester {
    public static void main(String[] args) {

        String myName = "Papi's Rice";

        ArrayList<String> mySupplies = new ArrayList<String>();
        mySupplies.add("Teaspoon");
        mySupplies.add("Medium Sized Pot");
        mySupplies.add("Lid");

        ArrayList<String> mySteps = new ArrayList<String>();
        mySteps.add("Put ingredients in Pot");
        mySteps.add("Bring to a boil");
        mySteps.add("Cook until tender");

        ArrayList<Ingredient> myIngr = new ArrayList<Ingredient>();
        Ingredient i1 = new Ingredient(1, "tsp", "salt");
        myIngr.add(i1);
        myIngr.add(new Ingredient(1, "cup", "rice"));
        myIngr.add(new Ingredient(2, "cups", "water"));

        int myPrepTime = 5;
        int myCookTime = 20;

        Recipe r = new Recipe(myName, mySupplies, mySteps, myIngr, myPrepTime, myCookTime);
        System.out.println(r.getIngr());


        r.addSupply("Strainer");
        Ingredient toAdd = new Ingredient(3, "Shakes", "Onion Powder");
        r.addIngredient(toAdd);
        r.addIngredient(5, "Shakes", "Garlic Powder");
        r.addStep("Optionally wash your rice...", 0);

        r.updateIngr("salt", 4, "TBSP");

        System.out.println(r);

        Recipe r2 = new Recipe("Cookies");
        //r2.addSupply("Baking Sheet");

        Recipe doubleBatch = r.scaleIt(2);
        System.out.println(doubleBatch);

        doubleBatch.addSupply("A really big pot");
        System.out.println(doubleBatch);
        //System.out.println(r);


    }
}
