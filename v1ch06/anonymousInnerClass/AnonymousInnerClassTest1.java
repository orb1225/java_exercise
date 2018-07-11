package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class AnonymousInnerClassTest1
{
    public static void main(String[] args)
    {
        TalkingClock1 clock = new TalkingClock1();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}



class TalkingClock1
{
    public void start(int interval,boolean beep)
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is " + new Date());
            }
        };
        Timer t = new Timer(interval,listener);
        t.start();
    }
}