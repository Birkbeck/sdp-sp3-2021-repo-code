package ch10.sec02;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WebReader extends Application {
    private TextArea message;
    private ExecutorService executor = Executors.newCachedThreadPool();
    
    public void start(Stage stage) {
        message = new TextArea("");
        VBox pane = new VBox(10);
        HBox box = new HBox(10);
        Button read = new Button("Read");
        String url = "http://horstmann.com";
        read.setOnAction(event -> read(url));
        Button quit = new Button("Quit");
        quit.setOnAction(event -> System.exit(0));
        box.getChildren().addAll(read, quit);
        pane.getChildren().addAll(message, box);
        pane.setPadding(new Insets(10));
        stage.setScene(new Scene(pane));
        stage.setTitle("Hello");
        stage.show();
    }

    public void read(String url) {
        Runnable task = () -> {
            try {
                try (Scanner in = new Scanner(new URL(url).openStream())) {
                    while (in.hasNextLine()) {
                        Platform.runLater(() -> 
                            message.appendText(in.nextLine() + "\n"));
                        Thread.sleep(100);
                    }
                }               
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        };
        executor.submit(task);
    }
}