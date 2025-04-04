//AWT program for Window Listener

import java.awt.*;
import java.awt.event.*;
public class awtwindow extends Frame implements WindowListener
{
    Frame f1;
    awtwindow()
    {
        setSize(300,300);
        setVisible(true);
        addWindowListener(this);    
    }   
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing");
        System.exit(0);
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window Deactivated");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window Deiconified");
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened");
    }
    public static void main(String[] args) 
    {
        new awtwindow();    
    } 
}
