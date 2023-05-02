package org.example;

public class TipCalculator {
    public static void main(String[] args) {
        //Our goal: Calculate the tip and final total for a meal

        //We need:
            //the subtotal
            //the tax
            //how much we want to tip

        //We'll calculate:
            //The subtotal with tax
            //The tip amount
            //The final total

        double subTotal = 45.50;
        //percents:
            //7.5 vs 0.075
        double taxPercent = 0.075;
        double tipPercent = 0.22;

        double finalTotal2 = ((subTotal*taxPercent) + subTotal) + ((subTotal*taxPercent) + subTotal) * tipPercent;

        double taxAmount = subTotal * taxPercent;
        subTotal = subTotal + taxAmount; //variable update/reassignment
        System.out.println("Subtotal with Tax: $" + subTotal);

        double tipAmount = subTotal * tipPercent;
        double finalTotal = subTotal + tipAmount;

        System.out.println("Tip amount: $" + tipAmount);
        System.out.println("Final total: $" + finalTotal);

        System.out.printf("Final total: $%.2f\n", finalTotal);

        System.out.println(finalTotal2);

    }
}
