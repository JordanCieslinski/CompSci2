import java.awt.*;

import javax.swing.*;



public class _8ball

{

    public static void _8ball(Graphics g, DrawingPanel frame, Image board)

    {

        g.drawImage(board,100,100,frame);



        g.setColor(Color.BLACK);



        g.fillOval(640,400,20,20);



        Font font = new Font("Impact",Font.BOLD, 35);

        g.setFont(font);



        g.setColor(Color.WHITE);

        g.drawString("1",125,150);



        g.drawString("2",640,150);



        g.drawString("3",1155,150);



        g.drawString("4",125,680);



        g.drawString("5",640,680);



        g.drawString("6",1155,680);



        double odds = Math.random();

        //System.out.println(odds);

        String word = JOptionPane.showInputDialog("You haven't won yet! Which pocket do you want to try and shoot the 8 Ball at?\n1 , 2 , 3 , 4, 5, or 6?");

        int input = Integer.parseInt(word);

        

        switch(input)

        {

            case 1:

                g.setColor(Color.WHITE);

                g.fillOval(900,500,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(900-(i*17),500-(i*6),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(645,410,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640-(i*34),400-(i*18),20,20);

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(900-(i*17),500-(i*7),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(645,395,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640-(i*30),400-(i*17),20,20);

                        

                    }

                    

                    

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(645,395,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(190-(i*5),140+(i*5),20,20); //140 190

                        

                    }

                    

                    for(int i = 1; i <= 11; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(645,395,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(140+(i*5),190+(i*5),20,20); //195 240

                        

                    }

                    break;

                }

                else

                {

                    break;

                }

            case 2:

                g.setColor(Color.WHITE);

                g.fillOval(640,550,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(640,550-(i*10),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,405,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400-(i*18),20,20); //640 130

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(640-(i*1),550-(i*10),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(625,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640+(i*2),400-(i*17),20,20);

                        

                    }

                    

                    

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(625,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(670+(i*2),140+(i*6),20,20); //710 200

                        

                    }

                    break;

                }

                else

                {

                    break;

                }

            case 3:

                //430 500

                g.setColor(Color.WHITE);

                g.fillOval(430,500,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(430+(i*14),500-(i*6),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640+(i*34),400-(i*18),20,20); //1160 125

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(430+(i*13),500-(i*7),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(625,395,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640+(i*33),400-(i*15),20,20); //1160 125

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(625,395,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(1135-(i*2),175+(i*4),20,20); //1110 240

                        

                    }

                    break;

                }

                else

                {

                    break;

                }

                    

                

            case 4:

                g.setColor(Color.WHITE);

                g.fillOval(950,240,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(950-(i*20),240+(i*11),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640-(i*34),400+(i*17),20,20); //125 660

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(950-(i*20),240+(i*11),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640-(i*33),400+(i*13),20,20); //1160 125

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(145+(i*5),595+(i*3),20,20); //220 650

                        

                    }  

                    break;

                }

                else

                {

                    break;

                }

            case 5:

                g.setColor(Color.WHITE);

                g.fillOval(640,200,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(640,200+(i*20),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400+(i*26),20,20); 

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(640+(i*2),200+(i*20),20,20);

                        

                    }

                    

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(660,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640-(i*4),400+(i*24),20,20); 

                        

                    }

                    

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(660,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(600-(i*4),640-(i*8),20,20); //540 560

                        

                    }

                    break;

                }

                else

                {

                    break;

                }

            case 6:

                //320 280

                g.setColor(Color.WHITE);

                g.fillOval(320,280,20,20);

                if(odds >= 0.5)

                {

                    //# SHOT MAKES IT

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(320+(i*32),280+(i*12),20,20); 

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(640,400,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640+(i*34),400+(i*17),20,20); //1160 660

                        

                    }

                    break;

                }

                else if (odds < 0.5)

                {

                    //# SHOT MISSES

                    for(int i = 1; i <= 10; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.BLACK);

                        g.fillOval(640,400,20,20);

                        

                        g.setColor(Color.WHITE);

                        g.fillOval(320+(i*33),280+(i*11),20,20); 

                        

                    }

                    

                    for(int i = 1; i <= 15; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(650,390,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(640+(i*30),400+(i*16),20,20); //1090 640

                        

                    }

                    

                    for(int i = 1; i <= 5; i++)

                    {

                        frame.sleep(50);

                        frame.clear();

                        g.drawImage(board,100,100,frame);

                        g.setColor(Color.WHITE);

                        g.fillOval(650,390,20,20);

                        g.setColor(Color.BLACK);

                        g.fillOval(1090+(i*3),640-(i*5),20,20); //1150 600

                        

                    }

                    break;

                }

                else

                {

                    break;

                }

        }

        font = new Font("Impact",Font.BOLD, 250);

        g.setFont(font);  

        g.setColor(Color.WHITE);

        

        if(odds >= 0.5)

        {         

           g.drawString("YOU WIN!",140,550); 

        }

        else if(odds < 0.5)

        {

           g.drawString("YOU LOSE!",140,550); 

        }

        

    }

}

