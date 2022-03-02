import java.awt.*;
public class Notes
{
    public static void main(String[] args)
    {
        DrawingPanel frame = new DrawingPanel(800,600);
        Graphics g = frame.getGraphics();
        //DrawingPanel is your canvas, g is the paint brush
        frame.setBackground(Color.YELLOW);
        g.drawLine(0,0,500,400); //(x1,y1,x2,y2)
        g.drawOval(400,300,50,50); 
        g.setColor(Color.BLUE);
        g.fillOval(400,300,50,50);
        //frame.sleep(3000); // 3 seconds
        frame.setBackground(Color.PINK);
        frame.clear();
        g.drawRect(600,200,100,100);
        Color brown = new Color(192,128,64);
        g.setColor(brown);
        Polygon poly = new Polygon();
        poly.addPoint(10,90);
        poly.addPoint(50,10);
        poly.addPoint(90,90);
        g.fillPolygon(poly);
        Font font = new Font("Arial",Font.BOLD, 45);
        g.setFont(font);
        g.setColor(Color.MAGENTA);
        g.drawString("It's Violet!",300,300);
        
        Image fr = frame.loadImage("pmb.jpg");
        g.drawImage(fr,0,0,frame);
    }

}












