
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.*;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.LineUnavailableException;

public class Function4 extends JPanel implements Runnable, MouseListener, MouseMotionListener
{
    private int width, height;
    private Thread runner;
    private int x;
    private int y;
    public Function4()
    {
        width = 1000;
        height = 1000;
        setBackground(Color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
        if(runner == null)
        {
            runner = new Thread(this);
            runner.start();
        }
    }
    
    @Override
    public void run()
    {
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
     
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
       
    }
   

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int x = (int) e.getX();
        int y = (int) e.getY(); 
        long t = timestamp.getTime();  
        double function = x - ( y);
          if (y>0 && y<1000 && x>0 && x<1000) {
          Sound wavefunction = new Sound();
          try {
          Sound.createTone((((function+400))), 100, 10000);
         } catch (LineUnavailableException lue) {
            System.out.println(lue);
         }
         System.out.println(x + "," + y + "," + t);
        }
        else {
         System.out.println("Move your cursor closer to the graph");
        }
      
        
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {

    }
    @Override
    public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
        g.setColor(Color.black);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(0, 500, 1000, 500);
        g2.drawLine(500,0, 500, 1000);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        g.drawString("1", 600, 500);
        g.drawString("2", 700, 500);
        g.drawString("3", 800, 500);
        g.drawString("4", 900, 500);
        g.drawString("5", 1000, 500);
        g.drawString("-1", 400, 500);
        g.drawString("-2", 300, 500);
        g.drawString("-3", 200, 500);
        g.drawString("-4", 100, 500);
        g.drawString("-5", 0, 500);
        g.drawString("1", 500, 400);
        g.drawString("2", 500, 300);
        g.drawString("3", 500, 200);
        g.drawString("4", 500, 100);
        g.drawString("5", 500, 0);
        g.drawString("-1", 500, 600);
        g.drawString("-2", 500, 700);
        g.drawString("-3", 500, 800);
        g.drawString("-4", 500, 900);
        g.drawString("-5", 500, 1000);
    }
}