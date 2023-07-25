package org.example;

public class Fish extends Animal {
    // color, gillSize, canRegenerate
    private String color;
    private double gillSize;
    private boolean canRegenerate;

    public Fish(String exterior, boolean hasEyes, boolean isBlind, boolean endothermic, double weight, String color, double gillSize, boolean canRegenerate) {
        super(exterior, 0, hasEyes, isBlind, endothermic, weight);
        this.color = color;
        this.gillSize = gillSize;
        this.canRegenerate = canRegenerate;
    }

    // instance methods

    public void swim() {
        System.out.println("Swimming... swimming... swimming...");
    }

    @Override
    public void breathe() {
        System.out.println("Tasty breath - I used my " + gillSize + "cm gills to get that oxygen");
    }


    // getters and setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGillSize() {
        return gillSize;
    }

    public void setGillSize(double gillSize) {
        this.gillSize = gillSize;
    }

    public boolean getCanRegenerate() {
        return canRegenerate;
    }

    public void setCanRegenerate(boolean canRegenerate) {
        this.canRegenerate = canRegenerate;
    }
}

class Shark extends Fish {
    private int bloodDistance;
    private boolean isHungry;


    public Shark(String exterior, boolean hasEyes, boolean isBlind, boolean endothermic, double weight, String color, double gillSize, boolean canRegenerate, int bloodDistance) {
        super(exterior, hasEyes, isBlind, endothermic, weight, color, gillSize, canRegenerate);
        this.bloodDistance = bloodDistance;
        this.isHungry = true;
    }

    public void swim() {
        System.out.println("Sharks keep swimming");
        this.isHungry = true;
    }

    public void bite() {
        if (this.isHungry) {
            System.out.println("CHOMP");
            this.eat();
            this.isHungry = false;
        } else {
            System.out.println("I'm not hungry");
        }
    }
}

