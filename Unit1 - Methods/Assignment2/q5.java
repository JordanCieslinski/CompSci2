 

public class q5
{
    public static void main(String []  args)
    {
        System.out.println(scientific(1.9, -2));
    }


    public static double scientific(double num , int exp)
    {   
        return num*(Math.pow(10 , exp));
    }
}