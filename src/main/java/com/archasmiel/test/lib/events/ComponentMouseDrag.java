package com.archasmiel.test.lib.events;

import com.archasmiel.test.lib.DrawableComponent;
import com.archasmiel.test.lib.elements.Resistor;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public record ComponentMouseDrag(DrawableComponent component) implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent mouseEvent) {
        float sizeX, sizeY;

        if (component instanceof Resistor res) {
            sizeX = res.sizeX;
            sizeY = res.sizeY;
        } else {
            sizeX = 0;
            sizeY = 0;
        }

        component.elements.forEach(component -> {
            component.setTranslateX(component.getTranslateX() + mouseEvent.getX() - sizeX / 2);
            component.setTranslateY(component.getTranslateY() + mouseEvent.getY() - sizeY / 2);
        });
    }

}
