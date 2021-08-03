package main.model;


import DB.DBOperations;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.util.Pair;

public class user {


    private static final String [] types  = new String[]{"Seeker", "Poster", "Admin"};


    public static Pair<Boolean,String> isValid(String email, String password) throws SQLException {

        String query = "SELECT Email, Password FROM ";
        ResultSet rs ;

        for (int i = 0 ; i<3 ; i++){

            rs = DBOperations.Read(query + types[i]);

            while(rs.next()) {
                if (email.equals(rs.getString("Email")) && password.equals(rs.getString("Password"))){
                    return new Pair <Boolean,String> (true, types[i]);
                }
            }
        }

        return new Pair <Boolean,String> (false, "Not a user");
    }

    public static boolean isValid (String fname, String lname, String email, String password) throws SQLException {

        String query = "SELECT Email FROM ";
        ResultSet rs ;

        for (int i = 0 ; i < 3 ; i++) {

            rs = DBOperations.Read(query + types[i]);

            while (rs.next()) {
                if (email.equals(rs.getString("Email"))) {
                    return false;
                }
            }

        }
        return fname.matches("[a-zA-z]+") && lname.matches("[a-zA-z]+") && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static void Register (String fname, String lname, String email, String password) throws SQLException {
        String values = "( '" + fname + "', '" + lname + "', '" + email + "', '" + password + " ')" ;
        //System.out.println(values);
        String query = "insert into seeker (Fname, Lname, Email, Password) values " + values;
        DBOperations.Create(query);

    }

}

