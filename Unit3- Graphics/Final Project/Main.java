import java.awt.*;

import javax.swing.*;



public class Main

{



    public static void main(String[] args)

    {

        DrawingPanel frame = new DrawingPanel(1300,700); //change back to 800

        Graphics g = frame.getGraphics();

        Image board = frame.loadImage("board.png");

        int ballHitStripe = 0;

        int ballHitSolid = 0;



        //#Draws board

        g.drawImage(board,100,100,frame);



        balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

        g.setColor(Color.WHITE);

        g.fillOval(570,350,20,20);

        boolean x = true;

        gameStart(g, frame, board,ballHitStripe, ballHitSolid);

        while(x == true)

        {

            String yesOrNo = JOptionPane.showInputDialog("Do you want to play again?");

            if(yesOrNo.equalsIgnoreCase("yes"))

            {

                gameStart(g, frame, board,ballHitStripe, ballHitSolid);

            }

            else

            {

                JOptionPane.showMessageDialog(null, "Thanks for playing!", null, JOptionPane.INFORMATION_MESSAGE);

                x = false;

            }

        }



    }



    public static void gameStart(Graphics g, DrawingPanel frame, Image board, int ballHitStripe, int ballHitSolid)

    {

        String word = JOptionPane.showInputDialog("Do you want to play as stripes or solids?");

        if(word.equalsIgnoreCase("Stripes"))

        {

            stripeGame(g,frame, board, ballHitStripe, ballHitSolid );



        }

        else if(word.equalsIgnoreCase("Solids"))

        {

            solidGame(g,frame, board, ballHitStripe, ballHitSolid );



        }

        else

        {

            stripeGame(g,frame, board, ballHitStripe, ballHitSolid );



        }  

        _8ball._8ball(g, frame, board);

    }



    public static void stripeGame(Graphics g, DrawingPanel frame, Image board, int ballHitStripe, int ballHitSolid)

    {

        Color darkGreen = new Color(2, 94, 11);

        Color brown = new Color(69, 52, 2);

        Color orange = new Color(227, 110, 0);



        //#Roll to yellow stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval((i*35)+570,(i*14)+350,20,20);



        }

        //#Yellow roll in pocket

