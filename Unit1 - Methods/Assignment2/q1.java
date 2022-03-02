 

public class q1
{
    public static void main(String []  args)
    {
        System.out.println(largerAbsVal(11,-2 ));
    }


    public static int largerAbsVal(int a, int b)
    {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        return Math.max(absA, absB);



    }
}