package ch03.sec04;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

// From the command line, you can run this program as
// java ch03.sec04.ButtonDemo
// even though it has no main method

public class ButtonDemo extends Application {
    public void start(Stage stage) {

        Button button = new Button("Ok");
        button.setOnAction(event -> 
            System.out.println("Thanks for clicking!"));

        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(button, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}