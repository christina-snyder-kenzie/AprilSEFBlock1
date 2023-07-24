package org.example;

import java.awt.image.BandCombineOp;

public class BankAccount {
    // property: balance
    // private or public? protected
      // private - can only access within the class it is defined
      // public - can access within the entire project
      // protected - can access within class it is defined and any class which INHERITS from the class in which it is defined
    protected double balance;
    protected double signUpBonus;

    // constructors
    // overloading vs overriding
      // overloading (methods) - same name, different amount of parameters
      // overriding (methods) - same name, same number of parameters
    // option 1: we don't deposit
    public BankAccount() {
//        this.signUpBonus = 200;
//        this.balance = this.signUpBonus;
        this(0);
    }

    // option 2: we do deposit
    public BankAccount(double balance) {
        this.signUpBonus = 200;
        this.balance = balance + this.signUpBonus;
    }

    // getters and setters
    public double getBalance() {
        return this.balance;
    }

    public double getSignUpBonus() {
        return this.signUpBonus;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setSignUpBonus(double signUpBonus) {
        this.signUpBonus = signUpBonus;
    }

    // instance methods
    // withdraw, deposit, toString

    // add amount to balance and return the new balance
    public double deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully deposited $" + amount + ". New balance is: " + this.balance);
        return this.balance;
    }

    // try to withdraw an amount, return current balance
    public double withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            // this.getBalance() -= amount;   NO GOOD!
            // this.setBalance(this.getBalance() - amount);
            System.out.println("Successfully withdrew $" + amount + ".");
        } else {
            System.out.println("Insufficient funds. Could not withdraw $" + amount + ".");
        }

        // System.out.println("Current balance: $" + this.balance);
        System.out.println(this);
        return this.balance;
    }

    // OVERRIDE
    public String toString() {
        return "Balance: $" + String.format("%.2f", this.balance);
    }


}
