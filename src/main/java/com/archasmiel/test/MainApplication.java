package com.archasmiel.test;

import com.archasmiel.test.lib.events.ComponentMouseDrag;
import com.archasmiel.test.lib.elements.Resistor;
import com.archasmiel.test.lib.events.ComponentMouseDragEnter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application implements EventHandler<ActionEvent> {

    private final List<Node> components = new ArrayList<>();
    private final Stage mainStage = new Stage();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        mainStage.setTitle("MainApplication");
        mainStage.setScene(formScene());
        mainStage.show();

        System.out.println("main window x&y: " + mainStage.getX() + " " + mainStage.getY());
    }

    private Scene formScene() {
        components.clear();
        Group layout = new Group();
        Scene scene = new Scene(layout, 300, 400);


        Resistor res = new Resistor(50, 15, 50, 50, 3, Color.BLACK, 0.7f);
        res.formComponent();
        res.elements.forEach(element -> {
            element.setOnMouseDragged(new ComponentMouseDrag(res));
        });
        components.addAll(res.elements);

        layout.getChildren().addAll(components);
        return scene;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}