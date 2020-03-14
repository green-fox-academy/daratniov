import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int distance=10;
        int sideSize=WIDTH/2;
        while(sideSize%distance!=0) distance--;
        Color color=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        graphics.setColor(color);
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2; j++) {
                for (int k = 0; k <=sideSize/distance; k++) {
                    graphics.drawLine(k*distance+j*sideSize,sideSize,sideSize,(i+1-(i+j)%2)*sideSize+(2*((i+j)%2)-1)*k*distance);
                }
            }
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
