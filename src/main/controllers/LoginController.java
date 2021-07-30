package main.controllers;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Pair;
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

    @FXML
    private Label loginMessage;

    public void loginButtonAction() throws SQLException {
        String email = emailTextField.getText(),
               password = enterPasswordField.getText();
        Pair<Boolean, String> p =  user.isValid(email, password);
        if (p.getKey()) {
            switch (p.getValue()){
                case "Admin":
                    System.out.println("Admin");
                    break;
                case "Poster":
                    System.out.println("Poster");
                    break;
                case "Seeker":
                    System.out.println("Seeker");
                    break;
            }
        } else {
            loginMessage.visibleProperty().set(true);
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
        loginMessage.visibleProperty().set(false);
    }

}