package edu.uic.cs342.client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClientController {
    @FXML private TextField hostField;
    @FXML private TextField portField;
    @FXML private TextField playerNameField;
    @FXML private Label statusLabel;

    @FXML
    private void handleConnect() {
        // TODO: Validate input and connect on a worker thread.
        // TODO: Never perform blocking socket operations on the JavaFX Application Thread.
        statusLabel.setText("TODO: connect to server");
    }

    @FXML
    private void handlePlay() {
        // TODO: Send the Play request to the server on a worker thread.
    }

    @FXML
    private void handleFold() {
        // TODO: Send the Fold request to the server on a worker thread.
    }

    @FXML
    private void handleNewRound() {
        // TODO: Request a new round from the server.
    }

    @FXML
    private void showGameScreen() throws Exception {
        ClientApp.showScreen("game.fxml", "Three Card Poker — Game");
    }

    @FXML
    private void showResultsScreen() throws Exception {
        ClientApp.showScreen("results.fxml", "Three Card Poker — Results");
    }

    @FXML
    private void showConnectionScreen() throws Exception {
        ClientApp.showScreen("connection.fxml", "Three Card Poker — Connect");
    }
}
