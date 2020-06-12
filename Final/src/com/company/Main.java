package com.company;

public class Main {


        public static void main(String[] args) {
            Customer cus=new Customer("Aruzhan", "Bakhazatkhanova", "12345");
            // System.out.println(cus.getLogin());
            Account account=new Account(500,500,100, "True");
            //cus.CustomerInformation();
            Database rest=Database.getInstance();
            rest.getdata("SELECT * FROM my.customer");
        }
    }


