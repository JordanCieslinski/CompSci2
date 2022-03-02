import java.awt.*;

public class q4

{

    public static void main(String [] args)

    {

        DrawingPanel frame = new DrawingPanel(400,400);

        Graphics g = frame.getGraphics();

        

        g.setColor(Color.BLACK);

        g.fillRect(0,0,200,200);

        

        g.setColor(Color.RED);

        g.fillRect(200,0,200,200);

        

        g.setColor(Color.YELLOW);

        g.fillRect(0,200,200,200);

        

        g.setColor(Color.GREEN);

        g.fillRect(200,200,200,200);

        

        g.setColor(Color.BLUE);

        Polygon pl = new Polygon();

        pl.addPoint(200,0);

        pl.addPoint(0,200);     

        pl.addPoint(200,400);

        pl.addPoint(400,200);

        g.fillPolygon(pl);

    }

}