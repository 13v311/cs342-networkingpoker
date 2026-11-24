# CS 342 — Project 3: Networked Three Card Poker (Starter)


## Requirements
- JDK 25
- Maven 3.9+
- JavaFX 25.0.4 (resolved by Maven)

## Run the server JavaFX application
From this directory:
```bash
mvn clean compile exec:java -Dexec.mainClass=edu.uic.cs342.server.ServerApp
```

## Run the client JavaFX application
In a second terminal:
```bash
mvn compile exec:java -Dexec.mainClass=edu.uic.cs342.client.ClientApp
```

## Run client TestFX tests
```bash
mvn test
```

## What is provided
- One Maven project, not a multi-module architecture.
- Java 25 and JavaFX 25.0.4 dependencies.
- FXML and CSS resource folders.
- A basic JavaFX server dashboard layout.
- Three basic client FXML screens: Connection, Game, and Results.
- Minimal application and controller class definitions.
- Empty starter networking class definitions and TODO markers.
- JUnit Jupiter and TestFX dependencies with one simple UI smoke test.

## What you are expected to design and implement
- TCP server startup, accept loop, client worker threads, and shutdown.
- TCP client connection, background reads/writes, and disconnect handling.
- The shared connected-client data structure and its thread-safety strategy.
- The communication protocol.
- Player/session state and all Three Card Poker rules.
- Server dashboard updates and connected-client display.
- Client navigation, game interaction, and rendering of server messages.
- At least eight meaningful TestFX tests of the client application.


## Suggested first steps
1. Run both JavaFX applications and inspect the FXML/CSS.
2. Complete the server socket lifecycle.
3. Design the protocol and client registry.
4. Add per-client worker threads and safe UI updates using `Platform.runLater`.
5. Implement player sessions and game rules on the server.
6. Connect the client screens to server messages.
7. Add the required TestFX tests.

