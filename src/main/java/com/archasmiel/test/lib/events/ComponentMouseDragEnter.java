package com.archasmiel.test.lib.events;

import com.archasmiel.test.lib.DrawableComponent;
import com.archasmiel.test.lib.elements.Resistor;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public record ComponentMouseDragEnter(DrawableComponent component) implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent mouseEvent) {
        component.elements.forEach(component -> {
            System.out.println(mouseEvent.getX() + " " + mouseEvent.getY());
        });
    }

}
