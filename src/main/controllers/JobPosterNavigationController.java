package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class JobPosterNavigationController {


    @FXML
    HBox box;


    @FXML
    void postNewJob () throws IOException {
        SceneController.setRightBox( box,"PostNewJob");
    }

    @FXML
    void viewApplications () throws IOException {
        //SceneController.setRightBox( box,"ViewApplications");
    }
}
