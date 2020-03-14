import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {

        int side=15;
        int xy=side;
        for (int i = 0; i <19 ; i++) {
            drawSquare(xy,side,graphics);
            xy+=side;
        }
    }

    private static void drawSquare(int xy,int side,Graphics graphics) {
        graphics.setColor(new Color(128,0,128));
        graphics.fillRect(xy,xy,side,side);
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
