import java.util.*;
public class Assignment1
{
    public static void main(String [] args)
    {
        //#1
        int [] num = new int[100];
        for(int i = 0; i< num.length; i++)
        {
            num[i] = (int)(10*Math.random()+1);
        }
        //#2
        String [] names = {"Catie", "Natalie", "Lisa"};
        for(int i = 0; i< names.length; i++)
        {
            System.out.println(names[i]);
        }
        for(String j: names)
        {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(names));
        //#3
        for(int i = names.length-1; i >= 0; i--)
        {
            System.out.println(names[i]);
        }
        //#4
        int[] nums = {3,5,2,9,7,4,1};
        for(int i = 0; i < nums.length; i+= 2)
        {
            System.out.println(nums[i]);
        }
        //#5
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //#6
        int min = nums[0];
        int max = nums[nums.length-1];
        int med = nums.length / 2;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        double avg = sum / nums.length;
        System.out.println(min);
        System.out.println(max);
        System.out.println(med);
        System.out.println(avg);

        //#7
        int [] num1 = new int[10];
        boolean var = true;
        for(int i = 0; i < num1.length -1; i++)
        {
            num1[i] = (int)(11*Math.random()+5);
            if(num1[i] == 9)
            {
                System.out.println("The index value is "+ i);
                var = false;
            }

        }
        if(var == true)
            System.out.println("The number 9 is not in the array" );
            
        //#8  
        int [] num2 = new int[5];
        int count = 0;
        for(int i = 0; i < num2.length -1; i++)
        {
            num2[i] = (int)(20*Math.random());
            if(num2[i] < 5)
            {
                count++;
            }
            
        }
        System.out.println(count);
        
        //#9
        int [] switchy = {3,5,2,9,7,4,1};
        int switch_num = switchy[0];
        int switch_num2 = switchy[6];
        switchy[0] = switch_num2;
        switchy[6] = switch_num;
        
        //#10
        String [] str = {"hello", "hi", "draw", "computer", "science"};
        String big = "";
        for(int i = 0; i < 5; i++)
        {
            if(str[i].length() > big.length())
                big = str[i];
        }
        System.out.println("The Longest String is " +big);
        
        //#11
        for(int i = 0; i < 3; i++)
        {
            System.out.print(names[i].toUpperCase()+ " ");
        }
        System.out.println();
        //#12
        int [] avgRandom = new int[10];
        int sum12 = 0;
        int counter = 0;
        for(int i: avgRandom)
        {
            i = (int)(100*Math.random()+1);
            sum12 += i;
            avgRandom[counter] = i;
            counter++;
        }
        System.out.println(Arrays.toString(avgRandom));
        System.out.println("The Average is "+ sum12/avgRandom.length);
        
        //#13
        String [] concatenate = {"Hello", "my","name","is","Jordan"};
        String concat = "";
        for(int i = 0; i < concatenate.length; i++)
        {
            concat = concat+" "+concatenate[i];
        }
        System.out.println(concat);
        
        //#14
        int [] fiveInts = {5, 7, 9, 12,2};
        Arrays.sort(fiveInts);
        for(int i = fiveInts.length-1; i >= 0; i--)
        {
            System.out.print(fiveInts[i]+ " ");
        }
        System.out.println();
        //#15 
        double[] gpas = new double[10];
        for(int i = 0; i < gpas.length; i++)
        {
            gpas[i] = 4*Math.random();
        }
        String [] topGpas = new String[3];
        Arrays.sort(gpas);
        topGpas[0] = String.format("%.2f",gpas[9]);
        topGpas[1] = String.format("%.2f",gpas[8]);
        topGpas[2] = String.format("%.2f",gpas[7]);
        System.out.println(Arrays.toString(topGpas));
    }
}

