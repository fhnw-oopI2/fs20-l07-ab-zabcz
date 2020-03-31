package ch.fhnw.oop2.module07.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    @Override public void init() {}


    @Override public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI();

        Scene scene = new Scene(rootPanel);
        primaryStage.setScene(scene);
        primaryStage.setTitle("OOP2: AB 03");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    @Override public void stop() {}

    public static void main(String[] args) {
        Application.launch(args);
    }

}
