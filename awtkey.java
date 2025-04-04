//AWT program for KEY listener

import java.awt.*;
import java.awt.event.*;

public class awtkey extends Frame implements KeyListener 
{
    Label l1,l2;
    TextArea t1;

    awtkey()
    {
        l1=new Label(" ");
        l2=new Label(" ");
        t1=new TextArea();
        setSize(300,300);
        setVisible(true);
        setLayout(null);
        l1.setBounds(50,50,100,30);
        l2.setBounds(50,150,100,30);
        t1.setBounds(50, 220, 100,100);
        add(l1);
        add(l2);
        add(t1);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        t1.addKeyListener(this);
    }   
    public void keyPressed(KeyEvent e)
    {
        l1.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        l2.setText("Key Released");
        
    }
    public void keyTyped(KeyEvent e)
    {
        t1.setText("Key Typed");
    }
    public static void main(String[] args) 
    {
        new awtkey();    
    } 
}
