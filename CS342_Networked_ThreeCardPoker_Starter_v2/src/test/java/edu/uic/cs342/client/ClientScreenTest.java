package edu.uic.cs342.client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/** A small example only; add tests to meet the assignment's minimum of eight. */
class ClientScreenTest extends ApplicationTest {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
            ClientApp.class.getResource("/edu/uic/cs342/client/connection.fxml")
        );
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Test
    void connectionScreenShowsTitle() {
        verifyThat(".title", hasText("Three Card Poker"));
    }

    @Test
    void connectionScreenShowsConnectButton() {
        verifyThat("Connect", hasText("Connect"));
    }
}
