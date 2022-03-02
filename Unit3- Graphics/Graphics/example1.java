import java.awt.*;
public class example1
{
    public static void main(String[] args)
    {
        DrawingPanel frame = new DrawingPanel(800,600);
        Graphics g = frame.getGraphics();

        for(int i = 0; i < 4; i++)
        {
            g.setColor(Color.RED);
            g.fillRect(i*200,i*100,200,100);
            g.setColor(Color.WHITE);
            g.fillOval(i*200,i*100,200,100);
            g.setColor(Color.BLACK);
            g.drawRect(i*200,i*100,200,100);
        }
   
    }
}