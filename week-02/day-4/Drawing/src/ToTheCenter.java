import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
    public static void mainDraw(Graphics graphics) {
        for(int i=0;i<3;i++) {
            lineDrawer((int) (Math.random()*320),(int) (Math.random()*320),graphics);
        }
    }

    private static void lineDrawer(int x,int y,Graphics g) {
        g.setColor(new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255)));
        g.drawLine(x,y,WIDTH/2,HEIGHT/2);
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