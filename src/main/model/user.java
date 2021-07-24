package main.model;

import DB.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class user {

    public static boolean isValid(String email, String password) throws SQLException {
        DB.DBConnection.Connect();
        Statement stmt = DBConnection.conn.createStatement();
        String query = "SELECT Email, password, user_type FROM user";
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()) {
           if (email.equals(rs.getString("Email")) && password.equals(rs.getString("Password"))){
               return true;
           }
        }
        return false;
    }

    public static boolean isValid (String fname, String lname, String email, String password) throws SQLException {
        DB.DBConnection.Connect();
        Statement stmt = DBConnection.conn.createStatement();
        String query = "SELECT Email FROM user";
        ResultSet rs = stmt.executeQuery(query);


        while(rs.next()){
            if (email.equals(rs.getString("Email"))){
                return false;
            }
        }
        return fname.matches("[a-zA-z]+") && lname.matches("[a-zA-z]+") && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    }

}

