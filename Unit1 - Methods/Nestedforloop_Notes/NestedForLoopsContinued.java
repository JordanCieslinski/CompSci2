public class NestedForLoopsContinued
{
    public static void main(String [] args)
    {
        
    }
    
    public static void q5()
    {
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= 2*i; j++)
            {
                System.out.print("M ");
            }
            System.out.println();
        }
    }
    public static void q6()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 6-i; j++)
            {
                System.out.print(i);
            }
            for(int k = 1; k <= 4+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void q7()
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.print((j*i)+"    ");
            }

            System.out.println();
        }
    }
}
