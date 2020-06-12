package com.company;

public class Account implements Information{
    private double variable;
    private double deposit;
    public double withdraw;
    public String balanceEnquiry;
    public double balance;


    public Account(double variable, double deposit, double withdraw, String balanceEnquiry) {
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

    private void setBalanceEnquiry(String balanceEnquiry) {
        this.balanceEnquiry = balanceEnquiry;

    }

    public String getBalanceEnquiry() {
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

    @Override
    public String opennewbankaccount(double variable) {
        System.out.println("We opened to you  new bank account with this "+variable+" sum! ");
        return null;
    }

    @Override
    public String getViewtransaction(double deposit) {
        System.out.println("We finished with transaction, so you can see your "+deposit+"! ");
        return null;
    }

    @Override
    public String Viewbalance(double balance) {
        System.out.println("At this moment your balance consists "+balance+" !");
        return null;
    }
@Override
    public String toString(){
        return "This "+getBalance()+" is satisfied to our conditions,so it can put this "+variable+"to"+getDeposit()+" ";

}


    }
