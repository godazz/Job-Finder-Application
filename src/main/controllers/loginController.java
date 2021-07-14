package main.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class loginController implements Initializable {
    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private ImageView brandImageView;

    public void loginButtonAction(ActionEvent event){
        if(usernameTextField.getText().equals("Ahmed") && enterPasswordField.getText().equals("password")){
            System.out.println("Hello world");
        }
        // to do
        // take the username and password and check if they are valid or not
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandImageFile = new File("src/resources/assets/intro.jpg");
        Image brandImage = new Image(brandImageFile.toURI().toString());
        brandImageView.setImage(brandImage);
    }
}
