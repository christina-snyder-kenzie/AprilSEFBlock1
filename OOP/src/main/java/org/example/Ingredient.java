package org.example;

public class Ingredient {
    //quantity- double
    private double quantity;
    //unit- String
    private String unit;
    //name- String
    private String name;

    //constructor!
    public Ingredient(double quantity, String unit, String name){
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }

    //the this is a self-referencing variable

    //methods
        //getters
    //public dataType getVarName(){
        //return varName;
    //}
    public String getName(){
        return name;
    }
    public double getQuantity(){
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
    //setters
    //public void setVarName(dataType varName){
        //this.varName = varName;
    //}
    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    //toString
    public String toString(){
        return quantity + " " + unit + " " + name;
    }
}
