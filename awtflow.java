// AWT program to add Multiple buttons in flow layout 

import java.awt.*;
import java.awt.event.*;
public class awtflow 
{
    awtflow()
    {
        Frame f=new Frame();
        f.setSize(400,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        
        for(int i=1;i<=5;i++)
        {
            Button b=new Button("Button "+Integer.toString(i));
            f.add(b);
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
        awtflow af=new awtflow();    
    } 
}
