package edu.uic.cs342.server;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ServerController {
    @FXML private TextField portField;
    @FXML private Label statusLabel;
    @FXML private Label clientCountLabel;
    @FXML private ListView<String> clientsList;
    @FXML private TextArea activityArea;

    @FXML
    private void handleStartServer() {
        // TODO: Validate the port and start the TCP server on a background thread.
        statusLabel.setText("TODO: start server");
        log("Server start requested.");
    }

    @FXML
    private void handleStopServer() {
        // TODO: Stop accepting connections and close connected client sockets.
        statusLabel.setText("TODO: stop server");
        log("Server stop requested.");
    }

    /** Call this from any thread when adding a message to the server activity view. */
    public void log(String message) {
        Platform.runLater(() -> activityArea.appendText(message + System.lineSeparator()));
    }

    /** Update the connected-client display from networking threads safely. */
    public void showClients(java.util.List<String> clientNames) {
        Platform.runLater(() -> {
            clientsList.getItems().setAll(clientNames);
            clientCountLabel.setText("Connected clients: " + clientNames.size());
        });
    }
}
