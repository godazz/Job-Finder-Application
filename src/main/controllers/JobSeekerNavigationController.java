package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class JobSeekerNavigationController {


    @FXML
    HBox box;


    @FXML
    void browseJobs () throws IOException {
        SceneController.setRightBox( box,"tbd");
    }

    void viewMyApplications () throws IOException {
        SceneController.setRightBox( box,"tbd");
    }
}
