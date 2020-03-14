import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        int numberOfStars=300;
        for (int i = 0; i <numberOfStars; i++) {
            starDrawer(graphics);
        }
    }

    private static void starDrawer(Graphics graphics) {
        int side=2;
        int color=(int) (Math.random() * 255);
        graphics.setColor(new Color(color,color,color));
        graphics.fillRect((int)(Math.random() * WIDTH-side),(int)(Math.random() * HEIGHT-side), side, side);
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