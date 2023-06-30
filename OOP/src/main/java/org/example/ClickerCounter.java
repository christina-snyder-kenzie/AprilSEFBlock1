package org.example;

public class ClickerCounter {
    //instance variables
        //accessMod dataType varName;
    private int numClicks;

    //Constructors
    //The job of a constructor is to initialize instance variables
        //public ClassName(parameters) { init vars }
    public ClickerCounter(){
        int numClicks = 0;
        numClicks++;
        this.numClicks = 00000; //the this is a self-referencing variable
    }

    //overloaded constructor
    public ClickerCounter(int numClicks){
        //numClicks = initial;
        this.numClicks = numClicks;
    }

    //methods (behaviors)
        //public returnType methodName(parameters) { do stuff; }
    public void click(){
        numClicks++;
        if (numClicks == 10000){
            numClicks = 0;
        }
    }

    //can we overload the click method?
    //let's add a parameter for how many clicks to click

    //numClicks is 9998
    //I click 100 times (howMany)
        //numClicks -> 10098
    //end goal:
        //numClicks -> 98
    public void click(int howMany){
        this.numClicks += howMany;
        numClicks = numClicks % 10000;
    }

    public int getNumClicks(){
        return numClicks;
    }

    //fancyFormat()
        //this method should add leading zeroes to the number
        //it should return a String (with zeroes)
    //String.format(ruleString, variables)

    //String.format("The number is %d", numClicks) -> "The number is 42"
    //String.format("%0Xd", variable) -> add X zeroes to the front of the variable
        //String.format("%04d", numClicks) -> 0042
        //int number = 33;
        //String.format("%08d, number) -> 00000033
    public String fancyFormat(){
        return String.format("%04d", numClicks);
    }

}
