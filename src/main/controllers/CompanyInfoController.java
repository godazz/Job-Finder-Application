package main.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import main.model.Company;
import main.model.user;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CompanyInfoController implements Initializable {

    @FXML
    Label companyName;

    @FXML
    Label companySize;

    @FXML
    Label companyFounded;

    @FXML
    Label companyType;

    @FXML
    Label companyHQ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadCompanyInformation();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @FXML
    private void  loadCompanyInformation () throws SQLException {

        Company company = new Company();
        Company.fetch(user.loggedCompanyIDX,company);

        companyName.setText(company.getName());
        companySize.setText(Integer.toString(company.getSize()));
        companyFounded.setText(Integer.toString(company.getFounded()));
        companyType.setText(company.getType());
        companyHQ.setText(company.getHQ());

        companyName.visibleProperty().set(true);
        companySize.visibleProperty().set(true);
        companyFounded.visibleProperty().set(true);
        companyType.visibleProperty().set(true);
        companyHQ.visibleProperty().set(true);
    }


}
