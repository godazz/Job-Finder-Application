package main.model;

import DB.DBOperations;

import java.sql.SQLException;

public class JobPoster {


    public static void postNewJob(Job job) throws SQLException {
        String values = String.format("( '%s', '%d', '%s', %d )", job.getTitle(), job.getSalary(), job.getDescription(), user.loggedCompanyIDX);
        // System.out.println(values);
        String query = "insert into job (Title, Salary, Description, C_ID) values " + values;
        DBOperations.Create(query);
    }
}
