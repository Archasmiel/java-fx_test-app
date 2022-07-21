package com.archasmiel.test.lib.elements;

import com.archasmiel.test.lib.DrawableComponent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Resistor extends DrawableComponent {

    private final float legLength = 10;

    private float borderWidth;
    private boolean drawBorder;


    public Resistor() {
        this(0, 0, 0, 0, 1, Color.BLACK, 1.0f);
    }

    public Resistor(float sizeX, float sizeY) {
        this(sizeX, sizeY, 0, 0, 1, Color.BLACK, 1.0f);
    }

    public Resistor(float sizeX, float sizeY, float positionX, float positionY, float borderWidth, Color color, float opacity) {
        super(sizeX, sizeY, positionX, positionY);
        this.borderWidth = borderWidth;
        this.setColor(color);
        this.setOpacity(opacity);
    }


    @Override
    public void formComponent() {
        this.elements.add(mainBody());
        this.elements.add(leg1());
        this.elements.add(leg2());

    }

    private Rectangle mainBody() {
        Rectangle rect = new Rectangle();
        rect.setWidth(sizeX - 2*legLength);
        rect.setHeight(sizeY);
        rect.setX(legLength);
        rect.setY(0);
        rect.setStroke(color);
        rect.setFill(Color.WHITE);
        rect.setOpacity(opacity);
        rect.setLayoutX(rect.getLayoutX() + positionX);
        rect.setLayoutY(rect.getLayoutY() + positionY);
        return rect;
    }

    private Line leg1() {
        Line line = new Line();
        line.setStartX(0);
        line.setEndX(legLength);
        line.setStartY(sizeY/2);
        line.setEndY(sizeY/2);
        line.setStroke(color);
        line.setOpacity(opacity);
        line.setLayoutX(line.getLayoutX() + positionX);
        line.setLayoutY(line.getLayoutY() + positionY);
        return line;
    }

    private Line leg2() {
        Line line = new Line();
        line.setStartX(sizeX - legLength);
        line.setEndX(sizeX);
        line.setStartY(sizeY/2);
        line.setEndY(sizeY/2);
        line.setStroke(color);
        line.setOpacity(opacity);
        line.setLayoutX(line.getLayoutX() + positionX);
        line.setLayoutY(line.getLayoutY() + positionY);
        return line;
    }

}
