import java.util.*; //Need to import in order to use methods from Arrays Class
public class Notes
{
    public static void main(String [] args)
    {
        //Create an array of 9 doubles called array
        double[] arr = new double[9];
        //Instantiate an array of 4 integers called list
        int[] list = new int[4]; //[0,0,0,0]
        //Update the first element in the list to be 9
        list[0] = 9; //[9,0,0,0]
        //Change the last element to be 29
        list[3] = 29; //[9,0,0,29]
        //Print out the 2nd element in the array
        System.out.println(list[1]);
        //Print out the array
        System.out.println(Arrays.toString(list));
        //Sort list from smallest to largest
        Arrays.sort(list); //[0,0,9,29]
        String [] roster = {"Alaina","Nick","Lille"};
        //Print out the length of the 3rd element
        System.out.println(roster[2].length()); //Prints 6
        int length = roster.length; //This gives you the size of the array
        String[] a = new String[3]; //[null,null,null]
        //# The deafult for an array from a class is null
        //Using a for loop, print out all the names from roster on different lines
        for(int i = 0; i < roster.length; i++)
        {
            System.out.println(roster[i]);
        }
        //Using a for loop, sum up all the values in a list
        int sum = 0;
        for(int i = 0; i < list.length; i++)
        {
            sum += list[i];
        }
        System.out.println(sum);
        //Using a for loop, add up all te letters in roster
        int sum1 = 0;
        for(int i = 0; i < roster.length; i++)
        {
            sum1 += roster[i].length();
        }
        System.out.println(sum1);
       
        
        
        
        //[1,7,10,6,8,14,22]
    }
}
