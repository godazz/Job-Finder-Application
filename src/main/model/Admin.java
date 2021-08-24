package main.model;

import DB.DBOperations;

import java.sql.SQLException;

public class Admin {

     public static void addNewAdmin(String fname, String lname, String email) throws SQLException {
        String values = String.format("( '%s', '%s', '%s', 'password', %d )", fname, lname, email, user.loggedCompanyIDX);
        //System.out.println(values);
        String query = "insert into admin (Fname, Lname, Email, Password, C_ID) values " + values;
        DBOperations.Create(query);
    }

    public static void addNewJobPoster(String fname, String lname, String email) throws SQLException {
        String values = String.format("( '%s', '%s', '%s', 'password', %d )", fname, lname, email, user.loggedCompanyIDX);
        //System.out.println(values);
        String query = "insert into poster (Fname, Lname, Email, Password, C_ID) values " + values;
        DBOperations.Create(query);
    }



}
