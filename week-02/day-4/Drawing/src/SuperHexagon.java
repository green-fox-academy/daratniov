import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int smallHexEdge = 15;
        int superHexEdge = 15;
        int centerx=1366;
        int centery=705;
        graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

        int triangleHeight = (int) (smallHexEdge * Math.sqrt(3) / 2);
        int x = centerx / 2 - smallHexEdge - smallHexEdge * (superHexEdge - 1) * 3 / 2;
        int y = centery / 2 + triangleHeight * (superHexEdge - 1);

        for (int i=0;i < superHexEdge; i++) {
            for (int j = 0; j <superHexEdge+i ; j++) {
                drawOneHexagon(x, y, smallHexEdge, graphics);
                y-=2*triangleHeight;
            }
            x+=smallHexEdge*3/2;
            y+=(2*superHexEdge+2*i+1)*triangleHeight;
        }

        y-=2*triangleHeight;

        for (int i = 0; i <superHexEdge-1 ; i++) {
            for (int j = 0; j <2*superHexEdge-i-2; j++) {
                drawOneHexagon(x, y, smallHexEdge, graphics);
                y-=2*triangleHeight;
            }
            x+=smallHexEdge*3/2;
            y+=(4*superHexEdge-2*i-5)*triangleHeight;
        }
    }

    private static void drawOneHexagon(int x,int y,int smallHexEdge, Graphics graphics) {
        int triangleHeight=(int)(smallHexEdge*Math.sqrt(3)/2);
        graphics.drawLine(x,y,x+smallHexEdge/2,y-triangleHeight);
        graphics.drawLine(x+smallHexEdge/2,y-triangleHeight,x+smallHexEdge*3/2,y-triangleHeight);
        graphics.drawLine(x+smallHexEdge*3/2,y-triangleHeight,x+smallHexEdge*2,y);
        graphics.drawLine(x+smallHexEdge*2,y,x+smallHexEdge*3/2,y+triangleHeight);
        graphics.drawLine(x+smallHexEdge*3/2,y+triangleHeight,x+smallHexEdge/2,y+triangleHeight);
        graphics.drawLine(x+smallHexEdge/2,y+triangleHeight,x,y);
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

