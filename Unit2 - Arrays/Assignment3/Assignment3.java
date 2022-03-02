import java.util.*;
public class Assignment3
{
    public static void main(String[] args)
    {
        int [] list1 = {1, 7, 9, 5, 4, 6, 1, 1};
        System.out.println(mean(list1));

        //#2
        int [] list2 = {1, 7, 9, 5, 4, 6, 1, 1};
        System.out.println(median(list2));
        int [] list3 = {1, 7, 9, 5, 4, 6, 1};
        System.out.println(median(list3));
        //#3
        int[] list4 = {1, 5, 2, 769, 39};
	printAll(list4);  
	//#4
	System.out.println(Arrays.toString(generateArray()));
    }
    //#1
    public static double mean(int [] list)
    {
        double sum = 0.0;
        for(int i = 0; i < list.length; i++)
        {
            sum += list[i];
        }
        return sum/(list.length);

    }
    //#2
    public static double median(int [] arr)
    {
        double med = 0;
        if(arr.length % 2 != 0)
        {
            med = arr[(arr.length/2)];
        }
        else if(arr.length % 2 == 0)
        {

            med = ((arr[(arr.length/2)])+(arr[(arr.length/2)-1]))/2.0;
        }
        return med;
    }
    //#3
    public static void printAll(int [] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            
            if(i != (list.length-1))
            {
                System.out.print(list[i] +", ");
            }
            if(i == (list.length-1))
            {
                System.out.print(list[i]);
            }
        }
        
    }
    //#4
    
    public static int[] generateArray()
    {
        System.out.println();
        int length = (int)(31*Math.random());
        int [] list = new int [length];
        for(int i = 0; i < length; i++)
        {
            list[i] = (int)(110*Math.random()+19);
        }
        return list;
    }
    
    
}
