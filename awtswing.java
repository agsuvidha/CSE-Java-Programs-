//AWT program for Flow Layout

import java.awt.*;
import java.awt.event.*;
public class awtswing 
{
    awtswing()
    {
        Frame f=new Frame();
        Panel p=new Panel();
        f.setSize(400,400);
        f.setVisible(true);
        f.add(p, BorderLayout.SOUTH);

        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");
        Button b4=new Button("Button 4");
        Button b5=new Button("Button 5");
        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        p.setBackground(Color.CYAN);
        
        b1.setBackground(Color.LIGHT_GRAY);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

      
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) 
    {
        awtswing as=new awtswing();
    }    
}
