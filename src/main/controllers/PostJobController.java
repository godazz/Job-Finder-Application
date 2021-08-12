package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.model.Job;
import main.model.JobPoster;

import java.sql.SQLException;

public class PostJobController {

    @FXML
    TextField jobTitleTextField;

    @FXML
    TextField salaryTextField;

    @FXML
    TextField descriptionTextField;

    @FXML
    Label postStateMessage;


    @FXML
    public void postButtonAction() throws SQLException {

        String jobTitle = jobTitleTextField.getText(),
               jobSalary = salaryTextField.getText(),
               jobDescription = descriptionTextField.getText();

        if (Job.isValid(jobTitle, jobDescription, jobSalary)){
            int salary = Integer.parseInt(jobSalary);
            Job job = new Job (jobTitle, jobDescription, salary);
            JobPoster.postNewJob(job);
            postStateMessage.setText("New Job has been posted successfully");
            postStateMessage.visibleProperty().set(true);
            jobTitleTextField.clear();
            salaryTextField.clear();
            descriptionTextField.clear();
        }else {
            postStateMessage.setText("Incorrect Data");
            postStateMessage.visibleProperty().set(true);
        }



    }

}
