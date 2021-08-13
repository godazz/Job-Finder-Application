package main.model;

import DB.DBOperations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Company {

    private String Name, HQ, Type;
    private int Size, Founded;

    public static void fetch(int loggedCompanyIDX , Company company) throws SQLException {
        String query = "Select * FROM company WHERE ID =  " + user.loggedCompanyIDX;
        ResultSet rs = DBOperations.Read(query);

        while (rs.next()){
        company.Name = rs.getString("Name");
        company.Size = rs.getInt("Size");
        company.Founded = rs.getInt("Founded");
        company.HQ = rs.getString("HQ");
        company.Type = rs.getString("Type");
        }

    }

    public String getName() {
        return Name;
    }

    public String getHQ() {
        return HQ;
    }

    public String getType() {
        return Type;
    }

    public int getSize() {
        return Size;
    }

    public int getFounded() {
        return Founded;
    }
}
