import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    public static void mainDraw(Graphics graphics) {
        Color[] colorArray={Color.red, Color.orange, Color.yellow, Color.green,
                Color.blue, new Color(29,0,51), new Color(238,130,238)};
        int times=100;
        for (int i = 0; i<times ; i++) {
            rainbow(320/times*(times-i),colorArray[(times-i)%7],graphics);
        }
    }

    private static void rainbow(int size,Color color,Graphics g) {
        g.setColor(color);
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
