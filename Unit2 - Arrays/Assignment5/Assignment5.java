import java.util.*;
public class Assignment5
{
    
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        oneToTwenty();
        
        int[][] test = {{2,8,3,5},{2,6,3,7},{1,45,3,6},{10,21,21,20}};
        evenOrOddRows(test);
        
        int[][] test1 = {{12,8,3,5},{17,1,3,7}};
        evenOrOddColumns(test1);
                
        String [] name = {"Kobe Bryant","Carmelo Anthony","Lebron James","Chris Paul","Rajon Rondo","Kevin Durant", "Retsim Tseuw"};
        double [][] nums = {{30,20.4},{32,27},{32,21.0625},{24,18.5},{26,17.5},{30,25.4},{30,45.8}};
        totalPoints(name,nums);
        
        System.out.println("Enter the numbers of passengers for your trip: ");
        int people = c.nextInt();
        System.out.println("Enter the numbers of zones for your trip: ");
        int zones = c.nextInt();
        midAmericanFee(people, zones);

    }
    //#1
    public static int[][] oneToTwenty ()
    {
        int [][] arr = new int[5][4];
        int counter = 1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j< arr[0].length; j++)
            {
                arr[i][j] = counter;
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

        return arr;
    }
    //#2a
    public static void evenOrOddRows(int [][] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j< arr[0].length; j++)
            {
                sum += arr[i][j];
            }
            if(sum % 2 ==0)
            {
                System.out.println("Row "+(i+1)+" is even ("+sum+")");
            }
            else
            {
                System.out.println("Row "+(i+1)+" is odd ("+sum+")");
            }
            sum = 0;
        }
    }
    //#2b
    public static void evenOrOddColumns(int [][] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j< arr.length; j++)
            {
                sum += arr[j][i];
            }
            if(sum % 2 ==0)
            {
                System.out.println("Column "+(i+1)+" is even ("+sum+")");
            }
            else
            {
                System.out.println("Column "+(i+1)+" is odd ("+sum+")");
            }
            sum = 0;
        }
    }
    //#3
    public static void totalPoints(String[] name, double [][] arr)
    {
        double points = 0;
        for(int i = 0; i < arr.length; i++)
        {
            points = arr[i][0]*arr[i][1];
            System.out.println(name[i]+" scored "+(int)points+" points");
            points = 0;
        }
    }
    //#4
    public static void midAmericanFee(int people, int zones)
    {
        double arr[][] = {
        {7.50,10.00,12.00,12.75},
        {14.00,18.50,22.00,23.00},
        {20.00,21.00,32.00,33.00},
        {25.00,27.50,36.00,37.00}};
        System.out.println("It will cost $"+(String.format("%.2f",(arr[people-1][zones-1]))+" for your whole party"));
        System.out.println("It will cost $"+(String.format("%.2f",(arr[people-1][zones-1] / people))+" per person"));
    }
}

