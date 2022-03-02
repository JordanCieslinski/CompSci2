 

public class q3
{
    public static void main(String []  args)
    {
        System.out.println(quadrtic(1, -7, 12));
    }


    public static String quadrtic(int a, int b, int c)
    {
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        

        return "Roots are x = "+x1+" and x = "+x2;



    }
}