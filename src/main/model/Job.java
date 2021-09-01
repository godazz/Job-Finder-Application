package main.model;

import DB.DBOperations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Job {

    String Title, Description, companyName;
    int Salary;

    public Job(String Title, String Description, int Salary){
        this.Title = Title;
        this.Description = Description;
        this.Salary = Salary;
    }



    public static boolean isValid (String Title, String Description, String Salary){

        return Title.matches("^[a-zA-Z ]*$") && Salary.matches("[0-9]+") && Description.matches("^[a-zA-Z ]*$");
    }

    public static void fetch () throws SQLException {
        String query = "SELECT job.Title, job.Salary, job.Description, company.Name " +
                       "FROM job " +
                       "INNER JOIN company ON job.C_ID = company.ID";

        ResultSet rs = DBOperations.Read(query);
    }

}