package main.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class AdminNavigationController {

    @FXML
    HBox box;


    @FXML
    void addJobPoster () throws IOException {
        SceneController.setRightBox( box,"AddJobPoster");
    }

    @FXML
    void addCompanyAdmin () throws IOException {
        SceneController.setRightBox( box,"AddCompanyAdmin");
    }

}
