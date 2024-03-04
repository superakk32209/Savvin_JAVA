package Pr8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class RandomShapesWindow extends JPanel {
    private final int numShapes = 20;
    private final Shape[] shapes;

    public RandomShapesWindow() {
        shapes = new Shape[numShapes];
        Random rand = new Random();
        for (int i = 0; i < numShapes; i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            int width = rand.nextInt(50) + 20;
            int height = rand.nextInt(50) + 20;
            Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            if (i % 2 == 0) {
                shapes[i] = new RectangleShape(color, x, y, width, height);
            } else {
                int radius = width / 2;
                shapes[i] = new CircleShape(color, x, y, radius);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}