import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.*;
 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Graph1{
    private static BufferedWriter writer = null;
    public static void main(String[] args){  
        Function1 panel = new Function1();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        
        
    }
   
}


