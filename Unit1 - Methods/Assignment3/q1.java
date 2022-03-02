import java.util.*;
public class q1
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        // System.out.println(rectangleCount(9, 10, 3, 7));
        // testRectangleCount(scan);
        // System.out.println(cubeCount(10,50));
        // printStars(5);
        // System.out.println(validGamerTag("3bobjones"));
        // System.out.println(makeGamerTag("Bob", 27 , 3));
        System.out.println(evaluateOperation(3.5, 6.8, "+"));
        System.out.println(parseExpression("5 * 3.2"));
        startMathConsole(scan);
    }

    public static int rectangleCount(int smallW, int smallL,int largeW, int largeL)
    {
        int smallArea = smallW*smallL;
        int largeArea = largeW*largeL;
        return largeArea/smallArea;
    }

    public static void testRectangleCount(Scanner scan)
    {
        System.out.println("What is the small rectangle width?");
        int smallW1 = scan.nextInt();
        System.out.println("What is the small rectangle length?");
        int smallL1 = scan.nextInt();
        System.out.println("What is the large rectangle width?");
        int largeW1 = scan.nextInt();
        System.out.println("What is the large rectangle length?");
        int largeL1 = scan.nextInt();
        System.out.println(rectangleCount(smallW1, smallL1, largeW1, largeL1)+" "+smallW1+" x "+smallL1+" rectangles can fit into a "+largeW1+" x "+largeL1+" rectangle");
    }

    public static int cubeCount(int smallCube, int largeCube)
    {
        double volS = Math.pow(smallCube , 3);
        double volL = Math.pow(largeCube , 3);
        int num = (int)(volL/volS);
        return num;
    }

    public static void printStars(int num)
    {
        int num1 = num;
        for(int j = 1; j <=num1; j++)
        {
            for(int i = 1; i <= num; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            num--;
        }
    }

    public static boolean validGamerTag(String name)
    {
        int length = name.length();
        char first = name.charAt(0);
        boolean firstIsLetter = Character.isLetter(first);
        if(length <= 15 && firstIsLetter == true)
        {
            return true;
        }
        else if(length > 15 && firstIsLetter == true)
        {

            return false;

        }
        else if(length <= 15 && firstIsLetter == false)
        {
            return false;

        }
        else
            return false;
    }

    public static String makeGamerTag(String n, int tag, int numXs)
    {
        String x = "";
        for(int i = 1; i <= numXs; i++)
        {
            x = x+"x";
        }
        String newTag = x+n+tag+x;

        if (validGamerTag(newTag) == true)
        {
            return newTag;
        }
        else
            return "Invalid Gamertag: Too many characters!";
    }

    public static double evaluateOperation(double num1 , double num2 , String op)
    {
        double ans = 0;
        if(op.equals("+"))
        {
            return num1 + num2;
        }
        else if(op.equals("-"))
        {
            return num1 - num2;
        }
        else if(op.equals("*"))
        {
            return num1 * num2;
        }
        else if(op.equals("/"))
        {
            return num1 / num2;
        }
        else 
            return 0.0;
    }

    public static double parseExpression(String eqn)
    {
        int space1 = eqn.indexOf(" ");
        int space2 = eqn.lastIndexOf(" ");
        String op1 = eqn.substring(space1, space2);
        String op = op1.substring(1);
        double num1 = Double.parseDouble(eqn.substring(0, space1));
        double num2 = Double.parseDouble(eqn.substring(space2));
        return evaluateOperation(num1, num2 , op);
    }

    public static void startMathConsole(Scanner scan)
    {
        System.out.println("Welcome to the Interactive Math Console");
        String eqn1 = scan.nextLine();
        if(eqn1.equals("Done"))
        {
            System.out.println("Thanks for playing!");
        }
        else if(!eqn1.equals("Done"))
        {
            System.out.println(parseExpression(eqn1));
        }
    }
}