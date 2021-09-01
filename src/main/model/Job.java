package main.model;

import DB.DBOperations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Job {

    String Title, Description, companyName;
    int Salary;

    public Job(String Title, String Description, int Salary){
        this.Title = Title;
        this.Description = Description;
        this.Salary = Salary;
    }

    public Job() {

    }


    public static boolean isValid (String Title, String Description, String Salary){

        return Title.matches("^[a-zA-Z ]*$") && Salary.matches("[0-9]+") && Description.matches("^[a-zA-Z ]*$");
    }

    public static ArrayList<Job> fetch () throws SQLException {
        ArrayList<Job> Jobs = new ArrayList<Job>();
        String query = "SELECT job.Title, job.Salary, job.Description, company.Name " +
                       "FROM job " +
                       "INNER JOIN company ON job.C_ID = company.ID";

        ResultSet rs = DBOperations.Read(query);

        while (rs.next()){
            Job job = new Job();
            job.Title = rs.getString("Title");
            job.Salary = rs.getInt("Salary");
            job.Description = rs.getString("Description");
            job.companyName = rs.getString("Name");

            Jobs.add(job);
        }

        return Jobs;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return Salary;
    }
}