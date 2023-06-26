package org.example;

public class Dog {
    //access modifiers
    //changes your ability to interact with data
        //public
        //private -> only this class file can interact
        //protected -> only this Package (and subclasses) can interact
        //default -> only this package
    private String breed;
    protected double weight;
    private int age;

    //Constructors go here
    //public ClassName(parameters for attributes)
    public Dog(String breedParam, double weightParam, int ageParam){
        breed = breedParam;
        weight = weightParam;
        age = ageParam;
    }

    public Dog(double weightParam, int ageParam){
        breed = "Mixed breed";
        weight = weightParam;
        age = ageParam;
    }

    public void bark(){
        System.out.println("WOOF!");
    }

    public void eat(){
        //this method should increase weight by 1%
        double amtToAdd = weight * 0.01;
        weight += amtToAdd;
    }

    //Birthdays:
        //age should increase
        //they eat 3 treats
        //return the new age
    public int haveBirthday(){
        age++;
        eat();
        eat();
        eat();
        return age;
    }

    //overloading a method
    //overloading means:
        //Same method name
        //DIFFERENT parameters
    //substring(start, stopping)
    //substring(start)

    public int haveBirthday(int numTreats){
        for (int i = 0; i < numTreats; i++){
            eat();
        }
        age++;
        return age;
    }

    //exercise
        //should decrease weight somehow
        //should we take in a type? and time (minutes or hours?)

            //depending on the type, we burn calories
                //at different rates?
            //walking -> -.5% per hour
            //running -> -1.2% per hour
            //playing -> -0.8% per hour
            //default -> -0.1% per hour
        //return the new weight
    public void exercise(String type, double hours){
        double factor;
        //if statements to fill up the factor
        //walking vs walk vs Walking vs WALK
            //type.toLowerCase().contains(rootWord)
        if (type.toLowerCase().contains("walk")){
            factor = 0.005;
        } else if (type.toLowerCase().contains("run")){
            factor = 0.012;
        } else if (type.toLowerCase().contains("play")){
            factor = 0.008;
        } else {
            factor = 0.001;
        }
        double amountToSubtract = weight * factor * hours;
        weight -= amountToSubtract;
        //return weight;
    }

    //need a way to GET the breed
    //a getter method follows this format:
    //public dataType getVarName() { return varName; }

    public String getBreed(){
        return breed;
    }

    //encapsulation

}
