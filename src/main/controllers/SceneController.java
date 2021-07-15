package main.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class SceneController {
    private final Scene main;

    public Scene getScene(){
        return main;
    }
    private static SceneController instance;

    public static SceneController getInstance(){
        if (instance ==  null)
            instance = new SceneController();
        return instance;
    }

    private SceneController(){
        this.main = new Scene(new Pane() , 750 , 480);
    }

    public void Set (String fileName){
        try{
            main.setRoot(FXMLLoader.load(getClass().getResource("/resources/fxml/" + fileName +".fxml") ));
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
