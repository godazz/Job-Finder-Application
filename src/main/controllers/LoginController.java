package main.controllers;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.model.user;
import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private ImageView brandImageView;

    @FXML
    private Hyperlink signUp;

    public void loginButtonAction() throws SQLException {
        String email = emailTextField.getText(),
               password = enterPasswordField.getText();

        if (user.isValid(email, password)) {
            System.out.println("Hello world Validated");
        } else {
            System.out.println("Not Validated");
        }

    }

    public void signUpAction() {
        signUp.setOnMouseClicked(e -> {
            SceneController.getInstance().Set("Signup");
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandImageFile = new File("src/resources/assets/brand.jpg");
        Image brandImage = new Image(brandImageFile.toURI().toString());
        brandImageView.setImage(brandImage);
    }

}