package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    public void postButtonAction(){

        String jobTitle = jobTitleTextField.getText(),
               jobSalary = salaryTextField.getText(),
               jobDescription = descriptionTextField.getText();



    }

}
