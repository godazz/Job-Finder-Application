package main.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.model.Job;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BrowseJobController implements Initializable {

    private ArrayList<Job> Jobs = new ArrayList<Job>();
    private ObservableList<Job> Jobs2;

    @FXML
    TableView<Job> jobsTable;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadJobsData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        loadTableData();
    }

    private void loadJobsData() throws SQLException {
        Job.fetch(Jobs);


    }

    private void loadTableData() {
        TableColumn<Job, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setMinWidth(121);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));

        TableColumn<Job, String> salaryColumn = new TableColumn<>("Salary");
        salaryColumn.setMinWidth(75);
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        TableColumn<Job, String> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setMinWidth(175);
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("Description"));

        TableColumn<Job, String> companyColumn = new TableColumn<>("Company");
        companyColumn.setMinWidth(113);
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("companyName"));

        Jobs2 = FXCollections.observableArrayList(Jobs);

        jobsTable.setItems(Jobs2);

        jobsTable.getColumns().addAll(titleColumn, salaryColumn, descriptionColumn, companyColumn);
    }
}
