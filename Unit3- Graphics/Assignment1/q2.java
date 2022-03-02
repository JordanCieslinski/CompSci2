import java.awt.*;

public class q2

{

    public static void main(String [] args)

    {

        DrawingPanel frame = new DrawingPanel(400,400);

        Graphics g = frame.getGraphics();

        int count = 4;

        for(int i = 1; i <= 4; i++)

        {

            g.drawRect(i*20,i*20,count*40,count*40);

            count--;

        }

    }

}