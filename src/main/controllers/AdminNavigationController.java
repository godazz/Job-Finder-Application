package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import main.model.Company;
import main.model.user;

import java.io.IOException;
import java.sql.SQLException;

public class AdminNavigationController {

    @FXML
    HBox box;

    @FXML
    void companyInfo () throws IOException, SQLException {
        SceneController.setRightBox( box,"CompanyInfo");
    }

    @FXML
    void addJobPoster () throws IOException {
        SceneController.setRightBox( box,"AddJobPoster");
    }

    @FXML
    void addCompanyAdmin () throws IOException {
        SceneController.setRightBox( box,"AddCompanyAdmin");
    }

}
