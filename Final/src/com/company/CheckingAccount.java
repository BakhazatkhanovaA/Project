package com.company;

public class CheckingAccount extends Account  implements Control{

    public CheckingAccount(int variable, double deposit, double withdraw, boolean balanceEnquiry) {
        super(variable, deposit, withdraw, balanceEnquiry);
    }

    double overDraft = -500;

    public void creditLimit(double i) {

        //initializes double variable balance as 0.0
        double balance = 0.0;
        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than $500.");
            balance = balance - 25; }
        else
            balance = balance - i;
    }


}
