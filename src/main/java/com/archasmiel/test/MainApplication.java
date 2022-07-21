package com.archasmiel.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application implements EventHandler<ActionEvent> {

    List<Button> buttons = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("MainApplication");

        Group layout = new Group();

        for (int i = 0 ; i < 5 ; i++) {
            Button button = new Button();
            button.setText("Button " + (i + 1));
            button.setTranslateY(50*i);

            button.setOnAction(this);

            layout.getChildren().add(button);
            buttons.add(button);
        }



        Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        buttons.forEach(button -> {
            if (button != actionEvent.getSource()) {
                button.setText("Button changed");
                button.setScaleX(Math.random() * 2);
                button.setScaleY(Math.random() * 2);
            }
        });
    }
}