package com.company;


public class SavingAccount extends Account  {

    public SavingAccount(double variable, double deposit, double withdraw, String balanceEnquiry) {
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
    @Override
    public String toString (){
        System.out.println("You can save your account with"+getAnnualInterest()+"");
    return null;
    }

}



