package main.controllers;

import javafx.fxml.Initializable;
import main.model.Job;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BrowseJobController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadJobsData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void loadJobsData() throws SQLException {
        ArrayList<Job> Jobs = new ArrayList<Job>();
        Jobs = Job.fetch();

        for (Job job : Jobs) {
            System.out.println(job.getCompanyName());
        }
    }
}
