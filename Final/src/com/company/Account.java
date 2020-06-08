package com.company;

public class Account implements Control{
    private double variable;
    private double deposit;
    public double withdraw;
    public boolean balanceEnquiry;
    public double balance;


    public Account(double variable, double deposit, double withdraw, boolean balanceEnquiry) {
        this.balanceEnquiry = balanceEnquiry;
        this.variable=variable;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    private void setvariable(double variable) {
        this.variable = variable;
    }

    public double getVariable() {
        return variable;
    }

    private void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit() {
        return deposit;
    }
    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    private void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getWithdraw() {
        return withdraw;
    }

    private void setBalanceEnquiry(boolean balanceEnquiry) {
        this.balanceEnquiry = balanceEnquiry;

    }

    public boolean getBalanceEnquiry() {
        return balanceEnquiry;
    }

        public void withdraw(double variable){

            balance = balance - variable;
            setBalance(balance);
        }
        public void deposit( double variable){
            balance = balance + variable;
            setBalance(balance);
        }


    }
