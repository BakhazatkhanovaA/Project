package com.company;

public class SavingAccount extends Account  implements Control{

    public SavingAccount(double variable, double deposit, double withdraw, boolean balanceEnquiry) {
        super(variable, deposit, withdraw, balanceEnquiry);
    }
    private double annualInterest;

    public double getAnnualInterest()
    {
        return((getBalance() * getAnnualInterestRate()) / 100);
    }

    private double getAnnualInterestRate() {

        return annualInterest;
    }

}

