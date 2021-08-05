package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
    void addButtonAction() throws SQLException {

        String fname = FnameTextField.getText(),
                lname = LnameTextField.getText(),
                email = emailTextField.getText();

        if (user.isValid(fname,lname,email)){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }


    }
}
