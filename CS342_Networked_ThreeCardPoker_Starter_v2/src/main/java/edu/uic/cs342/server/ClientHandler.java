package edu.uic.cs342.server;

import java.net.Socket;

/**
 * Starter type for one connected client.
 * Students should implement Runnable (or an equivalent worker abstraction).
 */
public class ClientHandler {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    // TODO: Read newline-delimited messages from this client.
    // TODO: Interpret requests and invoke server-side game/session logic.
    // TODO: Send responses to this client.
    // TODO: Remove the client from the shared registry when the connection ends.
}
