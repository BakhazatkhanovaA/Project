package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static Database instance;
    private Connection connection;

    private Database() {


        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/mysql", "postgres",
                    "291207");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

    }

    public static Database getInstance() {
        if (Database.instance == null)
            Database.instance = new Database();
        return Database.instance;
    }

    public void getdata(String sql) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("Insert into my.customer values (5,'alya','akhmet','333') ");
            ResultSet resultSet = statement.executeQuery(sql);
            String space = "             ";
            System.out.println("id" + space + "fname" + space + "lname" + space + "password");
            ArrayList<Customer> customer = new ArrayList<Customer>();
            while (resultSet.next()) {
                //System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("id"), resultSet.getString("name"),resultSet.getString("surname")
                //  , resultSet.getString("position"), resultSet.getString("salary"));
                int id = resultSet.getInt("id");
                String name = resultSet.getString("fname");
                String surname = resultSet.getString("lname");
                String position = resultSet.getString("password");
                System.out.println(id + space + name + space + surname + space + position + space);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
