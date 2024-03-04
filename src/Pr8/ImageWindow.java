package Pr8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

// Основное окно для изображения
class ImageWindow extends JPanel {
    private final Image image;

    public ImageWindow(String imagePath) {
        image = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}