package org.example;

import java.util.ArrayList;

public class Recipe {
    //list of ingredients
        //how much
        //quantity
        //the unit? (tsp vs cup)
        //the name
    //DO we need an Ingredient class?
        //Ingredient[]
        //ArrayList<Ingredient>
    //steps to follow- String[] (maybe String ArrayList?)
        //preparations
    //prep time- int
    //cook time- int

    //total time? - int (cookTime + prepTime?)
        //stored vs calculated values

    //supplies needed - String[] -> Nah, arrayList
    //dish name - String

    private String name;
    private ArrayList<String> supplies, steps;
    private ArrayList<Ingredient> ingr;
    private int prepTime, cookTime;

    public Recipe(String name, ArrayList<String> supplies, ArrayList<String> steps, ArrayList<Ingredient> ingr, int prepTime, int cookTime){
        this.name = name;
        this.supplies = supplies;
        this.steps = steps;
        this.ingr = ingr;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
    }

    public Recipe(String name){
        this.name = name;
        supplies = new ArrayList<String>();
        steps = new ArrayList<>();
        ingr = new ArrayList<Ingredient>();
        prepTime = 0;
        cookTime = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<String> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<String> supplies) {
        this.supplies = supplies;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public ArrayList<Ingredient> getIngr() {
        return ingr;
    }

    public void setIngr(ArrayList<Ingredient> ingr) {
        this.ingr = ingr;
    }

    public int getPrepTime() {
        return prepTime;
    }


    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    /*  public void addIngredient(parameters){

    }

    public void updateIngredient(parameters){

    }*/

}
