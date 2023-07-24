package org.example;

public class Bank {
    public static void main(String[] args) {
        BankAccount standardBankAccount = new BankAccount();
        System.out.println("Starting balance: $" + standardBankAccount.getBalance());

        BankAccount initialDepositBankAccount = new BankAccount(1000);
        System.out.println("Starting balance: $" + initialDepositBankAccount.getBalance());


        double newStandardBalance = standardBankAccount.deposit(500);
//        System.out.println("New balance is: $" + newStandardBalance);

        System.out.println(standardBankAccount);

        initialDepositBankAccount.withdraw(800);
        initialDepositBankAccount.withdraw(800);

        CheckingAccount firstCheckingAccount = new CheckingAccount();
        System.out.println(firstCheckingAccount);

        CheckingAccount initialDepositCheckingAccount = new CheckingAccount(2500);

        initialDepositCheckingAccount.withdraw(100);
        initialDepositCheckingAccount.withdraw(100);
        initialDepositCheckingAccount.withdraw(100);
        initialDepositCheckingAccount.withdraw(100);
        initialDepositCheckingAccount.withdraw(100);
        initialDepositCheckingAccount.withdraw(100);

        System.out.println(initialDepositCheckingAccount);


        SavingsAccount firstSavingsAccount = new SavingsAccount(500, .05);
        System.out.println(firstSavingsAccount);

        firstSavingsAccount.accrueInterest();
        System.out.println(firstSavingsAccount);


    }
}
