
public class NestedLoopAssignment
{
    public static void main(String [] args)
    {

    }

    public static void q5()
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    public static void q6()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    public static void q7()
    {
        for(int i = 1; i <= 7; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }   
    }

    public static void q8()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 0; j <= 9; j++)
            {
                for(int k = 1; k <= 3; k++)
                {
                    System.out.print(j);
                }

            }
            System.out.println();
        }   
    }

    public static void q9()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 6; j++)
            {
                System.out.print("\\");
            }
            for(int k = 1; k <= 6; k++)
            {
                System.out.print("/");
            }
            System.out.println();
        }   
    }

    public static void q10()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 5; j >= i; j--)
            {
                System.out.print("-");

            }

            for(int l = 1; l <= i*2-1; l++)
            {
                System.out.print(i*2-1); 
            }

            for(int j = 5; j >= i; j--)
            {
                System.out.print("-");

            }
            System.out.println();
        }   
    }
}

