package main.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class AdminController {

    @FXML
    HBox box;


    @FXML
    void addJobPoster () throws IOException {
        box.getChildren().set(1, (Node)FXMLLoader.load(getClass().getResource("/fxml/AddJobPoster.fxml")));
    }

    @FXML
    void addCompanyAdmin () throws IOException {
        box.getChildren().set(1, (Node)FXMLLoader.load(getClass().getResource("/fxml/AddCompanyAdmin.fxml")));
    }

}
