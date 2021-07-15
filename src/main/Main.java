package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import main.controllers.SceneController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        SceneController.getInstance().Set("Login");

        primaryStage.setTitle("Job Finder");
        primaryStage.setScene(SceneController.getInstance().getScene());
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
