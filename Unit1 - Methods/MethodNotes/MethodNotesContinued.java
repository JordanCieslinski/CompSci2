import java.util.*;
public class MethodNotesContinued
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(age(console));

        System.out.println(getAverage(console , 4));
    }

    public static String age(Scanner in)
    {
        System.out.println("How old are you?");
        int age = in.nextInt(); //Scanner in = new Scanner(System.in);
        if(age > 65)
        {
            return "Wow, you are mighty old";
        }
        return "Nice!";
    }

    public static double getAverage(Scanner console, int numTests)
    {
        System.out.println("Enter in your " +numTests + " test scores");
        double sum = 0;
        for(int i = 1; i <= numTests; i++)
        {
            sum+=console.nextInt();
        }
        return sum / numTests;
    }
}
