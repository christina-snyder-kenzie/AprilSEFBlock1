package org.example;

public class CheckingAccount extends BankAccount {

    // has-a vs is-a relationship
    // checking accounts have an is-a relationship with bank accounts
    // squares vs rectangles
      // all squares are rectangles, but not all rectangles are squares
      // all checking accounts are bank accounts, but not all bank accounts are checking accounts

    // parent class (super class): BankAccount
    // child class (sub class): CheckingAccount

    // number of withdrawals, max number of withdrawals
    private int currentWithdrawals, maxWithdrawals;

    // currentWithdrawals will default to 0
    // maxWithdrawals will default to 5
    // balance will default to 0

    // creating a checking account without an initial deposit
    public CheckingAccount() {
        super();
        this.currentWithdrawals = 0;
        this.maxWithdrawals = 5;
    }

    public CheckingAccount(double balance) {
        super(balance);
        this.currentWithdrawals = 0;
        this.maxWithdrawals = 5;
    }

    public CheckingAccount(double balance, int maxWithdrawals) {
        super(balance);
        this.currentWithdrawals = 0;
        this.maxWithdrawals = maxWithdrawals;
    }

    public int getCurrentWithdrawals() {
        return this.currentWithdrawals;
    }

    public void setCurrentWithdrawals(int currentWithdrawals) {
        this.currentWithdrawals = currentWithdrawals;
    }

    public int getMaxWithdrawals() {
        return this.maxWithdrawals;
    }

    public void setMaxWithdrawals(int maxWithdrawals) {
        this.maxWithdrawals = maxWithdrawals;
    }

    @Override
    // return the balance
    public double withdraw(double amount) {
        // If its my first withdrawal, and I ask for money that I have
          // 1. update the balance
          // 2. increase currentWithdrawals
          // 3. print remaining withdrawals
          // 4. return balance
        // First withdrawal, ask for too much money
          // 1. print message/remaining withdrawals
          // 2. return balance
        // Have enough money, but have already passed the max withdrawals
          // 1. print message/remaining withdrawals
          // 2. return balance

        if (this.currentWithdrawals < this.maxWithdrawals) {
            this.currentWithdrawals += 1;
            return super.withdraw(amount);
        }

        System.out.println("No more withdrawals available!");
        return super.balance;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\nTotal number of remaining withdrawals: " + (this.maxWithdrawals - this.currentWithdrawals);
        return output;
    }
}
