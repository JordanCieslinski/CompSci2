
public class Questions
{
    public static void main(String[] args)
    {
        victory(4); 
        System.out.println(myMax(6, 2));
        System.out.println(midpoint(3,4,9,20));
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
        System.out.println(myParseInt("56"));
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, true));
        System.out.println(posNeg(-4, -5, true));
        System.out.println(posNeg(0, 5, false));
        System.out.println(close10(8, 11)); 
        System.out.println(close10(13, 8)); 
        System.out.println(close10(13, 7));
        System.out.println(getSlope(5,7,12,14));
        System.out.println(makeAcronym("be right back"));
        System.out.println(isTriangleValid(5, 20, 6));
        System.out.println(isTriangleValid(7, 9, 8));
        seattle();
    }
    //# Question 1
    public static void victory(int j)
    {
        for(int i = 1; i <= j; i++)
        {
            System.out.println("////////////////////");
            System.out.println("||Victory is mine!||");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        }
    }
    //# Question 2
    public static int myMax(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    //# Question 3
    public static String midpoint(int x1, int y1, int x2, int y2)
    {
        double x = x2 - ((x2 - x1) / 2.0);
        double y = y2 - ((y2 - y1) / 2.0);
        String mid = "(" + x + ", " + y + ")";
        return mid;
    }
    //# Question 4
    public static boolean icyHot(int num1, int num2)
    {
        if((num1 < 0 || num2 < 0) && (num1 > 100 || num2 > 100))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //# Question 5
    public static int myParseInt(String num)
    {
        int NUM = Integer.parseInt(num);
        return NUM;
    }
    //# Question 6
    public static boolean posNeg(int num1, int num2, boolean val)
    {
        if(num1 < 0 && num2 > 0 && val == false)
        {
            return true;
        }
        else if(num1 > 0 && num2 < 0 && val == false)
        {
            return true;
        }
        else if(num1 < 0 && num2 < 0 && val == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //# Question 7
    public static int close10(int one, int two)
    {
        if((Math.abs(one - 10)) < (Math.abs(two - 10)))
        {
            return one;
        }
        else if((Math.abs(two - 10)) < (Math.abs(one - 10)))
        {
            return two;
        }
        else
        {
            return 0;
        }
    }
    //# Question 8
    public static double getSlope(int x1, int y1, int x2, int y2)
    {
        double changeY = (y2 - y1);
        double changeX = (x2 - x1);
        double slope = changeY / changeX;
        return slope;
    }
    //# Question 9
    public static String makeAcronym(String phrase)
    {
        String firstChar = phrase.substring(0, 1);
        while(phrase.indexOf(" ") != -1)
        {
            phrase = phrase.substring(phrase.indexOf(" ") + 1);
            firstChar = firstChar + phrase.substring(0, 1);
        }
        return firstChar;
    }
    //# Question 10
    public static boolean isTriangleValid(int side1, int side2, int side3)
    {
        int max = Math.max(Math.max(side1, side2), side3);
        int min = Math.min(Math.min(side1, side2), side3);
        int mid = 0;
        if(max == side1 && min == side2)
        {
            mid = side3;
        }
        else if(max == side1 && min == side3)
        {
            mid = side2;
        }
        else if(max == side2 && min == side1)
        {
            mid = side3;
        }
        else if(max == side2 && min == side3)
        {
            mid = side1;
        }
        else if(max == side3 && min == side1)
        {
            mid = side2;
        }
        else if(max == side3 && min == side2)
        {
            mid = side1;
        }
        
        if((min + mid) > max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //# Question 11
    public static void seattle()
    {
        yellow();
        purple();
        green();
        yellow();
        blue();
        purple();
    }
    
    public static void yellow()
    {
        for(int i = 1; i <= 4; i++)
        {
            System.out.print("            ||            ");
            System.out.println();
        }
    }
    public static void purple()
    {
        System.out.println("         __/||\\__         ");
        System.out.println("      __/:::||:::\\__      ");
        System.out.println("   __/::::::||::::::\\__   ");
        System.out.println("__/:::::::::||:::::::::\\__");
        System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
    }
    public static void green()
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int x = 1; x <= 2 * i - 2; x++)
            {
                System.out.print(" ");
            }
            for(int s = 1; s <= 1; s++)
            {
                System.out.print("\\_");
            }
            for(int j = 1; j <= -2 * i + 13; j++)
            {
                System.out.print("/\\");
            }
            for(int c = 1; c <= 1; c++)
            {
                System.out.print("_/");
            }
            for(int y = 1; y <= 2 * i - 2; y++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void blue()
    {
        for(int i = 1; i <= 16; i++)
        {
            System.out.println("         |%%||%%|         ");
        }
    }
}
