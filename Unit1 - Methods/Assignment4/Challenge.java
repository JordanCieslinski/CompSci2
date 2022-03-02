import java.util.*;
public class Challenge
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        q1(in);
        q2(in);
    }

    public static void q1(Scanner in)
    {
        System.out.println("Enter in how tall the figure is.");
        int height = in.nextInt();
        int length = height*2;
        for(int i = 1; i <= height; i++)
        {
            for(int j = 1; j <= length/2; j++)
            {
                System.out.print("+");
            }
            for(int k = 1; k <= i*2 - 2 && i != 1; k++)
            {
                System.out.print(" ");
            }
            for(int l = 1; l <= length/2; l++)
            {
                System.out.print("+");
            }
            length-=2;
            System.out.println();
        }
    }

    public static void q2(Scanner in)
    {
        System.out.println("Enter in how tall the figure is.");
        int height = in.nextInt();
        
        for(int i = 1; i <= height; i++)
        {
            for(int j = 1; j <= (height-1) / 2; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2 - 2 && i != 1; k++)
            {
                System.out.print("^");
            }
            for(int h =
            for(int l = 1; l <= (height-1) / 2; l++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        System.out.println();
    }
}
/*for(int j = 1; j <= (height-(height-i)) +2 && i !=1; j++)
{
System.out.print("^");
}*/
