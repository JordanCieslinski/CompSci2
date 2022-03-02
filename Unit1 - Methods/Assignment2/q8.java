 

import java.util.*;

public class q8
{
    public static void main(String []  args)
    {
        Scanner console = new Scanner(System.in);
        processName(console);
    }


    public static void processName(Scanner console)
    {
        System.out.println("Enter your full name");
        String name = console.nextLine();
        System.out.println("Your name in reverse order is "+ name.substring(name.indexOf(" ")+1)+", " +name.substring(0 , name.indexOf(" ")));



    }
}