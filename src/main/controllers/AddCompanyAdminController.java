package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.model.Admin;
import main.model.user;

import java.sql.SQLException;

public class AddCompanyAdminController {


    @FXML
    TextField FnameTextField;

    @FXML
    TextField LnameTextField;

    @FXML
    TextField emailTextField;

    @FXML
    Label addStateMessage;


    @FXML
    void addButtonAction() throws SQLException {

        String fname = FnameTextField.getText(),
                lname = LnameTextField.getText(),
                email = emailTextField.getText();

        if (user.isValid(fname,lname,email)){
            Admin.addNewAdmin(fname,lname,email);
            addStateMessage.setText("Admin has been added successfully");
            addStateMessage.visibleProperty().set(true);
            FnameTextField.clear();
            LnameTextField.clear();
            emailTextField.clear();
        }else {
            addStateMessage.setText("Incorrect name or email");
            addStateMessage.visibleProperty().set(true);
        }

    }

}
