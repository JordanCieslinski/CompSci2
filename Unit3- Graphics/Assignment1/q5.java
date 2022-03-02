import java.awt.*;

public class q5

{

    public static void main(String [] args)

    {

        constructionCar();

        

    }

    public static void constructionCar()

    {

        DrawingPanel frame = new DrawingPanel(400,400);

        Graphics g = frame.getGraphics();

        

        frame.setBackground(Color.BLACK);

        g.setColor(Color.BLACK);



        g.setColor(Color.RED);

        g.fillOval(50,250,100,100);

        

        g.fillOval(250,250,100,100);



        g.setColor(Color.BLACK);

        g.drawLine(100,0,100,400);

        g.drawLine(0,300,400,300);

        g.drawLine(300,0,300,400);

        

        g.setColor(Color.YELLOW);

        g.fillOval(250,50,100,100);

        

        g.setColor(Color.BLUE);

        

        g.fillRect(100,50,200,200);

    }

}