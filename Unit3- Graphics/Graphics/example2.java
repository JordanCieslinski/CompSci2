import java.awt.*;
public class example2
{
    public static void main(String[] args)
    {
        DrawingPanel frame = new DrawingPanel(800,600);
        Graphics g = frame.getGraphics();

        for(int i = 0; i < 10; i++)
        {
            frame.clear();
            g.fillOval(i*50,i*50,50,50);
            frame.sleep(1000);
        }
   
    }
}