package com.company;

public class Customer implements Control {
    private String fname;
    private String lname;
    private String pin;


    public Customer(String fname, String lname, String pin) {
        this.fname=fname;
        this.lname=lname;
        this.pin=pin;
    }


    public void Customer1(){
        Customer.setFname("Aruzhan");
        Customer.setLname("Bakhaztkhanova");
        Customer.setPin("1234");
    }
    public void Customer2(){
        Customer.setFname("Aly");
        Customer.setLname("Akhmet");
        Customer.setPin("123");
    }
    public void Customer3(){
        Customer.setFname("Kate");
        Customer.setLname("Anderson");
        Customer.setPin("345");
    }

    @Override
    public void setdelete(String fname) {
        System.out.println("The account "+fname+" deleted,succesfully!Thank you!");

    }

    @Override
    public void setadd(String lname) {
        System.out.println("Our banking system succesfully "+lname+" added to our server!");
    }

    @Override
    public double edit(int pin) {
        System.out.println("We changed your old pin to your new "+pin+" !");
        return 0;
    }
    @Override
    public String toString(){
        return "These customer with name "+fname+"  also changed his pin"+edit(567)+"!";
    }


    public String getFname() {
        return fname;
    }

    public static void setFname(String fname) {
    }

    public String getLname() {
        return lname;
    }

    public static void setLname(String lname) {

    }

    public String getPin() {
        return pin;
    }

    public static void setPin(String pin) {
    }
}
