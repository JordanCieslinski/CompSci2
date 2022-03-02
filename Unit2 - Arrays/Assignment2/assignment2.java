import java.util.*;
public class assignment2
{
    public static void main(String [] args)
    {
        //#1
        int [] alpha = new int[50];
        for(int i = 0;i < alpha.length/2; i++)
        {
            alpha[i] = (int)Math.pow(i, 2);
            if(i % 10 == 0 && i!= 0)
            {
                System.out.println();
            }
            System.out.print(alpha[i] + " ");

        }
        for(int i = 25; i< alpha.length; i++)
        {
            alpha[i] = i*3;
            if(i % 10 == 0)
            {
                System.out.println();
            }
            System.out.print(alpha[i]+" ");

        }
        System.out.println();
        //#2
        String [] str1 = {"brilliant", "smart", "intelligent", "bright","knowledgeable", "clever", "sharp", "quick-witted","keen", "intuitive"};
        String [] str2 = {"athletic", "strong", "competitive", "sporty", "muscular", "agile", "fit", "tough", "healthy", "robust"};
        String [] str3 = {"funny","amusing", "humorous","comical","hilarious", "hysterical","silly", "laughable", "entertaining","uproarious"};
        int a = (int)(10*Math.random());
        int b = (int)(10*Math.random());
        int c = (int)(10*Math.random());
        System.out.println("Jordan is a "+str1[a]+", "+str2[b]+", and "+str3[c]+" guy");
        // //#3
         Scanner in = new Scanner(System.in);
        // System.out.println("How many days' temperatures?");
        // int days = in.nextInt();
        // int [] temps = new int[days];
        // double sum = 0;
        // for(int i = 0; i < temps.length; i++)
        // {
            // System.out.println("Day " +(i+1)+"'s high temp:");
            // temps[i] = in.nextInt();
            // sum+= temps[i];
        // }
        // double avg = Double.parseDouble(String.format("%.1f",(sum/days)));
        // System.out.println("Average temp = "+avg);

        // int counter = 0;
        // for(int i = 0; i < temps.length; i++)
        // {
            // if(temps[i] > avg)
            // {
                // counter++;
            // }
        // }
        // System.out.println(counter+ " days were above average");
        // System.out.println("Temperatures: "+Arrays.toString(temps));
        // Arrays.sort(temps);
        // int [] cold = {temps[0],temps[1]};
        // int [] hot = {temps[temps.length-1],temps[temps.length-2]};
        // System.out.println("Two coldest days: "+cold[0]+", "+cold[1]);
        // System.out.println("Two hottest days: "+hot[0]+", "+hot[1]);

        //#4
        System.out.println("Enter how many students took the test");
        int stu = in.nextInt();
        double [] g = new double[stu];
        for(int i = 0; i < stu; i++)
        {
           System.out.println("Enter in the student ID #");
           int id = in.nextInt();
           System.out.println("Enter in their answers");
           String ans = in.next();
           
           int score = 0;
           for(int j = 0; j < ans.length(); j++)
           {
               if(ans.substring(j, j+1).equals("T"))
               {
                   score+=2;
               }
           }
           double grade = ((score/40.0)*100);
           System.out.println("Students: "+id+"  Grade: "+grade+"%");
           g[i] = grade;
        }
        Arrays.sort(g);
        System.out.println("Student scores are "+g[0]+", "+g[1]+", and "+g[2]);
    }
}
