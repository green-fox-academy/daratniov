import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int sideOfTriangle =20;
        while (WIDTH%sideOfTriangle!=0) sideOfTriangle--;
        graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        int x=0;
        int y=300;
        int trianglesInOneRow=WIDTH/sideOfTriangle;
        for (int i = 1; trianglesInOneRow!=0; i++,trianglesInOneRow--) {
            {
                for (int j = 0; j < trianglesInOneRow; j++) {
                    drawTriangle(x, y, sideOfTriangle, graphics);
                    x += sideOfTriangle;
                }
                x = i * sideOfTriangle / 2;
                y -= (int) (sideOfTriangle * Math.sqrt(3) / 2);
            }
        }
    }

    private static void drawTriangle(int x,int y,int sideOfTriangle, Graphics graphics) {
        graphics.drawLine(x,y,x+sideOfTriangle,y);
        graphics.drawLine(x+sideOfTriangle,y,x+sideOfTriangle/2,y-(int)(sideOfTriangle*Math.sqrt(3)/2));
        graphics.drawLine(x+sideOfTriangle/2,y-(int)(sideOfTriangle*Math.sqrt(3)/2),x,y);
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

