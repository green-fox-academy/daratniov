import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int quarterSides=4;
        while(WIDTH%quarterSides!=0) quarterSides--;
        int distance=4;
        while((WIDTH/quarterSides)%distance!=0) distance--;
        for (int i = 0; i <quarterSides ; i++) {
            for (int j = 0; j <quarterSides; j++) {
                drawOneQuarter(j*WIDTH/quarterSides,i*WIDTH/quarterSides,
                        WIDTH/quarterSides, distance, graphics);
            }
        }
    }

    private static void drawOneQuarter(int positionX,int positionY,int width,int distance,Graphics graphics) {
        Color color1=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Color color2=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        for (int i = 1; i <width / distance; i++) {
            graphics.setColor(color1);
            graphics.drawLine(positionX+i*distance,positionY,positionX+width,positionY+i*distance);
            graphics.setColor(color2);
            graphics.drawLine(positionX,positionY+i*distance,positionX+i*distance,positionY+width);
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