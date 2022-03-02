public class q1
{
    public static void main(String [] args)
    {

    }

    public static void q1()
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j<= 5; j++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void q2()
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 7; j>= 1; j--)
            {
                for(int k = 1; k<= 2; k++)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void q3()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j<= 4; j++)
            {
                System.out.print("^%$");

            }
            System.out.println();
        }
    }
    public static void q4()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 6-i; j++)
            {
                System.out.print("() ");

            }
            System.out.println();
        }
    }
    public static void q5()
    {
        System.out.println(1);
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= i+1; j++)
            {
                System.out.print((int)Math.pow(5, i));

            }
            System.out.println();
        }
    }
    public static void q6()
    {
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print((int)Math.pow(2 , -i+7));
            }
            System.out.println();
        }
    }

    public static void q7()
    {
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= -i+6; j++)
            {
                System.out.print("0");
            }
            for(int k = 1; k <= (i); k++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void q8()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("[]");
            }
            for(int k = 1; k <= (i*-4+14); k++)
            {
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
    }

    public static void q9()
    {
        for(int i = 1; i <= 7; i++)
        {
            System.out.print(i + " ");
            for(int j = 1; j <= -i+10; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q10()
    {
        for(int i = 0; i <= 7; i++)
        {
            System.out.print(i + " ");
            for(int j = 1; j <= 10 && i !=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q11()
    {
        for(int i = 3; i >= 1; i--)
        {
            for(int j = 9; j >= 0; j--)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void q12()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= -i +5; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1; k++)
            {
                System.out.print("*");
            }
            for(int l = 1; l <= -i +5; l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void q13()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= -i +5; j++)
            {
                System.out.print(".");
            }
            System.out.print(i);
            for(int k = 1; k <= i - 1; k++)
            {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
