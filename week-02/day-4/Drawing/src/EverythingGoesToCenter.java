import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class EverythingGoesToCenter {
    public static void mainDraw(Graphics graphics) {
        int distance = 2;
        for (int i = 0; i <=HEIGHT / distance; i++) {
            for (int j = 0; j <=WIDTH/distance; j++) {
                if(i==0 || i==HEIGHT/ distance || j==0 || j==WIDTH/ distance)
                lineDrawer(j*distance, i*distance, graphics);
            }
        }
    }

    private static void lineDrawer(int x, int y, Graphics graphics) {
        graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }


    // Don't touch the code below
    // Sorry, but I had to ;D
    static int WIDTH = 1366;
    static int HEIGHT = 710;

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