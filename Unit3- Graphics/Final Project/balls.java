import java.awt.*;

import java.util.*;



public class balls

{

    public static void drawGame(Graphics g, DrawingPanel frame, Image board,int ballHitStripe, int ballHitSolid)

    {

        Color darkGreen = new Color(2, 94, 11);

        Color brown = new Color(69, 52, 2);

        Color orange = new Color(227, 110, 0);



        //String [] arr = {"","Yellow Stripe","Red Stripe","Orange Stripe","Purple Stripe","Blue Stripe","Brown Stripe","Green Stripe"};

        ArrayList<String> listOfStripes = new ArrayList<String>();

        listOfStripes.add("");

        listOfStripes.add("Yellow Stripe");

        listOfStripes.add("Red Stripe");

        listOfStripes.add("Blue Stripe");

        listOfStripes.add("Brown Stripe");

        listOfStripes.add("Green Stripe");

        listOfStripes.add("Orange Stripe");

        listOfStripes.add("Purple Stripe");



        switch(ballHitStripe)

        {

            case 0:

                break;



            case 1:

                listOfStripes.set(1,"");

                break;



            case 2:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                break;



            case 3:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                break;



            case 4:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                break;



            case 5:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                break;



            case 6:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                listOfStripes.set(6,"");

                break;



            case 7:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                listOfStripes.set(6,"");

                listOfStripes.set(7,"");

                break;



        }



        for(int i = 1; i < listOfStripes.size(); i++)

        {



            switch (i)

            {

                case 1: //"Yellow Stripe"

                    if((listOfStripes.get(1)).equals("Yellow Stripe"))

                    { 

                        g.setColor(Color.YELLOW);

                        g.drawOval(1100,570,20,20);



                        break;

                    }

                    else 

                    {

                        break;

                    }



                case 2: //"Red Stripe":

                    if((listOfStripes.get(2)).equals("Red Stripe"))

                    {  g.setColor(Color.RED);

                        g.drawOval(180,180,20,20);



                        //# + , +

                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 3: // "Blue Stripe":

                    if((listOfStripes.get(3)).equals("Blue Stripe"))

                    {  g.setColor(Color.BLUE);

                        g.drawOval(140,560,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 4://"Brown Stripe":

                    if((listOfStripes.get(4)).equals("Brown Stripe"))

                    {  g.setColor(brown);

                        g.drawOval(286,435,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 5: //"Green Stripe":

                    if((listOfStripes.get(5)).equals("Green Stripe"))

                    {   g.setColor(darkGreen);

                        g.drawOval(630,160,20,20);



                        //# / , -

                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 6: //"Orange Stripe":

                    if((listOfStripes.get(6)).equals("Orange Stripe"))

                    {  g.setColor(orange);

                        g.drawOval(730,300,20,20);



                        //# + , -

                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 7:  //"Purple Stripe":

                    if((listOfStripes.get(7)).equals("Purple Stripe"))

                    {  g.setColor(Color.MAGENTA);

                        g.drawOval(660,620,20,20);



                        //# + , -

                        break;

                    }

                    else

                    {

                        break;  

                    }



            }

        }



        /*# SOLIDS

         * 

         * 

         * 

         * 

         * 

         * 

         * 

         * 

         * 

         */



        ArrayList<String> listOfSolids = new ArrayList<String>();

        listOfSolids.add("");

        listOfSolids.add("Blue Solid");

        listOfSolids.add("Green Solid");

        listOfSolids.add("Brown Solid");

        listOfSolids.add("Purple Solid");

        listOfSolids.add("Orange Solid");

        listOfSolids.add("Yellow Solid");

        listOfSolids.add("Red Solid");



        switch(ballHitSolid)

        {

            case 0:

                break;



            case 1:

                listOfSolids.set(1,"");

                break;



            case 2:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                break;



            case 3:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                break;



            case 4:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                break;



            case 5:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                break;



            case 6:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                listOfSolids.set(6,"");

                break;



            case 7:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                listOfSolids.set(6,"");

                listOfSolids.set(7,"");

                break;



        }



        for(int i = 1; i < listOfSolids.size(); i++)

        {



            switch (i)

            {

                case 1: 

                    if((listOfSolids.get(1)).equals("Blue Solid"))

                    { 

                        g.setColor(Color.BLUE);

                        g.fillOval(1050,610,20,20);



                        break;

                    }

                    else 

                    {

                        break;

                    }



                case 2: 

                    if((listOfSolids.get(2)).equals("Green Solid"))

                    {  g.setColor(darkGreen);

                        g.fillOval(1125,160,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 3: 

                    if((listOfSolids.get(3)).equals("Brown Solid"))

                    {  g.setColor(brown);

                        g.fillOval(240,145,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 4:

                    if((listOfSolids.get(4)).equals("Purple Solid"))

                    {  g.setColor(Color.MAGENTA);

                        g.fillOval(210,640,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 5: 

                    if((listOfSolids.get(5)).equals("Orange Solid"))

                    {  g.setColor(orange);

                       g.fillOval(420,420,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 6: 

                    if((listOfSolids.get(6)).equals("Yellow Solid"))

                    {  g.setColor(Color.YELLOW);

                       g.fillOval(620,620,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 7: 

                    if((listOfSolids.get(7)).equals("Red Solid"))

                    {  

                        g.setColor(Color.RED);

                        g.fillOval(140,220,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



            }

        }



    }

    

    public static void drawSolidGame(Graphics g, DrawingPanel frame, Image board,int ballHitStripe, int ballHitSolid)

    {

        Color darkGreen = new Color(2, 94, 11);

        Color brown = new Color(69, 52, 2);

        Color orange = new Color(227, 110, 0);

        ArrayList<String> listOfSolids = new ArrayList<String>();

        listOfSolids.add("");

        listOfSolids.add("Blue Solid");

        listOfSolids.add("Green Solid");

        listOfSolids.add("Yellow Solid");

        listOfSolids.add("Purple Solid");

        listOfSolids.add("Orange Solid");

        listOfSolids.add("Red Solid");

        listOfSolids.add("Brown Solid");



        switch(ballHitSolid)

        {

            case 0:

                break;



            case 1:

                listOfSolids.set(1,"");

                break;



            case 2:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                break;



            case 3:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                break;



            case 4:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                break;



            case 5:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                break;



            case 6:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                listOfSolids.set(6,"");

                break;



            case 7:

                listOfSolids.set(1,"");

                listOfSolids.set(2,"");

                listOfSolids.set(3,"");

                listOfSolids.set(4,"");

                listOfSolids.set(5,"");

                listOfSolids.set(6,"");

                listOfSolids.set(7,"");

                break;



        }



        for(int i = 1; i < listOfSolids.size(); i++)

        {



            switch (i)

            {

                case 1: 

                    if((listOfSolids.get(1)).equals("Blue Solid"))

                    { 

                        g.setColor(Color.BLUE);

                        g.fillOval(1050,610,20,20);



                        break;

                    }

                    else 

                    {

                        break;

                    }



                case 2: 

                    if((listOfSolids.get(2)).equals("Green Solid"))

                    {  g.setColor(darkGreen);

                        g.fillOval(1125,160,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 3: 

                    if((listOfSolids.get(3)).equals("Yellow Solid"))

                    {  

                       g.setColor(Color.YELLOW);

                       g.fillOval(620,620,20,20);

                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 4:

                    if((listOfSolids.get(4)).equals("Purple Solid"))

                    {  g.setColor(Color.MAGENTA);

                        g.fillOval(210,640,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 5: 

                    if((listOfSolids.get(5)).equals("Orange Solid"))

                    {  g.setColor(orange);

                       g.fillOval(420,420,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 6: 

                    if((listOfSolids.get(6)).equals("Red Solid"))

                    { 

                        g.setColor(Color.RED);

                        g.fillOval(140,220,20,20);

                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 7: 

                    if((listOfSolids.get(7)).equals("Brown Solid"))

                    {  

                        g.setColor(brown);

                        g.fillOval(240,145,20,20);

                        

                        



                        break;

                    }

                    else

                    {

                        break;  

                    }



            }

        }

        

        

        

        /*#STRIPES

         * 

         * 

         * 

         * 

         */

        

        

        

        

        

        

        

        //String [] arr = {"","Yellow Stripe","Red Stripe","Orange Stripe","Purple Stripe","Blue Stripe","Brown Stripe","Green Stripe"};

        ArrayList<String> listOfStripes = new ArrayList<String>();

        listOfStripes.add("");

        listOfStripes.add("Yellow Stripe");

        listOfStripes.add("Red Stripe");

        listOfStripes.add("Blue Stripe");

        listOfStripes.add("Brown Stripe");

        listOfStripes.add("Green Stripe");

        listOfStripes.add("Orange Stripe");

        listOfStripes.add("Purple Stripe");



        switch(ballHitStripe)

        {

            case 0:

                break;



            case 1:

                listOfStripes.set(1,"");

                break;



            case 2:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                break;



            case 3:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                break;



            case 4:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                break;



            case 5:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                break;



            case 6:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                listOfStripes.set(6,"");

                break;



            case 7:

                listOfStripes.set(1,"");

                listOfStripes.set(2,"");

                listOfStripes.set(3,"");

                listOfStripes.set(4,"");

                listOfStripes.set(5,"");

                listOfStripes.set(6,"");

                listOfStripes.set(7,"");

                break;



        }



        for(int i = 1; i < listOfStripes.size(); i++)

        {



            switch (i)

            {

                case 1: //"Yellow Stripe"

                    if((listOfStripes.get(1)).equals("Yellow Stripe"))

                    { 

                        g.setColor(Color.YELLOW);

                        g.drawOval(1100,570,20,20);



                        break;

                    }

                    else 

                    {

                        break;

                    }



                case 2: //"Red Stripe":

                    if((listOfStripes.get(2)).equals("Red Stripe"))

                    {  g.setColor(Color.RED);

                        g.drawOval(180,180,20,20);



                        //# + , +

                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 3: // "Blue Stripe":

                    if((listOfStripes.get(3)).equals("Blue Stripe"))

                    {  g.setColor(Color.BLUE);

                        g.drawOval(140,560,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 4://"Brown Stripe":

                    if((listOfStripes.get(4)).equals("Brown Stripe"))

                    {  g.setColor(brown);

                        g.drawOval(286,435,20,20);



                        break;

                    }

                    else

                    {

                        break;  

                    }



                case 5: //"Green Stripe":

                    if((listOfStripes.get(5)).equals("Green Stripe"))

                    {   g.setColor(darkGreen);

                        g.drawOval(630,160,20,20);



                        //# / , -

                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 6: //"Orange Stripe":

                    if((listOfStripes.get(6)).equals("Orange Stripe"))

                    {  g.setColor(orange);

                        g.drawOval(730,300,20,20);



                        //# + , -

                        break;

                    }

                    else

                    {

                        break;  

                    }

                case 7:  //"Purple Stripe":

                    if((listOfStripes.get(7)).equals("Purple Stripe"))

                    {  g.setColor(Color.MAGENTA);

                        g.drawOval(660,620,20,20);



                        //# + , -

                        break;

                    }

                    else

                    {

                        break;  

                    }



            }

        }





        

    }

}