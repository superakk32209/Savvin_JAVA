package Pr8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

// Абстрактный класс для фигур
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);
}