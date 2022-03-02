
public class Notes
{
    public static void main(String [] args)
    {
        //Example 1
        for(int i = 1; i <= 5; i++) //#controls how many lines are printed
        {
            for(int j = 1; j <= i; j++) //#controls how many characters or numbers are on a specfifc line
            {
                System.out.print(2*i-1); //# What appears on each line
            }
            System.out.println();
        }
        //Example 2
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= -i+5; j++)
            {
                System.out.print(".");
            }
            System.out.println(i);
        }
        ///Example 3
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= -2 * i + 9; j++)
            {
                System.out.print("!");
            }
            System.out.println();
        }
        
        
    }
    //March 12th
    //Example 1
    public static void Example1()
    {
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= (-1*i+5); j++)
            {
                System.out.print(-i*3+13);
            }
            System.out.println();
        }
    }
    //Example 2
    public static void Example2()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= -i+5; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= (i); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
