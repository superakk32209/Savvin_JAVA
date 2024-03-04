package Pr8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class AnimationWindow extends JPanel {
    private final ImageIcon[] frames;
    private int currentFrame;

    public AnimationWindow(ImageIcon[] frames) {
        this.frames = frames;
        currentFrame = 0;
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
                currentFrame = (currentFrame + 1) % frames.length;
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image frameImage = frames[currentFrame].getImage();
        g.drawImage(frameImage, 0, 0, this);
    }
}
