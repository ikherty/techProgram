package grafic2dtest;

/**
 *
 * @author qw
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
 
public class Graphics2dTest extends JFrame {
 
    public Graphics2dTest() {
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Integer x1=400, x2=500, x3=650, x4=750;
        Integer y1=50,y2=200, y3=400;
        g2d.drawLine(x1, y1, x2, y1-15);//(1-2)
        g2d.drawLine(x3, y1-15, x4, y1+15);//(3-4)
        g2d.drawLine(x2, y1-15, x2, y2);//(2-5)
        g2d.drawLine(x1, y1, x1, y3+30);//(1-7)
        g2d.drawLine(x2, y2+70, x2, y3+10);//(11-8)
        g2d.drawLine(x2, y2, x3, y1-15);//(5-3)
        g2d.drawLine(x3-60, y2+30, x4, y1+15);//(6-4)
        
        g2d.drawLine(x3-60, y2+30, x4-20, y3-10);//(6-10)
        g2d.drawLine(x2, y2+70, x3-10, y3+30);//(11-9)
        g2d.drawLine(x3-10, y3+30, x4-20, y3-10);//(9-10)
        g2d.drawLine(x1, y3+30, x2, y3+10);
        //g2d.draw(new Line2D.Double(100.2d, 99.8d, 419.1d, 99.8d));
    }
 
    public void paint(Graphics g) {
        drawLines(g);
    }
 
    public static void main(String[] args) {
        new Graphics2dTest().setVisible(true);
    }
}