        ballHitStripe = 1;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1095,565,20,20);

            g.setColor(Color.YELLOW);

            g.drawOval((i*11)+1100,(i*17)+570,20,20);

        }



        frame.sleep(200); 

        //#Roll to Red Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1095-(i*60),565-(i*25),20,20);



        }



        //#Red roll in pocket



        ballHitStripe = 2;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(195,195,20,20);

            g.setColor(Color.RED);

            g.drawOval(180-(i*12),180-(i*11),20,20); 

        }



        frame.sleep(200); 



        //#Roll to Blue Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(195-(i*3),195+(i*24),20,20);



        }



        //#Blue stripe roll in pocket



        ballHitStripe = 3;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(150,555,20,20);

            g.setColor(Color.BLUE);

            g.drawOval(140-(i*3),560+(i*20),20,20); //125 660

        }



        frame.sleep(200); 



        //#Roll to Brown Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(140+(i*9),560-(i*7),20,20);



        }



        //#Brown stripe roll in pocket



        ballHitStripe = 4;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(275,455,20,20);

            g.setColor(brown);

            g.drawOval(286+(i*23),435-(i*21),20,20); //640 120

        }



        frame.sleep(200); 



        //#Roll to Green Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(286+(i*23),435-(i*17),20,20);



        }



        //#Green stripe roll in pocket



        ballHitStripe = 5;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(631,195,20,20);

            g.setColor(darkGreen);

            g.drawOval(630+(i*2),160-(i*6),20,20); //640 130

        }



        frame.sleep(200); 



        //#Roll to Orange Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(631+(i*6),195+(i*7),20,20);



        }



        //#Orange stripe roll in pocket



        ballHitStripe = 6;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(720,300,20,20);

            g.setColor(orange);

            g.drawOval(730+(i*28),300+(i*23),20,20); //1160 650

        }



        frame.sleep(200); 



        //#Roll to Purple Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(720-(i*4),295+(i*20),20,20);



        }



        //#Purple stripe roll in pocket



        ballHitStripe = 7;

        for(int i = 1; i <= 10; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(660,595,20,20);

            g.setColor(Color.MAGENTA);

            g.drawOval(660-(i*2),620+(i*4),20,20); //640 660

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



        //#Roll to Blue Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(660+(i*26),595+(i*1),20,20);



        }

        //#Blue roll in pocket

        ballHitSolid = 1;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1050,610,20,20);

            g.setColor(Color.BLUE);

            g.fillOval(1050+(i*22),610+(i*10),20,20); //1160 660

        }



        frame.sleep(200); 

        //#Roll to Green Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1050+(i*4),610-(i*30),20,20);



        }



        //#Green roll in pocket



        ballHitSolid = 2;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1110,160,20,20);

            g.setColor(darkGreen);

            g.fillOval(1125+(i*7),160-(i*7),20,20); //1160 125

        }



        frame.sleep(200); 



        //#Roll to Brown Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1110-(i*58),160-(i*1),20,20);



        }



        //#Brown stripe roll in pocket



        ballHitSolid = 3;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(245,145,20,20);

            g.setColor(brown);

            g.fillOval(240-(i*24),145-(i*3),20,20); //120 125

        }



        frame.sleep(200); 



        //#Roll to Purple Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(240-(i*1),145+(i*33),20,20);



        }



        //#Purple stripe roll in pocket



        ballHitSolid = 4;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(225,640,20,20);

            g.setColor(Color.MAGENTA);

            g.fillOval(210-(i*18),640+(i*2),20,20); //120 655

        }



        frame.sleep(200); 



        //#Roll to Orange Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(225+(i*13),640-(i*14),20,20);



        }



        //#Orange stripe roll in pocket



        ballHitSolid = 5;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(420,420,20,20);

            g.setColor(orange);

            g.fillOval(420+(i*14),420-(i*19),20,20); //640 130

        }



        frame.sleep(200); 



        //#Roll to Yellow Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(420+(i*13),420+(i*13),20,20);



        }



        //#Yellow stripe roll in pocket



        ballHitSolid = 6;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(615,615,20,20);

            g.setColor(Color.YELLOW);

            g.fillOval(620+(i*4),620+(i*8),20,20); //640 660

        }



        frame.sleep(200); 



        //#Roll to Red Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(615-(i*31),615-(i*25),20,20); //150 240



        }



        //#Red stripe roll in pocket



        ballHitSolid = 7;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(150,240,20,20);

            g.setColor(Color.RED);

            g.fillOval(140-(i*1),220-(i*18),20,20); //125 130

        }



        frame.clear();

        g.drawImage(board,100,100,frame);

        g.setColor(Color.WHITE);

        g.fillOval(150,240,20,20);



        

    }



    

    

    

    public static void solidGame(Graphics g, DrawingPanel frame, Image board, int ballHitStripe, int ballHitSolid)

    {

        Color darkGreen = new Color(2, 94, 11);

        Color brown = new Color(69, 52, 2);

        Color orange = new Color(227, 110, 0);

        /*# SOLIDS

         * 

         * 

         * 

         * 

         */



        //#Roll to Blue Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(570+(i*32),350+(i*17),20,20);



        }

        //#Blue roll in pocket

        ballHitSolid = 1;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1050,610,20,20);

            g.setColor(Color.BLUE);

            g.fillOval(1050+(i*22),610+(i*10),20,20); //1160 660

        }



        frame.sleep(200); 

        //#Roll to Green Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1050+(i*4),610-(i*30),20,20);



        }



        //#Green solid roll in pocket



        ballHitSolid = 2;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1110,160,20,20);

            g.setColor(darkGreen);

            g.fillOval(1125+(i*7),160-(i*7),20,20); //1160 125

        }



        frame.sleep(200); 



        //#Roll to Yellow Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1110-(i*33),160+(i*30),20,20);



        }



        //#Yellow solid roll in pocket



        ballHitSolid = 3;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(615,610,20,20);

            g.setColor(Color.YELLOW);

            g.fillOval(620+(i*4),620+(i*8),20,20); //120 125

        }



        frame.sleep(200); 



        //#Roll to Purple Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(630-(i*27),610+(i*1),20,20);



        }



        //#Purple solid roll in pocket



        ballHitSolid = 4;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(225,625,20,20);

            g.setColor(Color.MAGENTA);

            g.fillOval(210-(i*18),640+(i*1),20,20); //120 655

        }



        frame.sleep(200); 



        //#Roll to Orange Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(225+(i*13),640-(i*14),20,20);



        }



        //#Orange solid roll in pocket



        ballHitSolid = 5;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(420,420,20,20);

            g.setColor(orange);

            g.fillOval(420+(i*14),420-(i*20),20,20); //640 130

        }



        frame.sleep(200); 



        //#Roll to Red Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(420-(i*18),420-(i*13),20,20); //150 240



        }



        //#Red solid roll in pocket



        ballHitSolid = 6;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(150,225,20,20);

            g.setColor(Color.RED);

            g.fillOval(140-(i*1),220-(i*18),20,20); //125 130

        }



        frame.sleep(200);



        //#Roll to Brown Solid

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(150+(i*7),225-(i*5),20,20);



        }



        //#Brown solid roll in pocket



        ballHitSolid = 7;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(245,145,20,20);

            g.setColor(brown);

            g.fillOval(240-(i*24),145-(i*3),20,20); //120 125

        }



        frame.sleep(200);



        /*# STRIPES

         * 

         * 

         * 

         * 

         * 

         * 

         */



        

        //#Roll to yellow stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval((i*56)+245,(i*28)+145,20,20);



        }

        //#Yellow roll in pocket

        ballHitStripe = 1;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1095,565,20,20);

            g.setColor(Color.YELLOW);

            g.drawOval((i*11)+1100,(i*17)+570,20,20);

        }



        frame.sleep(200); 

        //#Roll to Red Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(1095-(i*60),565-(i*25),20,20);



        }



        //#Red roll in pocket



        ballHitStripe = 2;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(195,195,20,20);

            g.setColor(Color.RED);

            g.drawOval(180-(i*12),180-(i*11),20,20); 

        }



        frame.sleep(200); 



        //#Roll to Blue Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(195-(i*3),195+(i*24),20,20);



        }



        //#Blue stripe roll in pocket



        ballHitStripe = 3;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(150,555,20,20);

            g.setColor(Color.BLUE);

            g.drawOval(140-(i*3),560+(i*20),20,20); //125 660

        }



        frame.sleep(200); 



        //#Roll to Brown Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(140+(i*9),560-(i*7),20,20);



        }



        //#Brown stripe roll in pocket



        ballHitStripe = 4;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(290,440,20,20);

            g.setColor(brown);

            g.drawOval(286+(i*23),435-(i*21),20,20); //640 120

        }



        frame.sleep(200); 



        //#Roll to Green Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(286+(i*23),435-(i*16),20,20);



        }



        //#Green stripe roll in pocket



        ballHitStripe = 5;

        for(int i = 1; i <= 5; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(630,195,20,20);

            g.setColor(darkGreen);

            g.drawOval(630+(i*2),160-(i*6),20,20); //640 130

        }



        frame.sleep(200); 



        //#Roll to Orange Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(630+(i*6),195+(i*9),20,20);



        }



        //#Orange stripe roll in pocket



        ballHitStripe = 6;

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(720,295,20,20);

            g.setColor(orange);

            g.drawOval(730+(i*28),300+(i*23),20,20); //1160 650

        }



        frame.sleep(200); 



        //#Roll to Purple Stripe

        for(int i = 1; i <= 15; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(720-(i*4),295+(i*20),20,20);



        }



        //#Purple stripe roll in pocket



        ballHitStripe = 7;

        for(int i = 1; i <= 10; i++)

        {

            frame.sleep(50);

            frame.clear();

            g.drawImage(board,100,100,frame);

            balls.drawSolidGame(g, frame, board,ballHitStripe, ballHitSolid);

            g.setColor(Color.WHITE);

            g.fillOval(660,595,20,20);

            g.setColor(Color.MAGENTA);

            g.drawOval(660-(i*2),620+(i*4),20,20); //640 660

        }





        frame.clear();

        g.drawImage(board,100,100,frame);

        g.setColor(Color.WHITE);

        g.fillOval(660,595,20,20);



    }

}