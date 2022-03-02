 

import java.util.*;

public class q7
{
    public static void main(String []  args)
    {
        Scanner console = new Scanner(System.in);
        inputBirthday(console);
    }


    public static void inputBirthday(Scanner in)
    {
        System.out.println("On what day of the month were you born?");
        int day = in.nextInt();
        System.out.println("What is the name of the month in which you were born?");
        String month = in.next();
        System.out.println("During what year were you born?");
        int year = in.nextInt();
        System.out.println("You were born on "+month+" "+day+", "+year+". "+"You're Mighty Old!");



    }
}