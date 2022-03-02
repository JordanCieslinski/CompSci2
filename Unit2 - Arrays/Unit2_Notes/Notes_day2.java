import java.util.*;
public class Notes_day2
{
    public static void main (String [] args)
    {
       //Create an array of 5 integers called nums
       int [] nums = new int[5];
       //Update the 3rd element to be 39
       nums[2] = 39; // [0,0,39,0,0]
       //Update index 1 to be 9
       nums[1] = 9;
       //Print out the length of nums
       System.out.println(nums.length);
       //Print out the last element of the array
       System.out.println(nums[nums.length - 1]);
       //Print out the nums
       System.out.println(Arrays.toString(nums));
       //Sort the array
       Arrays.sort(nums); // [0,0,0,9,39]
       //Take an array of doubles called cow which stores 9,9.9,6.46
       double [] cow = {9,9.9,6.46};
       //Using  for loop, print out cow on one line with spaces 
        for(int i = 0; i < cow.length; i++)
        {
            System.out.print(cow[i] + " ");
       }
        //Using for loop, update every element in cow by 2
       for(int i = 0; i < cow.length; i++)
        {
            cow[i] += 2;
        }
       
       //# Enhanced For Loops
       for(double j : cow)
       {
           System.out.print(j+ " ");
       }
       //#Drawbacks
       //#1) Enhanced for loop goes through the whole array
       //#2) Cannot update an element from an array
    }
}
