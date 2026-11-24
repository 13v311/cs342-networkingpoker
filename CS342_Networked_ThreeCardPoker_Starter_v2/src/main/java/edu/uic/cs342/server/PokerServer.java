package edu.uic.cs342.server;

/**
 * TODO: Implement the server using ServerSocket.
 * Keep networking independent of JavaFX controller code.
 */
public class PokerServer {
    private final int port;

    public PokerServer(int port) {
        this.port = port;
    }

    public void start() {
        // TODO: Create ServerSocket and accept multiple clients.
        // TODO: Handle each accepted Socket on its own worker thread.
        // TODO: Track connected clients in a shared, thread-safe data structure.
        // TODO: Notify the controller when clients connect/disconnect.
    }

    public void stop() {
        // TODO: Close the listening socket and active client sockets.
    }

    public int getPort() {
        return port;
    }
}
