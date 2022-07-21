package com.archasmiel.test.lib;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class DrawableComponent {

    public final List<Node> elements = new ArrayList<>();
    public float sizeX, sizeY;
    public float positionX, positionY;
    public Color color;
    public float opacity;


    public DrawableComponent(float sizeX, float sizeY, float positionX, float positionY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
    }



    public abstract void formComponent();




    public void setColor(Color color) {
        this.color = color;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public Color getColor() {
        return color;
    }

    public float getTransparency() {
        return opacity;
    }
}
