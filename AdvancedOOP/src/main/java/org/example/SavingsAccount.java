package org.example;

public class SavingsAccount extends BankAccount {
    private double interestRate;  // default value = .01


    public SavingsAccount() {
        super();
        this.interestRate = .01;
    }

    public SavingsAccount(double balance) {
        super(balance);
        this.interestRate = .01;
    }

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double accrueInterest() {
        double interestAccrued = this.balance * this.interestRate;
        this.setBalance(this.balance + interestAccrued);
        return interestAccrued;
    }
}
