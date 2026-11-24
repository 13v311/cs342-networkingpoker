package edu.uic.cs342.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServerApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        var url = ServerApp.class.getResource("/edu/uic/cs342/server/server.fxml");
        Parent root = FXMLLoader.load(url);
        var scene = new Scene(root, 760, 520);
        scene.getStylesheets().add(
            ServerApp.class.getResource("/edu/uic/cs342/server/server.css").toExternalForm()
        );
        stage.setTitle("CS 342 — Three Card Poker Server");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
