import java.util.*;
public class Arrays_With_Methods
{
    public static void main(String[] args)
    {
        //Example #1
        int [] arr = {1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
        //Example #2
        Scanner in = new Scanner(System.in);
        String[] roster = getNames(in);
        System.out.println(Arrays.toString(roster));
        //Example #2
    }
    //To swap the first and last element of list
    public static void swap(int [] list)
    {
        int temp = list[0];
        list[0] = list[list.length-1];
        list[list.length-1] = temp;
    }
    
    public static String[] getNames(Scanner in)
    {
        System.out.println("How many names are there?");
        int num = in.nextInt();
        String[] names = new String[num];
        for(int i = 0; i< names.length; i++)
        {
            System.out.print("Enter in a name: ");
            names[i] = in.next();
        }
        return names;
    }
    //If nums are [2,4,5,6,-1,0] then the mehthod should return 4
    public static int findMinIndex(int[] nums)
    {
        int min = nums[0];
        int minIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < nums[min])
            {
              min = nums[i]; 
              minIndex =i;
            }
        }
        return minIndex;
    }
}
