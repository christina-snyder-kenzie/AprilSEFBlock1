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

    public String toString(){
        StringBuilder sb = new StringBuilder(name);
        sb.append("\n~~~~~~~~~~~~~~~~~\nPrepTime: ");
        sb.append(prepTime);
        sb.append("\nCookTime: ");
        sb.append(cookTime);
        sb.append("\nSupply List: ");
        sb.append(supplies.toString().substring(1, supplies.toString().length() - 1));

        sb.append("\n~~~~~~~~~~~~~~~~~\nIngredient List");
        for (Ingredient currIngr : ingr){ //for (dt currThing : collection) {use currThing)
            sb.append("\n");
            sb.append(currIngr.toString());
        }
        sb.append("\n~~~~~~~~~~~~~~~~~\nSteps");
        int stepNumber = 1;
        for (String currStep : steps){
            sb.append("\n");
            sb.append("Step #");
            sb.append(stepNumber);
            sb.append(" - ");
            sb.append(currStep);
            stepNumber++;
        }

        return sb.toString();
    }

    //add Supply
        //take in a new supply, add it to the list
    public void addSupply(String supply){
        supplies.add(supply);
    }

    //add Ingredient
        //addIngr(Ingredient i)
    public void addIngredient(Ingredient i){
        ingr.add(i);
    }
        //addIngr(quant, unit, name)
    public void addIngredient(double q, String u, String n){
        Ingredient i = new Ingredient(q, u, n);
        ingr.add(i);
    }

    //add steps
        //addStep(newStep, location/index)
    //Precondition: The index is zero-based
    public void addStep(String newStep, int index){
        steps.add(index, newStep);
    }

    //update Ingredient
        //name, newAmount, newUnit
    public boolean updateIngr(String ingrName, double newAmount, String newUnit){
        //locate our ingredient
        for (Ingredient curr : ingr){
            //if the current ingredient has the same name as the parameter
            if (curr.getName().equalsIgnoreCase(ingrName)){
                //update the values
                curr.setQuantity(newAmount);
                curr.setUnit(newUnit);
                return true;
            }
        }
        return false;
    }


    //scaleIt(some number)
        //When you want to make a double batch -> it should update quantities by the factor
        //This will make a new recipe with updated ingredients
            //Copy the existing recipe
            //loop over ingredients
            //update all amounts by multiplying by the factor
            //return the new recipe

    public Recipe scaleIt(double scaleFactor){
        Recipe copy = new Recipe(this.name + " x " + scaleFactor);
        copy.setPrepTime(this.prepTime);
        copy.setCookTime(this.cookTime);
        copy.setSupplies(new ArrayList<String>(supplies));
        copy.setSteps(new ArrayList<String>(steps));

        //copy.addIngr(newAmount, sameUnit, sameName)
        for (Ingredient original : this.ingr){
            double newAmount = original.getQuantity() * scaleFactor;
            String sameUnit = original.getUnit();
            String sameName = original.getName();
            copy.addIngredient(newAmount, sameUnit, sameName);
        }

        return copy;
    }

    //how to remove supplies
    public void removeSupply(String supplyToRemove){
        //supplies.remove(supplyToRemove);
        for (int i = 0; i < supplies.size(); i++){
            if (supplies.get(i).equalsIgnoreCase(supplyToRemove)) {
                supplies.remove(i);
                i--;
            }
        }
    }



}
