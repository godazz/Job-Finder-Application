package main.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;
import main.model.user;

import java.sql.SQLException;

public class SignupController {

    @FXML
    private TextField fnameTextField;

    @FXML
    private TextField lnameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Hyperlink Login;

    @FXML
    private Label signupMessage;

    public void loginAction() {
        Login.setOnMouseClicked(e -> {
            SceneController.getInstance().Set("Login");
        });
    }

    public void signupButtonAction() throws SQLException {

        String fname = fnameTextField.getText(),
               lname = lnameTextField.getText(),
               email = emailTextField.getText(),
               password = passwordTextField.getText();

        if (user.isValid(fname,lname,email,password)){
            signupMessage.setText("Signed up successfully! you may log in now");
            signupMessage.setTextAlignment(TextAlignment.LEFT);
        }else {
            signupMessage.visibleProperty().set(true);
        }
    }
    

}
