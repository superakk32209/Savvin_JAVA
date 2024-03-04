package Pr8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
