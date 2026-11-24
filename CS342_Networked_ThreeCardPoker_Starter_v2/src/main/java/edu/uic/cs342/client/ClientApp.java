package edu.uic.cs342.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientApp extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        showScreen("connection.fxml", "Three Card Poker — Connect");
        stage.show();
    }

    public static void showScreen(String resource, String title) throws Exception {
        Parent root = FXMLLoader.load(
            ClientApp.class.getResource("/edu/uic/cs342/client/" + resource)
        );
        Scene scene = new Scene(root, 760, 540);
        scene.getStylesheets().add(
            ClientApp.class.getResource("/edu/uic/cs342/client/client.css").toExternalForm()
        );
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
