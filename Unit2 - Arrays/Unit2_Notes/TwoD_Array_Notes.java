import java.util.*;
public class TwoD_Array_Notes
{
    public static void main(String[] args)
    {
        int [][] list = new int[5][3]; //5 rows and 3 columns
        String[][] names = {{"Sarah","Paul"},
                {"Katie", "Eileen"},
                {"McGyver","Wesley"}};
        System.out.println(names[1][1]); //Prints Eileen
        System.out.println(names[2][0]); //Prints McGyver
        //# System.out.println(names[1][2]); //Error (IndexOutOfBounds)

        //#Printing out a 2D Array
        for(int i = 0; i < 3; i++)
        {
            System.out.println(Arrays.toString(names[i]));
        }

        //#Printing out a 2D Array without brackets
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        //To find number of rows
        System.out.println(names.length); //Prints 3
        //To find number of columns
        System.out.println(names[0].length); //Prints 2
        
        System.out.println(numberOfLetters(names));
    }
    //return a 2D array of ints with 4 rows and 3 columns
    //Each element in the array should be a random int from 1 to 10 inclusive
    public static int[][] randomInts()
    {
        int [][] nums = new int [4][3];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[0].length; j++)
            {
                nums[i][j] = (int)(10*Math.random()+1);
            }
        }
        return nums;
    }
    //Print out the number of letters in arr
    public static int numberOfLetters(String[][] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                sum+= arr[i][j].length();
            }
        }
        return sum;
    }
}
