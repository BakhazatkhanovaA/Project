package com.company;

public class CheckingAccount extends Account {

    public CheckingAccount(int variable, double deposit, double withdraw, String balanceEnquiry) {
        super(variable, deposit, withdraw, balanceEnquiry);
    }

    double overDraft = -500;
//Checking is it possible or not to gain credit
    public void creditLimit(double i) {
        if (i <= 0 && i >= overDraft) {
            withdraw(50);
            System.out.println("The account is overdrawn.");
        } else if (i <= 0 && i <= overDraft) {
            withdraw(20);
            System.out.println("The account is locked until a deposit is made to bring the account up to a positive value.");
        }
    }
    @Override
    public String toString(){
        System.out.println("If this account satisfied to "+creditLimit()+" you can get overdraft!");

        return null;
    }

    private String creditLimit() {
        return "The account is overdrawn";
    }
}



