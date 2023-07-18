package org.example;

public class Car {
    private String VIN;
    private double price;
    private int numPassengers;

    public Car(String VIN, double price, int numPassengers){
        this.VIN = VIN;
        this.price = price;
        this.numPassengers = numPassengers;
    }

    public void testDrive(){
        System.out.println("The fastest car is a rental car");
    }

    public String toString(){
        String toReturn = "VIN: " + VIN;
        toReturn += "\nPrice: " + price;
        toReturn += "\nNumPassengers: " + numPassengers;
        return toReturn;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
