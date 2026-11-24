package edu.uic.cs342.client;

import java.io.IOException;

/**
 * TODO: Implement the client-side Socket connection and message handling.
 * Keep this class independent of JavaFX controls so it can be substituted in tests.
 */
public class TcpClient {
    public void connect(String host, int port) throws IOException {
        // TODO: Open a Socket. Call this method from a worker thread, not the FX thread.
    }

    public void send(String message) throws IOException {
        // TODO: Send one newline-terminated protocol message.
    }

    public void listen() throws IOException {
        // TODO: Read server messages on a worker thread and notify the UI through a callback.
    }

    public void close() throws IOException {
        // TODO: Close streams and socket.
    }
}
