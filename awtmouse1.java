// AWT program for Mouse Listener

import java.awt.*;
import java.awt.event.*;
public class awtmouse1 extends Frame implements MouseListener
{
    Label l1;
    
    awtmouse1()
    {
        l1=new Label("");
        l1.setBounds(50,50,100,50);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        add(l1);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        addMouseListener(this);    
    }    
    public void mousePressed(MouseEvent e)
    {
        l1.setText("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent e)
    {
        l1.setText("Mouse Clicked");
     
    }
    public void mouseReleased(MouseEvent e)
    {
        l1.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e)
    {
        l1.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l1.setText("Mouse Exited");
    }
    
    

    public static void main(String[] args) 
    {
        new awtmouse1();    
    }
}
