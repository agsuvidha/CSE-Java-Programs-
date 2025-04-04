// AWT program for grid layout

import java.awt.*;
import java.awt.event.*;
public class awtgrid 
{
    awtgrid()
    {
        Frame f=new Frame();
        Panel p=new Panel();
        f.setSize(400,500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.add(p);
        p.setLayout(new GridLayout(4,7,10,15));
        
        for(int i=1;i<=25;i++)
        {
            Button b=new Button("Button "+Integer.toString(i));
            p.add(b);
        }
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }   
    public static void main(String[] args) 
    {
        awtgrid af=new awtgrid();    
    } 
}
