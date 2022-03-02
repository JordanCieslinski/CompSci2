 

public class q6
{
    public static void main(String []  args)
    {
        vertical("Jordan Cieslinski");
    }


    public static void vertical(String str)
    { 
        String temp = "";
        int j = 0;
        for(int i = 1; i < str.length()+1; i++)
        {
            temp = str.substring(j, i);
            j++;
            System.out.println(temp);
        }        
    }
}