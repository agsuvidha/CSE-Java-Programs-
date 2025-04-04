// AWT program for ITEM Listener

import java.awt.*;
import java.awt.event.*;

public class awtitem extends Frame implements ItemListener
{
    Checkbox c1,c2;
    Label l1,l2;
    Panel p;    
    awtitem()
    {
        	l1=new Label(" ");
            l2=new Label(" ");
            p=new Panel();
            p.setLayout(null);
           
            l1.setBounds(50,50,200,50);
            l2.setBounds(50,150,200,50);
            c1=new Checkbox("Java");
            c2=new Checkbox("Python");
            c1.setBounds(50,250,50,30);
            c2.setBounds(50,300,50,30);
            add(p);
            setSize(300,400);
            setVisible(true);
            p.add(l1);
            p.add(l2);
            p.add(c1);
            p.add(c2);
            c1.addItemListener(this);
            c2.addItemListener(this);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            l1.setText("Java Checkbox "+(e.getStateChange()==1?"Checked":"Unchecked"));
        }
        else
        {
            l2.setText("Python Checkbox "+(e.getStateChange()==1?"Checked":"Unchecked"));
        }
        
    }
    public static void main(String[] args) 
    {
        new awtitem();    
    }
}
