import java.util.*;
/**
 * Write a description of class dwada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dwada
{
    public static void main(String [] args)
    {
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 1; i < list.length; i++) 
        {
            list[i] = list[i] + (list[i] / list[0]);
        }
        System.out.println(Arrays.toString(list));
    }

}
