package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash(){
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/icons/splash.jpg"));
        Image imageOne=imageIcon.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(imageOne);
        JLabel imageLabel=new JLabel(imageIcon2);
        add(imageLabel);
//        setSize(1200,600);
//        setLocation(200,100);
        setVisible(true);
        thread=new Thread(this);
        thread.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            //new Login();
            setVisible(false);
        }catch(Exception e){}
    }
    public static void main(String[] args) {
        Splash frame=new Splash();
        int x=1;
        for(int i=1;i<=500;x+=7,i+=6){
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch (Exception e){}
        }
    }
}
