import java.awt.*;

public class q3

{

    public static void main(String [] args)

    {

        DrawingPanel frame = new DrawingPanel(400,400);

        Graphics g = frame.getGraphics();



        for(int i = 0; i < 10; i++)

        {

            g.drawRect(5,(i*10)+5,10+(i*10),10);

        }

    }

}