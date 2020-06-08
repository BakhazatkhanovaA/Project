package com.company;

public class Loan extends Account  implements Control{
    private double interestRate;
    private double amount;
    private double duration;

    public Loan(double variable, double deposit, double withdraw, boolean balanceEnquiry) {
        super(variable, deposit, withdraw, balanceEnquiry);
    }

public void withdraw(double amount){

        super.withdraw(amount+5);
}
    }

