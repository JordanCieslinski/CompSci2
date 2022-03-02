
public class Bonus
{
    public static void main(String[] args)
    {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }
    //# Question 2
    public static String frontTimes(String str, int num)
    {
        String first3 = str.substring(0, 3);
        for(int i = 1; i <= num; i++)
        {
            System.out.print(first3);
        }
        return "";
    }
}
