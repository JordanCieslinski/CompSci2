import java.awt.*;
public class example3
{
    public static void main(String[] args)
    {
        DrawingPanel frame = new DrawingPanel(800,600);
        Graphics g = frame.getGraphics();

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 7; j++)
            {
                Font font = new Font("Times New Roman",Font.BOLD, 24);
                g.setFont(font);
                g.drawString("Java",i*120,j*75);
            }
        }

    }
}