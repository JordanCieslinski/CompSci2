import java.util.*;
public class Assignment4
{
    public static void main(String[] args)
    {

    }
    //#1
    public static void printStrings(String[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    //#2
    public static void printDoubles(Double[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    //#3
    public static int sumRow(int[][] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr[0].length; i++)
        {
            sum+= arr[0][i];
        }
        return sum;
    }
    //#4
    public static int sumColumn(int[][] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum+= arr[i][0];
        }
        return sum;
    }
    //#5
    public static int numOfElements(boolean[][] arr)
    {
        int num = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                num++;
            }
        }
        return num;
    }
    //#6
    public static boolean checkSquare(String [][] arr)
    {
        int num = 0;
        if(arr.length == arr[0].length)
            return true;
        else
            return false;

    }
    //#7
    public static void randomArray(double[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = (int)(9*Math.random()+1);
            }
        }
    }
    //#8
    public static void frogurt(String[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i][2] = "frogurt";
        }
    }
    //#9
    public static void everyOther(String[][] arr, char ch)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j+=2)
            {
                arr[i][j] = arr[i][j] +ch;
            }
        }

    }
    //#10
    public static boolean isValidIndex(int[][] arr, int row, int column)
    {
        int rowleng = arr.length;
        int columnleng = arr[0].length;
        if(row <= rowleng && column <= columnleng)
            return true;
        return false;
    }
    //#11
    public static void fourCorners(String[][] arr)
    {
        System.out.println(arr[0][0]+ " " + arr[0][arr.length-1] +" " + arr[arr[0].length-1][0]+" "+  arr[arr[0].length-1][arr.length-1]);
    }
    //#12
    public static void printMiddle(int[][] arr)
    {
        if(arr.length % 2 == 0)
            System.out.println("There is no middle row!");
        else if(arr.length % 2 != 0)
        {
            for(int i = 0; i < arr[arr.length / 2].length; i++)
            {
                System.out.print(arr[arr.length / 2][i] +" ");
            }
        }

    }
    //#13
    public static boolean containsBanana(String[][] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; i< arr[0].length; i++)
            {
                if(arr[i][j].equals("banana"))
                return true;
                

            }
        }
        return false;
    }
    //#14
    public static int sumDiagonals(int[][] arr)
    {
        int sum = 0;
        for(int i = arr.length-1; i >= 0 ; i++)
        {
            for(int j = 0; i< arr[0].length; i++)
            {
                sum+= arr[i][j];
            }
        }  
        return sum;
    }
    
    
}

