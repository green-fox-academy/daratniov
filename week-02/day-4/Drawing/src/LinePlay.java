import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int distance=20;
        while(WIDTH%distance!=0) distance--;
        Color color1=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Color color2=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        for (int i = 1; i <WIDTH / distance; i++) {
            graphics.setColor(color1);
            graphics.drawLine(i*distance,0,WIDTH,i*distance);
            graphics.setColor(color2);
            graphics.drawLine(0,i*distance,i*distance,HEIGHT);
        }
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