import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

    public static void mainDraw(Graphics graphics){

        int size=(int) (Math.random()*320);
        int smallest=0;
        for(int i=0;i<3;i++) {
            if (i == 0 || size<=smallest) {
                smallest=size;
                squareDrawer(size, graphics);
                size = (int) (Math.random() * 320);
            }
            else
            {
                i--;
                size=(int) (Math.random()*320);
            }
        }
    }
    private static void squareDrawer(int size,Graphics g) {
        g.setColor(new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255)));
        g.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2,size,size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
