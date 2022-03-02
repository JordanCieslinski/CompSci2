 

public class q2
{
    public static void main(String []  args)
    {
        System.out.println(largerAbsVal(-11,-2 , 7 ));
    }


    public static int largerAbsVal(int a, int b, int c)
    {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);
        int temp = Math.max(absA, absB);
        int max = Math.max(temp, absC);


        return max;



    }
}