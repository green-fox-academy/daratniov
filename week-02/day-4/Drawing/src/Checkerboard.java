import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        int number=8;
        while(WIDTH%number!=0) number--;
        int side=WIDTH/number;
        Color color1=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Color color2=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Color color;
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number ; j++) {
                if((i+j)%2==0) color=color1;
                else color=color2;
                drawRectangle(i*side,j*side,side,color,graphics);
            }
        }
    }

    private static void drawRectangle(int x,int y,int side,Color color,Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x,y,side,side);
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