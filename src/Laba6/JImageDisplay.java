package Laba6;

import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * ImageDrawer component
 */
public class JImageDisplay extends JComponent {
    public final BufferedImage picture;

    public JImageDisplay(int width, int height) {
        picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Dimension dimension = new Dimension(width, height);
        super.setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(picture, 0, 0, picture.getWidth(), picture.getHeight(), null);
    }

    /**
     * устанавливаем все пиксели в черный цвет.
     */
    public void clearImage() {
        for (int i = 0; i < picture.getWidth(); i++) {
            for (int j = 0; j < picture.getHeight(); j++) {
                drawPixel(i, j, 0);
            }
        }
    }

    /**
     * устанавливает пиксель в определнный цвет.
     */
    public void drawPixel(int x, int y, int rgbColor) {
        picture.setRGB(x, y, rgbColor);
    }
}