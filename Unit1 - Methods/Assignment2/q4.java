 

public class q4
{
    public static void main(String []  args)
    {
        System.out.println(distance(10, 2, 3, 5));
    }


    public static double distance(int x1, int y1, int x2 , int y2)
    {
        double d = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
        

        return d;



    }
}