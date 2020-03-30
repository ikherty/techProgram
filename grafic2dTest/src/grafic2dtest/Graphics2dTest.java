package grafic2dtest;

/**
 *
 * @author qw
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

public class Graphics2dTest extends JFrame {

    public Graphics2dTest() {
        setSize(780, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void drawK(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Integer x1 = 400, x2 = 500, x3 = 650, x4 = 750;
        Integer y1 = 50, y2 = 200, y3 = 400;
        g2d.drawLine(x1, y1, x2, y1 - 15);//(1-2)
        g2d.drawLine(x3, y1 - 15, x4, y1 + 15);//(3-4)
        g2d.drawLine(x2, y1 - 15, x2, y2);//(2-5)
        g2d.drawLine(x1, y1, x1, y3 + 30);//(1-7)
        g2d.drawLine(x2, y2 + 70, x2, y3 + 10);//(11-8)
        g2d.drawLine(x2, y2, x3, y1 - 15);//(5-3)
        g2d.drawLine(x3 - 60, y2 + 30, x4, y1 + 15);//(6-4)

        g2d.drawLine(x3 - 60, y2 + 30, x4 - 20, y3 - 10);//(6-10)
        g2d.drawLine(x2, y2 + 70, x3 - 10, y3 + 30);//(11-9)
        g2d.drawLine(x3 - 10, y3 + 30, x4 - 20, y3 - 10);//(9-10)
        g2d.drawLine(x1, y3 + 30, x2, y3 + 10);
        g2d.drawLine(x1, y3 + 30, x2, y3 + 10);
    }

    void drawGear(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //g2d.setColor(Color.yellow);  
        Arc2D innerArc = new Arc2D.Double(250, 180, 320, 320, 100, 360, 0);//(int x, int y, int width, int length, int startAngle, int arcAngle)
        Arc2D outerArc = new Arc2D.Double(210, 140, 400, 400, 98, 240, 0);
//        Line2D lineUp = new Line2D.Double(outerArc.getStartPoint(),innerArc.getStartPoint());
//        Line2D lineDown = new Line2D.Double(outerArc.getEndPoint(), innerArc.getEndPoint());
//        g2d.draw(lineDown);
//        g2d.draw(lineUp);
        Area circleArea = new Area(outerArc);
        Rectangle2D rect = new Rectangle2D.Double(outerArc.getStartPoint().getX(),outerArc.getStartPoint().getY(), 200,200);
        circleArea.subtract(new Area(innerArc));
        circleArea.subtract(new Area(rect));
        g2d.fill(circleArea);

        Point2D point = new Point2D.Double(outerArc.getCenterX(), outerArc.getCenterY());
        Polygon pol = new Polygon(new int[]{350, 370, 450, 470,}, new int[]{150, 40, 40, 150}, 4);
        Area a1 = new Area(pol);
        Rectangle r = a1.getBounds();
        AffineTransform at = g2d.getTransform();//new AffineTransform();
        AffineTransform atClone = (AffineTransform) at.clone();
        AffineTransform zero = AffineTransform.getRotateInstance(0);
        for (int i = 1; i < 6; i++) {
            at.rotate(-Math.toRadians(45), outerArc.getCenterX(), outerArc.getCenterY());
            g2d.setTransform(at);
            g2d.fill(a1);
        }
    }

    public void paint(Graphics g) {
        drawK(g);
        drawGear(g);
    }

    public static void main(String[] args) {
        new Graphics2dTest().setVisible(true);
    }

}
